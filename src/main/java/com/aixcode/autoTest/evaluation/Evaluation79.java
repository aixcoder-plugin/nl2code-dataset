package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Evaluation79 extends AbstractBaseEvaluation {
    public static List<String> inputs= Arrays.asList("ade1990","bg\n","cdjfas;d\n","asdfdfdf\n","");

    public Evaluation79(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (String input : inputs) {
                Callable callable=new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        String fileName= "src/main/resources/tempFile/tempFile116.txt";
                        byte[] b = input.getBytes();
                        FileOutputStream outputStream = new FileOutputStream(fileName);
                        solution.write(b, 0, b.length, outputStream);
                        outputStream.close();
                        InputStream inputStream = new FileInputStream(fileName);
                        byte[] b1 = new byte[b.length];
                        inputStream.read(b1);
                        inputStream.close();
                        String s = new String(b1);
                        s=s.replace("\r","\n");
                        if(input.equals(s)){
                            return 1;
                        }
                        return 0;
                    }
                };
                Future<Integer> future= executorService.submit(callable);
                try {
                    passCount+=future.get(1,TimeUnit.SECONDS);
                }catch (Exception e){

                }
            }
            executorService.shutdownNow();
            if (!executorService.awaitTermination(3, TimeUnit.SECONDS)){
                System.err.println("Pool did not terminate");
            }

        }catch (Exception e){
        }


        return new int[]{passCount,5};
    }
}
