
package From_60_to_80_page;
public class Page81_1 {
public static void main(String... args){

     int ret=minDistance(13013);
            System.out.print(ret);
    }
    public static int minDistance(int n) {
        int min=n;
       for(int i=1;i<=n/2;i++){
           if(n%i==0){
               for(int j=1;j<=n/2;j++){
                   if(n%j==0 && i!=j){
                       if(j-i<min && j-i>0){
                          min=j-i;
                       }
                   }
               }
           }
       }
       return min;
    }
}
