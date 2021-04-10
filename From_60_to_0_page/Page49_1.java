
package From_60_to_0_page;

public class Page49_1 {
public static void main(String... args){ 
    int[] array={4, 0, 9};
     double ret=Eval(2.0,array);      
           System.out.println(ret);
    }
    public static double Eval(double x,int[] a) {
       double sum=a[0];
       double pro=1;
       for(int i=1;i<a.length;i++){
           for(int j=1;j<=i;j++){
               pro=pro*x; 
           }
           sum=sum+a[i]*pro;
           pro=1;
       }
       return sum;
    }
    
}

