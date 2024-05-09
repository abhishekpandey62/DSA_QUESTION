import java.util.Scanner;

public class pascalTrangial {
    public static int[][] pascal(int n){
        int[][] p=new int[n][];
        for(int i=0;i<n;i++){
            p[i]=new int[i+1];
            p[i][0]=p[i][i]=1;
            for(int j=1;j<i;j++){
                p[i][j]=p[i-1][j-1]+p[i-1][j];
            }

        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
       int[][] ans= pascal(n);
       System.out.println("your pascal Array");
       for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
       }
    }
}
