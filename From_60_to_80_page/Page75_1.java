
package From_60_to_80_page;
public class Page75_1 {
    
 
public static void main(String... args){
  
     int ret=factorTwoCount(11);
        if(ret>0){
            System.out.print("it has "+ret+" factor two count");
        }else
            System.out.print("it has not factor two count");
    }
    public static int factorTwoCount(int n) {
        int counter=0;
        if(n%2!=0)
            return 0;
        else{
               while(n%2==0){
                   n=n/2;
                   counter++;
               }
               return counter;
            }      
     }   
}
