
package From_60_to_80_page;

public class Page78_1{
public static void main(String... args){

     int ret=gutrie(15);
     
        if(ret==1){
            System.out.print("it is gutrie");
        }else
            System.out.print("not gutrie");
    }
    public static int gutrie(int n) {
        int num=1,index=0;
        while(num<=n){
            num=index+num;
            if(num==n)
                return 1;
            index++;
        }
        return 0;
    }
}

