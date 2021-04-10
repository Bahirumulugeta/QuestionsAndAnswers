
package FromOnline;


public class Equilibrum {
public static void main(String... args){ 
       int[] array={1, 5, 3, 1, 1, 1, 1, 1, 1};
       int ret=Equilibrum(array);
       System.out.print(ret);
      
    }
    public static int Equilibrum(int[] a) {
        int beforeSum=0,afterSum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++)
                beforeSum+=a[j];
            for(int j=i+1;j<a.length;j++)
                afterSum+=a[j];
            if(beforeSum==afterSum)
                return i;
            beforeSum=0;
            afterSum=0;
        }
        return -1;
      }
}
