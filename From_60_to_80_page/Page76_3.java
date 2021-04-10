
package From_60_to_80_page;

public class Page76_3 {
public static void main(String... args){
     int array[]={2, 1, 2, 5, 2, 1, 2, 9};
     int ret=goodSpread(array);
        if(ret==1){
            System.out.print("it is goodSpread  array");
        }else
            System.out.print("it is not goodSpread array");
    }
    public static int goodSpread(int[] a) {
        int count=0;
       for(int i=0;i<a.length;i++){
           
           for(int j=0;j<a.length;j++){
               if(a[i]==a[j])
                   count++;
           }
           if(count>3)
               return 0;
           count=0;
           
       }  
       return 1;
     }
}

