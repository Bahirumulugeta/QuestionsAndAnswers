
package From_60_to_80_page;

public class Page72_1 {
    public static void main(String... args){
     int ret=isFancy(61);
        if(ret==1){
            System.out.print("it is fancy number");
        }else
            System.out.print("it is not fancy number");
    }
    public static int isFancy(int a) {
        int retValue=0;
        int first=1,second=1,next;
        for(int i=1;i<=a;i++){
           next=3*second+2*first;
           first=second;
           second=next;
           if(next==a){
               retValue=1;
               break;
           }
        }
        if(retValue==1)
            return 1;
        else
            return 0;
     }

}

