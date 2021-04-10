
package From_60_to_0_page;

public class Page53_8 {
 public static void main(String... args){ 
     int ret=isConsectiveFactored(6);      
           System.out.println(ret);
    }
    public static int isConsectiveFactored(int n) {
       
       for(int i=2;i<=n;i++){
           if(n%i==0){
               if(n%(i+1)==0)
                   return 1;
            }
        }
     return 0;
    }
    
}
