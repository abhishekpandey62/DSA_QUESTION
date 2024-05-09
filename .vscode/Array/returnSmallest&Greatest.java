 class returnSmallest {
     public static int[] SmallGre(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
            min=Math.min(min, arr[i]);
        
            
        }
        int[] ans={max,min};
        return ans;
     }
    public static void main(String[] args) {
        int arr[]={2,3,1,55,23};
      int aa[]=SmallGre(arr,arr.length);
      for(int i:aa){
        System.out.println(i);
      }
    }
    
}
