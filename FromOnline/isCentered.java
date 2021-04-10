
package FromOnline;
public class isCentered { 
public static void main(String... args){ 
    int[] array={2, 1, 0,1, 6};
        System.out.print(checkCentered(array));
    }
    public static int checkCentered(int[] a) {
        if(a.length%2!=0){
            int mid=a.length/2;
            for(int i=0;i<a.length;i++){
                if(i==mid)
                    continue;
                else{
                    if(a[i]<=a[mid])
                        return 0;
                }
            }
        }
        else
            return 0;
        return 1;
    }
}


