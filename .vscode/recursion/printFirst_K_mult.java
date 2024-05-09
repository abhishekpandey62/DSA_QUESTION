public class printFirst_K_mult {
    public static void printFirst_K_multiply(int num,int k){
        if(num==0 || k==0) {
           
            return;

        }
        printFirst_K_multiply(num, k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        int num=12,k=5;
        printFirst_K_multiply(num,k);
        
    }
}
