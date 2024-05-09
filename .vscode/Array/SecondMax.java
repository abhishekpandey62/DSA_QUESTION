// second max value in a array'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


public class SecondMax {
    public static int FirstMax(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);

        }
        return max;
    }
   
    public static int secondMaxValue(int[] arr){
        int max=FirstMax(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            if (arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
                
            }
            
        }
        int secondValue=FirstMax(arr,arr.length);
        return secondValue;
    }
    public static void main(String[] args) {
        int[] arr={2,34,1,22,34,66,66};
       System.out.println("second max value: "+secondMaxValue(arr));
    }
    
}
