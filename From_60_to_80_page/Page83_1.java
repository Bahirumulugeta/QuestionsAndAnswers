
package From_60_to_80_page;
public class Page83_1 {
    
public static void main(String... args){

     int ret=pascal(3);
            if(ret==1)
                System.out.println("it is pascal");
            else
                System.out.println("it is not pascal");
    }
    public static int pascal(int n) {
        int num=1,index=2;
       while(num<=n){
           num=num+index;
           if(num==n)
               return 1;
           index++;
       }
       return 0;
    }
}
