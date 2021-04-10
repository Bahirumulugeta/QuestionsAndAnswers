
package From_60_to_80_page;
public class Page68_1 {

 public static void main(String... args){
        int ret=isSmart(7);
        if(ret==1){
            System.out.print("it is smart num");
        }else
            System.out.print("it is not smart num");
    }
    public static int isSmart(int n) {
        int value=1;int retValue=0;
        for(int i=1;i<=n;i++){
            
            if(value==n)
                retValue=1;
            value=value+i;
        }
              return retValue;
    }
}



