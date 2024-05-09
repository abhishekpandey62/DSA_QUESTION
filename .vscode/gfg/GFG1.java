//Move all negative numbers to beginning and positive to end with constant extra space

public class GFG1 {
    public static void move(int[] arr,int n){
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={-12,23,2,34,-15};
        int n=arr.length;
        move(arr,n);
        for(int i:arr)
        {
            System.out.println(i);
        }

    }
    
}
