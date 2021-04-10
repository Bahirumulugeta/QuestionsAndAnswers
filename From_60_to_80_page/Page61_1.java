
package From_60_to_80_page;
import java.util.Scanner;
public class Page61_1 {
    public static void main(String... args){
        int array[]={2,3,4,5,7};
        int ret=isBalancedPrime(array);
        if(ret==1){
            System.out.print("it is balanced");
        }
        else{
            System.out.print("it is not balanced");
        }
    }
    public static int isBalancedPrime(int[] args){
        boolean check=true;
        for(int i=0;i<args.length;i++){
            if(args[i]%2==0&&i%2==0)
               continue;
            else if(args[i]%2!=0&&i%2!=0)
                continue;
            else 
                check=false;
        }  
        if(check){
            return 1;
        }
        else
            return 0;
    }
}
