

 public class subset2 {
    public static void printSubsequence(String s,String t){
       
        if(s.length()==0){
            System.out.println(t);
            return;

        }
        char ch=s.charAt(0);
      String remString=s.substring(1);
        printSubsequence(remString, ch+t);
        printSubsequence(remString, t);
    }
    public static void main(String[] args) {
        String s="abc";
       printSubsequence(s,"");
    }
    
}
