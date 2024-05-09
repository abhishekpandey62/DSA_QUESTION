public class sumOf_N_natural {

    //sum of N natural Number
    public static int sumOf_N_naturalNumber(int n){
        if(n==0) return 0;
       return sumOf_N_naturalNumber(n-1)+n;
    }
    public static void main(String[] args) {
        int n=6;
       System.out.println( sumOf_N_naturalNumber(n));
    }
    
}
