# aixcoderNL2CodeDataset

## 介绍
这是用于从自然语言到JAVA代码生成模型的方法级测试数据。

## Dataset
该数据集包括178个手工收集的JAVA编程中高频出现的代码例子，每个例子包括如下字段：
```json
{
"task_id": 166,
"raw_nl": "通过反射为对象的对应字段注入值",
"signature": "public <T> T initByReflect(String name, String value, T t)"
}
```

task_id用于标记是例子序号，raw_nl表示自然语言的描述，signature表示要生成函数的签名，raw_nl和signature共同作为模型的输入。

## 项目结构
```text
nl2code-dataset/src/main/java/com/aixcode/autoTest/evaluation/
    存放自动化测试类，用于对每一个例子进行测试
nl2code-dataset/src/main/java/com/aixcode/autoTest/generate/
    存放模型输出的函数级代码，每个例子需要手动创建一个类
nl2code-dataset/src/main/java/com/aixcode/autoTest/Excutor.java
    自动化测试执行器
nl2code-dataset/src/main/java/com/aixcode/autoTest/predictionHelper.java
    将预测的方法转换为自动化能够测试的类
```

## 使用说明
### 1、下载数据集
### 2、获取模型预测
对每个测试数据，把raw_nl和signature作为输入，获得模型的输出，该输出作为类的唯一方法，类名为prefix+task_id，prefix是用户自定义的。同时该类需要继承GenerateMethodBase类，对于如上的例子，根据模型的预测输出，手动生成如下的类，其中类名为Aixcoder166（Aixcoder+166），同时继承GenerateMethodBase类
```java
public class Aixcoder166 extends GenerateMethodBase {
/**
* 通过反射为对象的对应字段注入值
*/
public<T> T initByReflect(String name, Object value, T t) {
if (null == t) {
throw new NullPointerException("t can not be null");
}

        if (null == value) {
            return null;
        }

        Class<?> clazz = t.getClass();

        if (!clazz.isAssignableFrom(value.getClass())) {
            throw new IllegalArgumentException("value must be assignable to" + clazz);
        }

        try {
            Field field = clazz.getDeclaredField(name);
            field.setAccessible(true);
            field.set(t, value);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("no such field:" + name);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("illegal access:" + name);
        }

        return t;
    }
}
```
上面的过程可以通过批量的方式实现，使用predictionHelper类中的assembleFile方法，即可根据模型的预测输出批量的生成所有的类，每个类需要手动的引入所有要的依赖包。执行如下代码：
```java
public class predictionHelper {
    public static void main(String[] args) {
        assembleFile("src/main/resources/prediction.jsonl");
    }
}
```

### 3、最后执行Excutor 
#### 3.1 执行测试用例可以单次执行一个测试sample
```java
class Excutor{
    //com.aixcode.autoTest.Excutor类中方法
    private static void evaluationOneExample(String basePackage,String prefix,String fileId){
        try {
            int[] result= evaluationGenerateMethod(fileId,basePackage,prefix);
            System.out.println(prefix+" result:"+result[0]+"/"+result[1]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
```

执行上面的例子，可以如下执行调用
```java
class Excutor{
    public static void main(String[] args) {
        try {
            String taskId = "166";
            String basePackage = "com.aixcode.autoTest.generate.aixcoder";
            String prefix = "Aixcoder";
            evaluationOneExample(taskId, basePackage, prefix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

#### 3.2 单次执行所有的测试sample
```java
class Excutor{
    //执行所有的例子，会遍历src/main/java/com/aixcode/autoTest/evaluation下的所有evaluate类
    public static double[] runAllTestV2(String basePackage, String prefix, int minFileId, int maxFileId) {
        try {
            List<String> fileNames = listFiles("src/main/java/com/aixcode/autoTest/evaluation");
            List<String> fileIds = fileNames.stream().map(fileName -> fileName.substring("Evaluation".length(), fileName.lastIndexOf("."))).collect(Collectors.toList());

            double copilot_score = 0;
            int CopilotExacttCount = 0;
            int totalCount = 0;
            for (String fileId : fileIds) {
                if (!(Integer.parseInt(fileId) >= minFileId && Integer.parseInt(fileId) <= maxFileId)) {
                    continue;
                }
                totalCount++;
                int[] result = evaluationGenerateMethod(fileId, basePackage, prefix);
                if (result != null && result.length == 2 && result[1] != 0) {
                    copilot_score += (double) result[0] / result[1];
                    if (result[0] == result[1]) {
                        CopilotExacttCount++;
                    }
                }
            }

            return new double[]{copilot_score, CopilotExacttCount, totalCount};
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new double[]{0, 0, 0};
    }
}
```

执行上面的任务，可以如下执行：
```java
class Excutor {
    public static void main(String[] args) {
        try {
            double[] res=runAllTestV2("com.aixcode.autoTest.generate.aixcoderFirstHalf", "AixcoderAuto", 0, 103);
            System.out.println("result:"+res[0]+"/"+res[1]+"/"+res[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
## 参与贡献
##### Fork 本仓库
##### 新建 Feat_xxx 分支
##### 提交代码
##### 新建 Pull Request