
package New;


public class infinite{
public static void main(String... args){ 
    int[] array={3, 2, 3, 1} ;
    int ret=f(array);
         System.out.print(ret);
        }
    public static int f(int[] a) {
        int arraySize=a.length;
        for(int i=0;i<a.length;i++){
            if(a[i]<-1 || a[i]>=arraySize)
                return 1;
            else if(a[i]==-1)
                return -1;
        }
        return 0;
    }
}

