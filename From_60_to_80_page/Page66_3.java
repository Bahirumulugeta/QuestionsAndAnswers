
package From_60_to_80_page;
public class Page66_3 {
    public static void main(String... args){
        int arr[]={2,10,9,3,7};
        int ret=isMeera(arr);
        if(ret==1){
             System.out.print("it is nice");
        }else
            System.out.print("it is not nice");
    }
    public static int isMeera(int[] a) {
        int retValue=1;int inc=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]-1 || a[i]==a[j]+1){
                    inc++;
                }
            }
        }
       System.out.println(inc);
        if(inc!=a.length)
           retValue=0;
       return retValue;
    }
}
