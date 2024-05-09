public class retateArray {
   /* public static int[] rotate(int[] arr,int k){
        int n=arr.length;
        int[] arr2=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            arr2[j++]=arr[i];

        }
        for(int i=0;i<n-k;i++){
            arr2[j++]=arr[i];

        }
        return arr2;
        
    }*/
    // TC=O(n)   & no extra space include
    public static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int j=n-k;
        int i=0,temp;
        while (i<n-k-1 && j<n) {
            temp=arr[i];
            arr[i++]=arr[j];
            arr[j++]=temp;

            
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=5;
        System.out.println("befor applying array");
        for(int i:arr){
         System.out.print(i+" ");
        }
      
         rotate(arr,k);
       System.out.println("\nafter applying array");
       for(int i:arr){
        System.out.print(i+" ");
       }
     

    }
}
