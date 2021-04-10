
package From_60_to_80_page;

import java.util.Scanner;
public class Page63_1 {
    public static void main(String... args){
         int ans=  hasKSmallFactor(10,24);
           if(ans==0){
               System.out.print("it is not true");
               
           }
           else
               System.out.print("It is true");
     }
     
   static public int hasKSmallFactor(int k,int n){
         boolean check=false;
              for(int i=1;i<k;i++){
                  for(int j=1;j<k;j++){
                      if(n%i==0&&n%j==0){
                          if(i!=j&&i*j==n){
                              System.out.println("first: "+i+" and second: "+j);
                             check=true;
                          }
                      }
                  }
              }
              if(check)
                  return 1;
              else
                  return 0;
 }
     
}
