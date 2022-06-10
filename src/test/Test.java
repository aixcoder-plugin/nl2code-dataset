import static com.aixcode.autoTest.Excutor.runAllTestV2;

public class Test {
/**
 * 上传一个文件至指定路径pathname下
 */


public static void main(String[] args) {
    try {
        double[] res=runAllTestV2("com.aixcode.autoTest.generate.aixcoderFirstHalf", "AixcoderAuto","aixcoder模型", 0, 103);
        System.out.println("result:"+res[0]+"/"+res[1]+"/"+res[2]);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
