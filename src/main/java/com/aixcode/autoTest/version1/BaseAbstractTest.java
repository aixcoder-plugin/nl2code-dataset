package com.aixcode.autoTest.version1;

public abstract class BaseAbstractTest {
    /**
     * 这里对模型生成的方法进行测试
     * 例如：检验用户名是否合法，只能包括a-z,A-Z,0-9和下划线_，不能以下划线结尾 用户名有最小长度和最大长度限制，比如用户名必须是4-20位
     * public static boolean checkUsername(String username) {
     *         if (username.length() < 4 || username.length() > 20) {
     *             return false;
     *         }
     *         for (int i = 0; i < username.length(); i++) {
     *             char c = username.charAt(i);
     *             if (c != '_' && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
     *                 return false;
     *             }
     *         }
     *         return true;
     *     }
     ***********************下面是需要自己写的测试方法，上面是模型生成的方法，不需要自己写*******************
     *
     *
     *  public int[] check(){
     *      Map<String,Boolean> map = new HashMap<String,Boolean>();
     *      map.put("ade1990",true);
     *      map.put("bg",false);
     *      map.put("cdjfas\;d",false);
     *      map.put("sa_19dsajfasd",true);
     *      map.put("____________",true);
     *      int pass_count = 0;
     *
     *      for(Map.Entry<String,Boolean> entry:map.entrySet()){
     *          try{
     *              if(checkUsername(entry.getKey()) == entry.getValue()){
     *                  pass_count++;
     *              }
     *              //assertEquals(checkUsername(entry.getKey()),entry.getValue());
     *          }catch(Exception e){
     *
     *          }
     *      }
     *
     *
     *      return new int[]{pass_count,map.entrySet().size()};
     *  }
     * @return
     */
    public abstract int[] checkCopilot();
    public abstract int[] checkAixcoder();
}
