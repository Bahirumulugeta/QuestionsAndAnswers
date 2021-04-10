
package From_60_to_80_page;

public class Page67_3 {
    
 public static void main(String... args){
        int arr[]={3,6,4,5};
        int array[]={3,4,5,4,5,6,9};
        int ret=isSetEqual(arr,array);
        if(ret==1){
             System.out.print("The argument is set equal");
        }else
            System.out.print("The argument is not set equal");
    }
    public static int isSetEqual(int[] a,int[] b) 
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                    count++;
            }
        }
        if(count==a.length||count==b.length){
            return 1;
        }
        else
            return 0;
    }
}

