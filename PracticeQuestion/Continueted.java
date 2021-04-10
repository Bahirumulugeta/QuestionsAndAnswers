
package PracticeQuestion;
public class Continueted {
public static void main(String... args){ 
   
         System.out.print(checkContinued(13332,4));
}
    public static int checkContinued(int n,int catlen) {
        int temporary,individualNum;int sum=0;
        int number=n;
        while(n>0){
            individualNum=n%10;
            temporary=0;
            for(int i=1;i<=catlen;i++){
                temporary=temporary*10+individualNum;
            }
            n=n/10;
            sum=sum+temporary;
        }
        if(sum==number)
            return 1;
        else
          return 0;
    }
}

