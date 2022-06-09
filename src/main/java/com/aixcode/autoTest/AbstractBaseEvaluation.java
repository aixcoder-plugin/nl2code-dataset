package com.aixcode.autoTest;

public abstract class AbstractBaseEvaluation {
    public GenerateMethodBase solution;
    public String basePackage;
    public String prefix;
    public AbstractBaseEvaluation(String basePackage,String prefix) {
        this.basePackage = basePackage;
        this.prefix = prefix;
        solution=loadClass(basePackage,prefix);
    }
    public abstract int[] evaluation();
    public String getTaskId(){
        String className = this.getClass().getName();
        return className.substring(className.lastIndexOf(".")+"Evaluation".length()+1);
    }
    public GenerateMethodBase loadClass(String basePackage,String prefix) {
        String className= basePackage + "." + prefix+getTaskId();
        try {
            return (GenerateMethodBase)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e){
            System.out.println("Caution!!! class not found:"+className);
            e.printStackTrace();
            System.exit(1);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
