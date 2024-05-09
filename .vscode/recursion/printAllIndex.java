import java.util.ArrayList;


public class printAllIndex {

    //return the indexes of the element of the array


  /*   public static void printAllIndexes(int[] arr,int target,int idx){
        if(idx>=arr.length) return;
        if(arr[idx]==target)
        System.out.print(idx+" ");

         printAllIndexes(arr, target, idx+1);

    } */

    // return arraylist if the indexes of the element where element is present 
public static ArrayList<Integer> printAllIndexes(int[] arr,int target,int idx){
    ArrayList<Integer> ans=new ArrayList<>();
    if (idx>=arr.length) return ans;
    
    if(arr[idx]==target)
    ans.add(idx);

    ArrayList<Integer> smallAns=printAllIndexes(arr, target, idx+1);

     ans.addAll(smallAns);
     return ans; 
}

    public static void main(String[] args) {
        int arr[]={12,14,12,15,12};
        int x=12;
        // printAllIndexes(arr,x,0);
       ArrayList<Integer> ans= printAllIndexes(arr,x,0);
       for(int i:ans){
        System.out.println(i);
       }
    }
}
