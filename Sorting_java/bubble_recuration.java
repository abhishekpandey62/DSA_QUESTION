public class bubble_recuration {
    public static void BubbleSort_rec(int a[],int n){
        if(n==1) return;
       
        
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
               
            }
        }
       
             BubbleSort_rec(a, n-1);

    }
    public static void main(String[] args) {
        int a[]={1,4,2,44,22};
        BubbleSort_rec(a,a.length);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    }
    

