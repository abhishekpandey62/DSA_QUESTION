import java.util.Scanner;

public class SpiralOrder {
    public static void PrintSpiralOrder(int[][] p,int r,int c) {
        int topRow=0,bottemRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement=0;

        while(totalElement<r*c){
            // Top Row print
            for(int i=topRow;i<=rightCol && totalElement<r*c;i++){
                System.out.print(p[topRow][i]+" ");
                totalElement++;

            }
            topRow++;
            // right col print
            for(int j=topRow;j<=bottemRow  && totalElement<r*c;j++){
                System.out.print(p[j][rightCol]+" ");
                totalElement++;
            }
            rightCol--;
            // bottem row print
            for(int i=rightCol;i>=leftCol  && totalElement<r*c;i--){
                System.out.print(p[bottemRow][i]+" ");
                totalElement++;
            }
            bottemRow--;

            // lift coloum print
            for(int i=bottemRow;i>=topRow  && totalElement<r*c;i--){
                System.out.print(p[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;


        }


        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row & coloum");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] p=new int[r][c];

        System.out.println("Enter "+r*c+" Element");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                p[i][j]=sc.nextInt();

            }
            System.out.println();
        }
        PrintSpiralOrder(p,r,c);
    }
}
