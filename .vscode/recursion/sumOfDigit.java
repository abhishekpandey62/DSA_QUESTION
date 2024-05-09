public class sumOfDigit {

    //sum of digit of a number
   public static int sumOfDigit1(int n){
    if(n==0){
        return n;
    }
    return sumOfDigit1(n/10)+n%10;

    
   }
    public static void main(String[] args) {
        int n=4653;
       System.out.println( sumOfDigit1(n));
    }
}
