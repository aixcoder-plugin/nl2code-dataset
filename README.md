# aixcoderNL2CodeDataset

#### 介绍
这是用于从自然语言到JAVA代码生成模型的方法级测试数据。

#### Dataset  
该数据集包括104个手工收集的JAVA编程中高频出现的代码例子，每个例子包括如下字段：


```
{
  "line_num": 114,
  "raw_nl": "max() that works on three integers. Like many of the other max() functions in this class",
  "signature": "public static float max(float a, float b, float c) "
}
```
line_num用于标记是例子序号，raw_nl表示自然语言的描述，signature表示要生成函数的签名，raw_nl和signature共同作为模型的输入。








#### 使用说明

1.  下载数据集 
2.  对每个测试数据，把raw_nl和signature作为输入，获得模型的输出，该输出作为类的唯一方法，类名为prefix+line_num,如下

```
public class Aixcoder114 {
    /**
     * max() that works on three integers. Like many of the other max() functions in this class
     */
    public static float max(float a, float b, float c) {
        float max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }
}
```

3.  最后执行Excutor

```
Excutor
```




#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request
