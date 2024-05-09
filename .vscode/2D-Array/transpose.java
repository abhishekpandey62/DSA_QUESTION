import java.util.Scanner;

public class transpose {
    public static void transposrOfMAtrix(int[][] a,int r,int c){

        // ye vala square & non-square dono me lagu hoge 
        // int[][] ans=new int[c][r];
        // for(int i=0;i<c;i++){
        //     for(int j=0;j<r;j++){
               
        //         ans[i][j]=a[j][i];
        //         System.out.print(ans[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //swap the element;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

        // ye sirf square me hi lagu hoge

            int temp;
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
               temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
               
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int row=sc.nextInt();
        System.out.println("Enter the coloum ");
        int coloum=sc.nextInt();
        int[][] a=new int[row][coloum];
        System.out.println("Enter the element of Matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        transposrOfMAtrix(a,row,coloum);
    }
}
