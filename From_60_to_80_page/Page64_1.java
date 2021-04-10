
package From_60_to_80_page;


public class Page64_1 {
   public static void main(String... args){

        int ret=minDistance(36);
        System.out.print(ret);
    }
    public static int minDistance(int n){
       int min=n;int temp;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            {
               for(int j=1;j<i;j++){
                   if(n%j==0){
                       temp=i-j;
                       if(temp<min)
                           min=temp;
                   }
               } 
            }
        }
        return min;
    }              
}

