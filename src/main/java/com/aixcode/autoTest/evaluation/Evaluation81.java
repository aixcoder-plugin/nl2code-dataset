package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Evaluation81 extends AbstractBaseEvaluation {
    public Evaluation81(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        String project_root_path = "";
        try {
            project_root_path = new File(".").getCanonicalPath();
        }catch (IOException e) {

        }

        int passCount = 0;
        int totalCount = 1;
        try {
            String src_Path_Name = project_root_path + File.separator + "nl2code-dataset/src/main/resources/tempFile/test81/fromDir/";
            String fileName = "file1.tmp";
            File srcFile= new File(src_Path_Name + fileName);
            if (!srcFile.exists()){
                createFileRecursion(src_Path_Name+fileName,0);
            }
            String desPath = project_root_path + File.separator + "nl2code-dataset/src/main/resources/tempFile/test81/toDir/";
            if (new File(desPath+fileName).exists()){
                delFileAndDir(new File(desPath));
            }
            solution.uploadFile(desPath, fileName);
            if (new File(desPath+fileName).exists()){
                passCount++;
            }

        }catch (Exception e){
        }

        return new int[]{passCount,totalCount};
    }

    private static void delFileAndDir(File file){
        if(file.exists()&&file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                if(f.isFile()){
                    f.delete();
                }else {
                    delFileAndDir(f);
                }
                f.delete();
            }
        }
    }

    public static void createFileRecursion(String fileName, Integer height) throws IOException {
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            return;
        }
        if (Files.exists(path.getParent())){
            if (height == 0){
                Files.createFile(path);
            }else {
                Files.createDirectory(path);
            }
        }else {
            createFileRecursion(path.getParent().toString(), height + 1);
            createFileRecursion(fileName,height);
        }
    }
}
