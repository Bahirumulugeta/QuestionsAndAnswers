
package New;

public class NewClass {
    
public static void main(String... args){ 
    int[] array={1, 1, 2, 4, 8} ;
    int ret=f(array);
         System.out.print(ret);
        }
    public static int f(int[] a) {
        int sum=a[0]+a[1];
      if(a.length>1 && a[0]==a[1]){
          for(int i=2;i<a.length;i++){
              if(a[i]!=sum)
                  return 0;
              sum=sum+a[i];
          }
          return 1;
      }
      else
          return 0;
    }
}
