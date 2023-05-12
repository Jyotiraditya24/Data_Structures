package Recursion.SubsetQuestion;

public class BasicStringQ1 {
    public static void main(String[] args) {
    String str = "aabbcc";
//    System.out.println(removeA(str));
    skipA("",str);

    }
//    give me another string which has removed all a's from it
    public static String removeA(String str){
        String ans = "";
       if(str.length()==0){
           return "";
       }
       if(str.charAt(0)=='a'){
          ans = "";
       }
       else ans = String.valueOf(str.charAt(0));
       return ans + removeA(str.substring(1));
    }

    public static void skipA(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch =='a'){
           skipA(p,up.substring(1));
        }else {
            skipA(p+ ch, up.substring(1));
        }
    }

    public static void skipApple(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.startsWith("apple")){
            skipA(p,up.substring(5));
        }else {
            skipA(p+up.charAt(0) , up.substring(1));
        }
    }
}
