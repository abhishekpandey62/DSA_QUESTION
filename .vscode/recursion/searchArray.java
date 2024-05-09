// search the element in an array

public class searchArray {
    public static boolean searchElement(int[] arr,int tar,int idx){
        if(idx>=arr.length) return false;
        if(arr[idx]==tar) return true;
        return searchElement(arr, tar, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,32,23,45,56,24};
        int tar=405;
       System.out.println(searchElement(arr,tar,0));
    }
    
}
