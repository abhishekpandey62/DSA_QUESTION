import java.util.Scanner;

public class SumOfMatrix {
    public static void sumOfMatrix(int[][] arr1,int[][]arr2,int row,int coloum){
        int[][] sumOfMatrix=new int[row][coloum];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sumOfMatrix[i][j]=arr1[i][j]+arr2[i][j];
               System.out.print(sumOfMatrix[i][j]+" ");
                
            }
            System.out.println();

        }


    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows");
       int row=sc.nextInt();
       System.out.println("Enter the coloum ");
       int coloum=sc.nextInt();
       int[][] arr1=new int[row][coloum];
       int[][] arr2=new int[row][coloum];

       System.out.println("Enter the element of matrix1");
       for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            arr1[i][j]=sc.nextInt();

        }
        System.out.println();
       }

       System.out.println("Enter the element of matrix2");
       for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            arr2[i][j]=sc.nextInt();

        }
        System.out.println();
       }

       
        sumOfMatrix(arr1,arr2,row,coloum);
    }
}
