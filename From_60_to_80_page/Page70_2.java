
package From_60_to_80_page;

public class Page70_2 {
   
 public static void main(String... args){
        int[] arr={4,12,9,0,0,3};
     int ret=Meera(arr);
        if(ret==1){
            System.out.print("it is meera array");
        }else
            System.out.print("it is not meera array");
    }
    public static int Meera(int[] a) {
        int retValue=0;int p;
        for(int i=0;i<a.length;i++){
               p=isPrime(a[i]);
            if(p==1){
                for(int j=0;j<a.length;j++){
                    if(a[j]==0)
                        retValue++;
                }
            }
        }
        if(retValue==0)
            return 0;
        else
            return 1;
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
            return 1;
        else
            return 0;    
    }
}



