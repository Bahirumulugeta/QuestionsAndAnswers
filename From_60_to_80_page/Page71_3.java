
package From_60_to_80_page;

public class Page71_3 {
    
 public static void main(String... args){
        int[] arr={3, 4, 5, 7};
     int ret=Bean(arr);
        if(ret==1){
            System.out.print("it is bean array");
        }else
            System.out.print("it is not bean array");
    }
    public static int Bean(int[] a) {
        int retValue=1;int count=0;
        for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                   if(a[j]==a[i]-1||a[j]==a[i]+1)
                       count++;
                }
                if(count<1)
                    retValue=0;
                count=0;
        }
        if(retValue==0)
            return 0;
        else
            return 1;
     }

}
