// given an integer array return the prefix sum/running sum in the same array'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

public class sumOfPrefix {
    public static int[] sumOfArrayPrefix(int[] arr,int n){
        for(int i=1;i<n;i++){
            arr[i] +=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5};
        
        sumOfArrayPrefix(arr,arr.length);
        for(int j:arr){
            System.out.println(j);
        }

    }
}
