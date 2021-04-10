
package PracticeQuestion;

public class Holder {
    
  public static void main(String... args){

       System.out.println(isHolder(5));
    }
    static int isHolder(int n){
        int checkPrime=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                checkPrime++;
        }
        int num=1;
        if(checkPrime!=0)
            return 0;
        else{
            while(true){
                num=num*2;
                if(num-1==n){
                    return 1;
                }
                else if(num-1>n)
                    return 0;
            }
             
        }
        
    }
}

