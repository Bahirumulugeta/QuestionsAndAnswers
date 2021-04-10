
package From_60_to_0_page;

public class Page58_2 {
  
public static void main(String... args){

     int ret=isNormal(8);
            if(ret==1)
                System.out.println("it is normal");
            else
                System.out.println("it is not normal");
    }
    public static int isNormal(int n) {
      for(int i=2;i<n;i++){
          if(n%i==0 && i%2!=0)
              return 0;    
      }
     return 1;
    }
}

