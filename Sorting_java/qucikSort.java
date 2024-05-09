package Sorting_java;

public class qucikSort {
    static void disply(int[] arr){
        for(int val:arr)
        System.out.print(val+" ");
    }
   
    static void QucikSort(int[] arr,int st,int end){
        if(st>=end) return;
        int pi=partition(arr,st,end);
        QucikSort(arr, st, pi-1);
        QucikSort(arr, pi+1, end);
    }
    static int partition(int[] arr,int st,int end){
        int pivote=arr[st];
        int count=0;
        for(int i=1;i<end;i++){
            if (arr[i]<=pivote){
                 count++;
            }
        }
            int piIndex=count;
            swap(arr,st,piIndex);
           int i=st;
            int j=end;
            while (i<piIndex && j>piIndex) {
                while (arr[i]<=pivote) i++;
                while (arr[j]>pivote) j--; 
                if(i<piIndex && j>piIndex){
                    swap(arr, i, j);
                    i++;
                    j--;
                }

             }
            return piIndex;
         }
    static void swap(int[] arr,int first,int second){
        int item=arr[first];
        arr[first]=arr[second];
        arr[second]=item;
    }
    
    public static void main(String[] args) {
        int[] arr={7,13,8,5,10,2,4};
    
        int n=arr.length;
        System.out.println("Arry before sorting ");
        disply(arr);
        QucikSort(arr,0,n-1);
        System.out.println();
         System.out.println("Arry After sorting ");
        disply(arr);
    }
    
}
