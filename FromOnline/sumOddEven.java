
package FromOnline;

public class sumOddEven {
    public static void main(String... args){ 
    int[] array={3, 3, 4, 4};
        System.out.print(f(array));
    }
    public static int f(int[] a) {
        int sumOdd=0,sumEven=0;
            for(int i=0;i<a.length;i++){
                if(a[i]%2==0)
                    sumEven+=a[i];
                else
                    sumOdd+=a[i];
            }
            return sumOdd-sumEven;

    }
}



