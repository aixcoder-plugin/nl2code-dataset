package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Evaluation144 extends AbstractBaseEvaluation {
    public Evaluation144(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        try{
            String zipFileName = "src/main/com/aixcode/resource/tempFile/test144/data144.zip";
            String zipBackupFileName = "src/main/com/aixcode/resource/tempFile/test144/data144.zip.bak";
            File zipFile = new File(zipFileName);
            if (!zipFile.exists()){
                File zipBackupFile=new File(zipBackupFileName);
                Files.copy(zipBackupFile.toPath(),zipFile.toPath());
            }
            String destPath = "src/main/com/aixcode/resource/tempFile/test144/desDir";
            File destFile=new File(destPath);
            deleteFile(destFile);
            solution.extractAll(destPath,zipFileName);
            destFile=new File(destPath);
            File[] files=destFile.listFiles();
            if (files!=null
                    &&files.length==3){
                List<String> fileNames= Arrays.asList(files[0].getName(),files[1].getName(),files[2].getName());
                if (fileNames.contains("file1.txt")
                        &&fileNames.contains("file2.txt")
                        &&fileNames.contains("file3.txt")){
                    passCount++;
                }
            }

        }catch(Exception e){
        }


        return new int[]{passCount,1};
    }

    public static void deleteFile(File file){
        if (file == null || !file.exists()){
            return;
        }
        File[] files = file.listFiles();
        for (File f: files){
            if (f.isDirectory()){
                deleteFile(f);
            }else {
                f.delete();
            }
        }
    }

}
