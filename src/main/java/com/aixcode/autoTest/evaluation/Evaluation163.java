package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Evaluation163 extends AbstractBaseEvaluation {
    public Evaluation163(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        try {
            String srcPath="src/main/com/aixcode/resource/tempFile/test163/srcDir/";
            String fileName="dir1"+File.separator+"dir2"+File.separator+"file1.tmp";
            File srcFile= new File(srcPath+fileName);
            if (!srcFile.exists()){
                createFileRecursion(srcPath+fileName,0);
            }
            String desPath="src/main/com/aixcode/resource/tempFile/test163/desDir/";
            if (new File(desPath+fileName).exists()){
                delFileAndDir(new File(desPath));
            }
            solution.move(new File(srcPath).toPath(), new File(desPath).toPath());
            if (new File(desPath+fileName).exists()){

                return new int[]{1,1};
            }

        }catch (Exception e){

        }


        return new int[]{0,1};
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
