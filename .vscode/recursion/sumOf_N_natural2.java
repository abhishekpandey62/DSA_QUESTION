public class sumOf_N_natural2 {
    // sum = 1-2+3-4+5-6
    public static int sumOf_N_natural2(int n){
        if(n==0) return 0;
        if(n%2==0){
            return sumOf_N_natural2(n-1)-n;
        }
        else{
            return sumOf_N_natural2(n-1)+n;
        }

    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(sumOf_N_natural2(n));
    }
    
}
