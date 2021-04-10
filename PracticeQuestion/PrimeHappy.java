
package PracticeQuestion;
public class PrimeHappy{
   public static void main(String... args){
                  System.out.println(primeHappy(8));
}
    public static int primeHappy(int n) {
        int sum=0;
        int checkPrime=0;
        if(n>2){
            for(int i=2;i<n;i++){
             for(int j=1;j<=n;j++){
                if(i%j==0){
                    checkPrime++;
                 } 
               }
             if(checkPrime==2)
                 sum+=i;
             checkPrime=0;
            }
        
        if(sum>0&&sum%n==0)
           return 1;
        else
            return 0;

        }
        else
            return 0;
    }
}
