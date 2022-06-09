
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;


//***java 动态编译。
public class TrendsJava {

    public static void main(String[] args) {


        try {
            String methodCode=readGenerateMethod("src/com/aixcode/autoTest/LineNum398Method.txt");
            String checkCode=readGenerateMethod("src/com/aixcode/autoTest/LineNum398.txt");
            run(methodCode+"\n"+checkCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readGenerateMethod(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(new FileReader(fileName))) {
            while (sc.hasNextLine()) {  //按行读取字符串
                String line = sc.nextLine();
                sb.append(line+"\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    private synchronized static File compile(String code) throws Exception {
        File file = File.createTempFile("JavaRuntime", ".java", new File(Constants.BASEDIR));
//        file.deleteOnExit();
// 获得类名
        String classname = getBaseFileName(file);
// 将代码输出到文件
        PrintWriter out = new PrintWriter(new FileOutputStream(file));
        out.println(getClassCode(code, classname));
        out.close();


// 编译生成的java文件
        String[] cpargs = new String[] { "-d",Constants.BASEDIR, file.getName()};

        System.out.println(System.getProperty("user.dir"));
        //动态编译
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        int status = javac.run(null, null, null, "-d", Constants.BASEDIR,Constants.BASEDIR+file.getName());
        if (status != 0) {
            throw new Exception("语法错误！");
        }
        return file;
    }
    private static synchronized void run(String code) throws Exception {
        String classname =getBaseFileName(compile(code));
        new File(Constants.BASEDIR + classname +Constants.SUFFIX)
                .deleteOnExit();
        try {
            MyClassLoader loader = new MyClassLoader();

            Class cls =  loader.findClass(classname);
            Method main = cls.getMethod("check", null);
            Object res=main.invoke(cls.getDeclaredConstructor().newInstance(), null);
            int[] result = (int[]) res;
            System.out.println(Arrays.toString(result));
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    //将一块代码封装到 method函数中
    private static String getClassCode(String code, String className) {
        StringBuffer text = new StringBuffer();
        text.append("import java.util.*;\n");
        text.append("public class " + className + "{\n");
//        text.append(" public static void method(){\n");
//        text.append(" " + code + "\n");
//        text.append(" }\n");
        text.append(code);
        text.append("}");
        return text.toString();
    }
    private static String getBaseFileName(File file) {
        String fileName = file.getName();
        if(fileName.contains(".")){
            return fileName.split("\\.")[0];
        }else {
            return fileName;
        }

    }
}


