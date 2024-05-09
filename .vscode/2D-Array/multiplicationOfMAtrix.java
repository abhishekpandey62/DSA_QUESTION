import java.util.Scanner;

public class multiplicationOfMAtrix {
    public static void Multiplication(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(c1!=r2){
            System.out.println("invalid matrix");
            return;

        }
        int[][] c=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                   
                    c[i][j] +=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
      public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows of a matrix");
       int row=sc.nextInt();
       System.out.println("Enter the coloum  of a matrix");
       int coloum=sc.nextInt();
       int[][] a=new int[row][coloum];
       System.out.println("enter the number of rows of b matrix");
       int row1=sc.nextInt();
       System.out.println("Enter the coloum  of b matrix");
       int coloum1=sc.nextInt();
       int[][] b=new int[row1][coloum1];

       System.out.println("Enter the element of a matrix");
       for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            a[i][j]=sc.nextInt();

        }
        System.out.println();
       }

       System.out.println("Enter the element of  b matrix");
       for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            b[i][j]=sc.nextInt();

        }
        System.out.println();
       }
       Multiplication(a,row,coloum,b,row1,coloum1);
    }
    
}
