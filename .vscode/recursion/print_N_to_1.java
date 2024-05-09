import java.util.Scanner;

public class print_N_to_1 {
    public  void printDecrement(int n){
        if(n==0 || n==1){
            System.out.println(n);
            return;
            
        }
        System.out.println(n);
        printDecrement(n-1);
    }
    public static void main(String[] args) {
        print_N_to_1 p=new print_N_to_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Your Answer");
        p.printDecrement(n);
    }
    
}
