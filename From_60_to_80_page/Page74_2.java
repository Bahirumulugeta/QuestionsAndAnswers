
package From_60_to_80_page;

public class Page74_2 {
    
public static void main(String... args){
     int array[]={1, 2, 1, 2};
     int ret=dual(array);
        if(ret==1){
            System.out.print("it is dual  array");
        }else
            System.out.print("it is not dual array");
    }
    public static int dual(int[] a) {
        int check,temp;
        if(a.length%2!=0)
            return 0;
        else{
            check=a[0]+a[1];
            for(int i=2;i<a.length;i=i+2)
             {
                 temp=a[i]+a[i+1];
               if(check!=temp)
                   return 0;
             }
          return 1;
        }
        
                   
     }
}


