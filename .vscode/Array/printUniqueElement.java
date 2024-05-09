public class printUniqueElement {
    public static void print(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]<0){
            for(int j=i+1;j<n;j++){
                if(arr[j]<0){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
            }

        }

        }
        for(int k=0;k<n;k++){
            if(arr[k]>0){
                System.out.println(arr[k]);
            }
        }

        
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3};
        print(arr,arr.length);
    }
}
