public class power {

    // how to calculate P^q
   public static int power(int p,int q){
    if(q==0){
        return 1;
    }
   return power(p, q-1)*p;
  
   }
    public static void main(String[] args) {
        int p=2,q=4;
        System.out.println("your answer");
        System.out.print(p+"^"+q+"=");
        System.out.println(power(p,q));
    }
    
}
