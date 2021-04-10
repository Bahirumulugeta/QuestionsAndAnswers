
package From_60_to_80_page;
public class Page77_1 {
    
public static void main(String... args){
     int ret=sumDigits(-12);
        if(ret>0){
            System.out.print(ret);
        }else
            System.out.print(ret);
    }
    public static int sumDigits(int n) {
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        if(sum<0)
            return sum*-1;
        else
        return sum;
    }
}
