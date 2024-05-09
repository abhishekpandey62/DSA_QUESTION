public class fibonacciSeries {
   public static int printFibonacciSeries(int n ){
    if(n==0 || n==1) return n;
    return printFibonacciSeries(n-1)+printFibonacciSeries(n-2);
}
    public static void main(String[] args) {
        int n=5;
        System.out.println("Your answer");
        for(int i=0;i<n;i++){
       System.out.println( printFibonacciSeries(i));
        }
    }
    
}
