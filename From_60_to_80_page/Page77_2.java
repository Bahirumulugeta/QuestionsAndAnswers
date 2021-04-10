
package From_60_to_80_page;
public class Page77_2 {
public static void main(String... args){
    int[] arr={-4,0,1,3};
     int ret=meera(arr);
     
        if(ret==1){
            System.out.print("meera");
        }else
            System.out.print("not meera");
    }
    public static int meera(int[] a) {
        for(int i=0;i<a.length;i++){
            if(a[i]>=i)
                return 0;
        }
        return 1;
    }
}