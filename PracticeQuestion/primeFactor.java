
package PracticeQuestion;

public class primeFactor 
{
    public static void main(String... args){
       int[] ret=primeFactorList(5);
       for(int i=0;i<ret.length;i++){
           System.out.print(ret[i]);
       }
    }
    static int[] primeFactorList(int n){
        int size=0;
        int orginal_num=n;
        int number=n;
        if(n<=1)
            return null;
        else{
            for(int i=2;i<orginal_num;i++){
                while(n%i==0)
                {
                    size++;
                    n=n/i;
                }         
            }
            System.out.println(size);
            int[] arr=new int[size];
            for(int i=2,j=0;i<orginal_num;i++,j++){
                while(number%i==0)
                {
                    arr[j]=i;
                    number=number/i;
                }
            }
            return arr;
        }
        
    }
}
