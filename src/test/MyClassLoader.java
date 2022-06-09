import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//重写类加载器达到加载指定目录的类
class MyClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) {

        String myPath =new File( Constants.BASEDIR+ name + Constants.SUFFIX).toURI().toString();
        System.out.println(myPath);
        byte[] cLassBytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(myPath));
            cLassBytes = Files.readAllBytes(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        Class clazz = defineClass(name, cLassBytes, 0, cLassBytes.length);
        return clazz;
    }

}
