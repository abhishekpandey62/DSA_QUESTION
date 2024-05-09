// REmove all the occurrence of "a" from string S="abcax"

public class removeElement {
    public static String removeElementfString(String s,int idx){
        if(idx==s.length()) return "";
        String smallAns=removeElementfString(s, idx+1);
        char ch=s.charAt(idx);
        if(ch!='h'){
        smallAns= ch+smallAns;
        }
        return smallAns;
        
    }
    public static void main(String[] args) {
        String s="abhishek";
       System.out.println(removeElementfString(s,0));
    }
    
}
