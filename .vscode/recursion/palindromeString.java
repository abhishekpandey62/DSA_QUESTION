
public class palindromeString {
     public static boolean isPalindrome(String s,int l,int r){
        if(l>=r) return false;
         isPalindrome(s, l+1, r-1);
        return s.charAt(l)==s.charAt(r);
    }
   
    public static void main(String[] args) {
        String s="abhishek";
       System.out.println(isPalindrome(s,0,s.length()-1));

      
        
        
    }
    
}
