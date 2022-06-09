package com.aixcode.autoTest.version1.check;

import com.aixcode.autoTest.version1.BaseAbstractTest;
import com.aixcode.autoTest.version1.aixcoder.Aixcoder116;
import com.aixcode.autoTest.version1.copilot.Copilot116;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Check116 extends BaseAbstractTest {
    public static List<String> inputs= Arrays.asList("ade1990","bg\n","cdjfas;d\n","asdfdfdf\n","");

    @Override
    public int[] checkCopilot() {
        int passCount = 0;
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (String input : inputs) {
                Callable callable=new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        return verifyFileContent(input);
                    }
                };
                Future<Integer> future= executorService.submit(callable);
                try {
                    passCount+=future.get(1,TimeUnit.SECONDS);
                }catch (Exception e){

                }

//                if (future.isDone()){
//                    passCount+=future.get();
//                }else {
//                    future.cancel(true);
//                }
            }
            executorService.shutdownNow();
            if (!executorService.awaitTermination(3, TimeUnit.SECONDS)){
                System.err.println("Pool did not terminate");
            }
            System.out.println(passCount);

        }catch (Exception e){
            e.printStackTrace();
        }


        return new int[]{passCount,5};
    }

    private int verifyFileContent(String content) throws Exception {
        Copilot116 solution=new Copilot116();
        String fileName= "src/com/aixcode/resource/tempFile/tempFile116.txt";
        byte[] b = content.getBytes();
        FileOutputStream outputStream = new FileOutputStream(fileName);
        solution.write(b, 0, b.length, outputStream);
        outputStream.close();
        InputStream inputStream = new FileInputStream(fileName);
        byte[] b1 = new byte[b.length];
        inputStream.read(b1);
        inputStream.close();
        String s = new String(b1);
        s=s.replace("\r","\n");
        System.out.println(content);
        System.out.println(s);
        if(content.equals(s)){
            return 1;
        }
        return 0;
    }

    @Override
    public int[] checkAixcoder() {
        int passCount = 0;
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (String input : inputs) {
                Callable callable=new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        Aixcoder116 solution=new Aixcoder116();
                        String fileName= "src/com/aixcode/resource/tempFile/tempFile116.txt";
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
                        System.out.println(input);
                        System.out.println(s);
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
            System.out.println(passCount);

        }catch (Exception e){
            e.printStackTrace();
        }


        return new int[]{passCount,5};
    }
}
