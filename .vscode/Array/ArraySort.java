public class ArraySort {
    public static boolean arraySort(int[] arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,12,2};
        System.out.println(arraySort(arr,arr.length));
    }
    
}
