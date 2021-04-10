
package From_60_to_80_page;

import java.util.Scanner;
public class Page60_2 {
    public static void main(String... arg){
        Scanner in=new Scanner(System.in);
           int array[]={0,4,8};
           int ans=isMagicArray(array);
           if(ans==1){
               System.out.print("it is magic array");
           }
           else{
                 System.out.print("it is not magic array");

           }
    }
    public static int isMagicArray(int[] num){
        int sum=0;
        int temp;
       for(int i=0;i<num.length;i++)
        {
          temp=isPrime(num[i]);
          if(temp==1)
            {
                 sum+=num[i]; 
            }
        }
        if(sum==num[0])
        {
            return 1;
        }
        else{
            if(num[0]==0&&sum==0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public static int isPrime(int arg){
        int sum=0;int result;
        for(int i=1;i<=arg;i++)
            {
                  result=arg%i;
                  if(result==0)
                    {
                     sum++;
                    }
                  else
                    {
                      continue;
                    }
            }
        if(sum==2)
            {
                 return 1;
            }
          else
            {
              return 0;
            }
    }
}
