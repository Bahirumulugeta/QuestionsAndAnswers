
package From_60_to_80_page;

public class Page72_3 {
public static void main(String... args){
     int array[]={3, 4, 6, 7, 14, 13};
     int ret=isFilter(array);
        if(ret==1){
            System.out.print("it is filter  array");
        }else
            System.out.print("it is not filter array");
    }
    public static int isFilter(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==9){
                for(int j=0;j<a.length;j++){
                    if(a[j]==11)
                        count++;
                }
                if(count==0)
                return 0;
            }
            else if(a[i]==7){
                for(int j=0;j<a.length;j++){
                    if(a[j]==13)
                        return 0;
                }
            }
          
        }
        return 1;
                  
     }

}

