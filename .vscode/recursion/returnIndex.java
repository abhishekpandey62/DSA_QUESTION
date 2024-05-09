// return idex of the target of the element in array

public class returnIndex {
    public static int printIndex(int[] arr,int tar,int idx){
        if(idx>=arr.length) return -1;
        if(arr[idx]==tar) return idx;
        return printIndex(arr, tar, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={12,32,11,45,63,22};
        int tar=45;
       System.out.println(printIndex(arr,tar,0));
    }
    
}
