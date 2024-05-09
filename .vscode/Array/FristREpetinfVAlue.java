import java.util.Arrays;

public class FristREpetinfVAlue {
    //TC=O(nlogn+n)
   /*     public static int  firstRepetingValue(int[] arr,int n){
    Arrays.sort(arr);
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
            return arr[i];
        }
    }
    return -1;
   }*/

   //TC=O(n^2)
   public static int  firstRepetingValue(int[] arr,int n){
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return arr[i];
            }
        }
    }
    return -1;
   }
    public static void main(String[] args) {
        int[] arr={12,22,31,11,22,31};
       System.out.println(firstRepetingValue(arr,arr.length));
    }
}
