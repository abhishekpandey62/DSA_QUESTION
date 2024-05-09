public class example1 {
    public static void moveAllZero(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] arr={0,5,0,3,4,2};
        moveAllZero(arr,arr.length);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    
}
