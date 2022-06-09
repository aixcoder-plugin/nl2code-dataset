package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Evaluation126 extends AbstractBaseEvaluation {

    public Evaluation126(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String, String> map = new HashMap<>(){{
            put("1.txt","1.zip");
            put("2.txt","2.zip");
            put("3.txt","3.zip");
            put("4.txt","4.zip");
            put("5.txt","5.zip");

        }};
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                File file = new File(entry.getKey());
                if (!file.exists()){
                    file.createNewFile();
                }
                String zipName = entry.getValue();
                String gen = new File("").getAbsolutePath();
                zipName = new File("").getAbsolutePath() +File.separator +  zipName;
                zip(zipName,file);
                file.delete();
                solution.unzip(zipName,gen);
                File f = new File(entry.getKey());
                if (file.exists()){
                    pass_count++;
                }
                File zip = new File(zipName);
                zip.delete();
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
    public static void zip(String zipFileName, File inputFile) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(out, inputFile,"");
        out.flush();
        out.close();
    }
    public static void zip(ZipOutputStream out, File f, String base) throws Exception {
        if (f.isDirectory()){
            File[] f1 = f.listFiles();
            out.putNextEntry(new ZipEntry(base + "/"));
            base = base.length() == 0 ? "" : base +"/";
            for (int i = 0; i < f1.length; i++){
                zip(out,f1[i],base + f1[i].getName());
            }
        }else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in = new FileInputStream(f);
            int b ;
            while ((b = in.read())!= -1){
                out.write(b);
            }
            in.close();
        }
    }
}
