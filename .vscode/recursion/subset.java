import java.util.ArrayList;

public class subset {
    public static ArrayList<String> printSubsequence(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;

        }
        char ch=s.charAt(0);
       ArrayList<String> smallAns= printSubsequence(s.substring(1));
        for(String i:smallAns){
            ans.add(i);
            ans.add(ch+i);

        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abc";
       System.out.println(printSubsequence(s));
    }
    
}
