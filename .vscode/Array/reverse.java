public class reverse {
    public static void reverseArray(int[] arr,int n){
        int i=0,j=n-1,temp;
        while (i<j) {
            temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
           }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArray(arr,arr.length);
        for(int i:arr){
            System.out.println(i);
        }
    }
    
}
