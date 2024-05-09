import java.util.Scanner;

// for a given matrix "p" of dimension R*C and coordinates (l1,r1) to (l2,r2) return the sum of rectangle from (l1,r1) to (l2,r2)

public class SumOfSubMatrix {
    public static void SumRectangular(int[][] p,int l1,int r1,int l2,int r2){
        if(l2<l1 && r2<r1 && 0>l1 && l2<0 && r1<0 && r2<0 ){
            System.out.println("invalid");
            return;
        }
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum +=p[i][j];
            }
        }
        System.out.println(" sum is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & coloum");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] p=new int[r][c];
        System.out.println("type Element "+r*c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                p[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter l1 & r1");
        int l1=sc.nextInt();
        int r1=sc.nextInt();

        System.out.println("Enter l2 & r2");
        int l2=sc.nextInt();
        int r2=sc.nextInt();

        SumRectangular(p,l1,r1,l2,r2);
    }
    
}
