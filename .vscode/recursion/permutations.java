public class permutations {
    public static void printParmutations(String s, String t){
        if(s.equals("")){
            System.out.println(t);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);  //b
            String left=s.substring(0, i);  //A
            String right=s.substring(i+1);      //C
            printParmutations(left+right, t+ch);
        }

    }

    //time & space =O(n*n!)
    public static void main(String[] args) {
        String s="Abhi";
        printParmutations(s,"");
    }
    
}
