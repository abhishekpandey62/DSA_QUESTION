import java.util.Scanner;

public class print_1_to_N {
    public static void PrintIncement(int n){
        if(n==0 || n==1) {
            System.out.println(n);
            return;
        }
        PrintIncement(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("print Answer");
        PrintIncement(n);
    }
}
