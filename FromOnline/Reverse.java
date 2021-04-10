
package FromOnline;
public class Reverse {
    
public static void main(String... args){ 
            System.out.print(reverse(-12345));
    }
    public static int reverse(int n) {
        int sign = 1;
        if (n == 0) return 0;
        if (n < 0)
        {
        sign = -1;
        n = -n;
        }
        int reverse = 0;
        while (n != 0)
        {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
      }
}


