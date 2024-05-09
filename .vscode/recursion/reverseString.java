public class reverseString {
    public static String reverse(String s,int idx){
        if(idx==s.length()) return "";
         String smallAns=reverse(s, idx+1);
         return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        String s="abhishek";
       System.out.println(reverse(s,0));
    }
}
