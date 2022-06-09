package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Evaluation114 extends AbstractBaseEvaluation {

    public Evaluation114(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String,Boolean> map = new HashMap<>(){{
            put("1.txt", true);
            put("2.txt", true);
            put("3.zip", false);
            put("4.js", false);
            put("5.json", false);
        }};
        for (Map.Entry<String,Boolean> entry : map.entrySet()){
            File file = new File(entry.getKey());
            boolean bool = false;
            try {
                file.createNewFile();
                if (entry.getKey().endsWith("txt") && entry.getValue()){
                    //创建zip
                    String fileName = entry.getKey();
                    String zipName= fileName.replace("txt","zip");
                    FileOutputStream fileOutputStream = null;
                    fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write("test".getBytes("utf-8"));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    zipName = new File("").getAbsolutePath() +File.separator +  zipName;
                    zip(zipName,file);
                    bool = true;
                    File zipFile = new File(zipName);
                    if (solution.isValidZip(zipFile) == entry.getValue()) {
                        pass_count++;
                    }
                }else{
                    if (solution.isValidZip(file) == entry.getValue()) {
                        pass_count++;
                    }
                }
            }catch (Exception e) {

            }
            file.delete();
            if (bool){
                String zipName = entry.getKey().replace("txt","zip");
                File f = new File(zipName);
                if (f.exists()){
                    f.delete();
                }
            }
        }
        return new int[]{pass_count,map.size()};
    }
    public static void zip(String zipFileName,File inputFile) throws Exception {
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
