# AiXcoder NL2Code Evaluation Benchmark (aix-bench)

## 介绍

这是用于从自然语言到代码（text-code，自然语言输入，代码输出）生成模型的方法级测试数据，主要用于评估代码生成模型的能力。AiXcoder NL2Code Evaluation Benchmark分为两个数据集：

1. **自动化测试数据集**：这部分数据集中的每个样本包含一个功能独立且表述明确的自然语言功能描述，这个函数的Java函数签名，以及校验这个功能正确性的Java单元测试集合。

    这个数据集的主要用途是自动化地评估模型生成的代码的正确性。

1. **自然语言任务描述数据集**：这部分数据集中的每个样本包含一段相对独立的功能描述。这部分数据更贴近代码中真实的方法描述，包含一些细节不是很明确的功能描述。

    模型生成的代码需要进行人工评估。评估的标准请参考后面的详细介绍。

| 数据集   | Automated Test Dataset 自动化测试数据集 | NL Task Description Dataset 自然语言任务描述数据集 |
|-----------|---------------|---------------------|
| 测试集大小 | 187           | 160                 |

目前这两个数据集仅包含Java代码，自然语言描述部分包含英文和中文两种语言。如果只关注代码正确性的话，可以只使用自动化测试数据集。

## 授权

本项目中的代码使用MIT开源协议。

本项目中的数据使用Computational Use of Data Agreement (C-UDA)授权。

## 引用

如果您使用了这个项目内的代码或数据，建议您这样引用它：

`Yiyang Hao, Ge Li, Yongqiang Liu, Xiaowei Miao, He Zong, Siyuan Jiang, Yang Liu, & He Wei. (2022, June 17). AiXcoder NL2Code Evaluation DataSet: A Dataset for Evaluating Text-to-Code Generation Model. GitHub. Retrieved June 17, 2022, from https://github.com/aixcoder-plugin/nl2code-dataset`

## 自动化测试数据集

数据文件路径：`src/main/resources/dataset_autotest.jsonl`

这些数据是从开源的“方法注释-Java方法实现”中人工挑选出的一批“方法注释”的集合。我们挑选的标准是：

1. 注释比较好地描述了一个可以实现的功能。
1. 函数功能相对独立，不太依赖对项目、业务逻辑等上下文的理解。
1. 功能是合理的且在开发者的日常工作中确实会发生的需求。而不是编程竞赛的题目或课程作业。
1. 注释是针对函数功能的客观描述，而不是对实现过程的表述。

在这个基础上，我们将注释中的描述抽出，然后进行了一些补充，使得：

1. 描述里包含了具体的，为了实现功能所必需的信息。比如：`Returns whether or no the JDK version is high enough.` 里面并没有明确`high enough`的标准。所以我们将它手动补充为`Returns whether or no the JDK version is 1.7u40 and above.`。
2. 删除了和任务无关的描述。例如删除了原始数据`max() that works on three integers. Like many of the other max() functions in this class`中的后半句。

就像真实场景中的一样，自然语言描述中会包含一定的语法错误或标点服务或大小写不一致。我们保留了这些因为我们认为这些扰动可以测试模型的抗干扰能力。

## 自然语言任务描述数据集

数据文件路径：`src/main/resources/dataset_manual_nl.jsonl`

这些数据是从开源的“方法注释-Java方法实现”中人工挑选出的一批“方法注释”的集合。我们挑选的标准是：

1. 注释比较好地描述了一个可以实现的功能。
1. 函数功能相对独立，不太依赖对项目、业务逻辑等上下文的理解。
1. 功能是合理的且在开发者的日常工作中确实会发生的需求。而不是编程竞赛的题目或课程作业。
1. 我们允许一定程度的模糊，比如“Read the encoded image data from a JPEG image.”中，我们并没有说明读出来的数据应该如何处理。在评估时，只要模型生成的代码完全实现了描述中的功能，那么正确性上就算满分。

### 评价标准

我们从三个维度上对模型生成的代码进行人工评估。

正确性：

* 4分：完全实现了指定的功能。
* 3分：实现了主要的功能。但在部分细节上有缺失，不影响整体的逻辑的正确性。稍作修改就可以满足需求。
* 2分：仅实现了主干功能。大多数要求都没有在代码中得到体现。需要较多的修改才能满足需求。
* 1分：完全没有实现指定的功能。

代码质量：

* 3分：细节处理到位。代码从性能上没有明显的更优解。如果可以，资源有相应的释放。没有明显的Code Smell。
* 2分：有轻微遗漏的细节没有处理。有低严重性的Code Smell。
* 1分：代码从性能上有明显的更优解。有严重的Code Smell。

可维护性：

* 5分：方法实现非常规范，变量命名做到语义直白，方法没有不必要的臃肿，可读性好，代码短小，代码块做到层次分明。
* 4分：方法实现比较规范，变量命名基本上做到语义直白，可读性较好。
* 3分：方法实现满足了一定的规范，存在部分变量命名无意义，使用了有缺陷的代码及deprecate方法。
* 2分：方法实现风格混乱，没有遵照一致的规范，且变量命名存在许多无意义的名称，且存在一定的重复及多余的代码。可读性很差。
* 1分：非常混乱，完全没有逻辑，难以读懂代码。


## 数据集

该数据集包括186个手工收集的JAVA编程中高频出现的代码例子，每个例子包括如下字段：

```json
{
"task_id": 166,
"raw_nl": "通过反射为对象的对应字段注入值",
"signature": "public <T> T initByReflect(String name, String value, T t)"
}
```

`task_id`用于标记是例子序号，`raw_nl`表示自然语言的描述，`signature`表示要生成函数的签名，`raw_nl`和`signature`共同作为模型的输入。

### 项目结构

```text
src/main/java/com/aixcode/autoTest/evaluation/
    存放自动化测试类，用于对每一个例子进行测试
src/main/java/com/aixcode/autoTest/generate/
    存放模型输出的函数级代码，每个例子需要手动创建一个类
src/main/java/com/aixcode/autoTest/Executor.java
    自动化测试执行器
src/main/java/com/aixcode/autoTest/predictionHelper.java
    将预测的方法转换为自动化能够测试的类
```

### 使用说明

#### 1、下载数据集

```bash
git clone https://github.com/aixcoder-plugin/nl2code-dataset.git
```

#### 2、获取模型预测

对每个测试数据，把raw_nl和signature作为输入，获得模型的输出，该输出作为类的唯一方法，类名为prefix+task_id，prefix是用户自定义的。同时该类需要继承GenerateMethodBase类，对于如上的例子，根据模型的预测输出，手动生成如下的类，其中类名为Aixcoder166（Aixcoder+166），同时继承GenerateMethodBase类。

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

#### 3、最后执行Executor 

##### 3.1 执行测试用例可以单次执行一个测试sample

```java
class Executor{
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
class Executor{
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

##### 3.2 单次执行所有的测试sample

```java
class Executor{
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
class Executor {
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

* Fork 本仓库
* 新建 Feat_xxx 分支
* 提交代码
* 新建 Pull Request