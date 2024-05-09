public class factorial {
  public static long  printFactorial(int n){
    if(n==0 || n==1)
    return n;
    return printFactorial(n-1)*n;
  }
   
    public static void main(String[] args) {
        int n=15;
        System.out.println("your Answer");
       System.out.println(printFactorial(n));

    }
    
}
