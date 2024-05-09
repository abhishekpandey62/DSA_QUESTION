public class printPaire {

    // print the paire whose sum=target
    public static void printPairs(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,4,6,7,5};
        int target=7;
        printPairs(arr,target);
    }
    
}
