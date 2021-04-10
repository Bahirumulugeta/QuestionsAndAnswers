
package New;
public class isSorted{
    public static void main(String... args){ 
    int[] array={8,4,3,2,1} ;
    int ret=f(array);
         System.out.print(ret);
        }
    public static int f(int[] a) {
        if(a.length==0||a.length==1)
            return 1;
        else{ 
            if(a[0]<a[1]){
                for(int i=1;i<a.length;i++){
                    if(a[i]<=a[i-1])
                        return 0;
                }
            }
            else if(a[0]>a[1]){
               for(int i=1;i<a.length;i++){
                    if(a[i]>=a[i-1])
                        return 0;
                }
            }
            else return 0;
        }
          return 1;
    }
}
