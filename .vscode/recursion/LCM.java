import java.util.Scanner;

public class LCM {
     public static int gcd(int x,int y){
        if(y==0) return x;
       return gcd(y, x%y);
       

    }
    public static int lcm(int x,int y){
        int c=gcd(x, y);
         return (x*y)/c;
    }
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X & Y value");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(lcm(x,y));
    }
    
}
