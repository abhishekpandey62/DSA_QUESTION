import java.util.Scanner;

public class rotate360 {
    // transpose """"""""""""""""""""""""""""""""""""""""""""""""""""""""""""
    public static int[][] Transpose(int[][] a,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
               
                ans[i][j]=a[j][i];
            }
            System.out.println();
        }
        return ans;

    }
    // reverse"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
    public static void reverse(int[] arr){
        int i=0,j=arr.length-1,temp;
        while(i<j){
            temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        

        }
    }
    // print """""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
    public static void print(int[][] ans){
        for(int i=0;i<ans[0].length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] a,int r,int c){
        // transpose 
       int[][] ans= Transpose(a, r, c);

       // reverse the rows
       for(int i=0;i<ans[0].length;i++){
       reverse(ans[i]);
       }
       // print
       print(ans);

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
        rotate(a, row, coloum);
        
    }
    
}
