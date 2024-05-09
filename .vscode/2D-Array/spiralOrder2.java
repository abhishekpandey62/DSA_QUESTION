import java.util.Scanner;

// generate a n*n matrix filled with elements 1 to n^2 in spiral order

public class spiralOrder2 {


    public static int[][] print(int n){
        int[][] p=new int[n][n];
      
            int topRow=0,bottemRow=n-1,leftCol=0,rightCol=n-1;
            int totalElement=1;
    
            while(totalElement<=n*n){
                // Top Row print
                for(int i=topRow;i<=rightCol && totalElement<=n*n;i++){
               System.out.print(p[topRow][i]=totalElement++ );
               System.out.print(" ");
    
                }
                topRow++;
                // right col print
                for(int j=topRow;j<=bottemRow  && totalElement<=n*n;j++){
                System.out.print(p[j][rightCol]=totalElement++ );
                System.out.print(" ");
                }
                rightCol--;
                // bottem row print
                for(int i=rightCol;i>=leftCol  && totalElement<=n*n;i--){
                System.out.print(p[bottemRow][i]=totalElement++ );
                System.out.print(" ");
                }
                bottemRow--;
    
                // lift coloum print
                for(int i=bottemRow;i>=topRow  && totalElement<=n*n;i--){
                    System.out.print(p[i][leftCol]=totalElement++ );
                    System.out.print(" ");
                }
                leftCol++;
    
    
            }
            return p;
    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        print(n);
        
    }
    
}
