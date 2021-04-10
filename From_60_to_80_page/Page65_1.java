
package From_60_to_80_page;


public class Page65_1 {
    
public static void main(String... args){

        int ret=countDigit(36356,-4);
        System.out.print(ret);
    }
    public static int countDigit(int n,int k){
        int count=0;
       if(n<0||k<0){
           return -1;
       }
       else{
       while(n!=0){
           if(n%10==k)
               count++;
           n=n/10;
       }
        return count;
    } 
    }            
}


