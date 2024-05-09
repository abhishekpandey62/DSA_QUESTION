public class SumOfAllSubset {
    public static void SumOfAllSubset1(int[] arr,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        SumOfAllSubset1(arr,n,idx+1,sum+arr[idx]);
        SumOfAllSubset1(arr,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
    SumOfAllSubset1(arr,arr.length,0,0);
    }
    
}
