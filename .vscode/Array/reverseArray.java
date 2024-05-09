public class reverseArray {
    static void reverse(int arr[],int start,int end){
        int temp;
        while(start<end){
         temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,3,6,7,1};
        System.out.println("before reverse");
        printArray(arr);
        reverse(arr,0,arr.length-1);
        System.out.println("after reverse");
        printArray(arr);
    }
    
}
