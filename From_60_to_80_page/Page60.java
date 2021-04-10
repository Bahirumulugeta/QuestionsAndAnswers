
package From_60_to_80_page;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.math.*;
public class Page60 {
     static public void main(String... args) {
           Scanner in=new Scanner(System.in);
           int num=in.nextInt();
         int ans=  isEvens(num);
           if(ans==0){
               System.out.print("it is not evens");
               
           }
           else
               System.out.print("It is evens");
     }
     
   static public int isEvens(int n){
       String str=Integer.toString(n);
       int len=str.length();
       for(int i=0;i<len;i++){
           if(str.charAt(i)%2==0){
               i++;
           }
           else
               return 0;
       }
   return 1;
}
     
}
