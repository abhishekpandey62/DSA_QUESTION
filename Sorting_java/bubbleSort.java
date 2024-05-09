public class bubbleSort {
    public static void BubbleSort(int a[],int n){
        for(int i=0;i<n-1;i++){
            boolean flg=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flg=true;
                }
            }
            if(flg==false) return;

        }
    }
    public static void main(String[] args) {
        int a[]={1,4,2,44,222};
        BubbleSort(a,a.length);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    
}
