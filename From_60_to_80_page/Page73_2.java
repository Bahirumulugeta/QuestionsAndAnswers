
package From_60_to_80_page;

public class Page73_2 {
   
public static void main(String... args){
     int array[]={-2, -4, -6, -8, -11};
     int ret=oddHeavy(array);
        if(ret==1){
            System.out.print("it is odd_heavy  array");
        }else
            System.out.print("it is not odd_heavy array");
    }
    public static int oddHeavy(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                count++;
                for(int j=0;j<a.length;j++)
                {
                    if(a[i]<a[j] && a[j]%2==0)
                     return 0;  
                }      
            }
        }
      if(count==0)
          return 0;
       else
          return 1;         
     }
}


