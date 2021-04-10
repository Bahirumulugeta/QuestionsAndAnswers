
package From_60_to_0_page;

public class Page56_2 {
    public static void main(String... args){
    int array[]={1, 0, 5, -1, 0, 0, 3, 0, 8};
     int ret=zeroLimited(array);
            if(ret==1)
                System.out.println("it is zero limited");
            else
                System.out.println("it is not zero limited");
    }
    public static int zeroLimited(int[] a) {
        int count=0,zeroSize=0,temp=1,inc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                zeroSize++;
        }
        while(temp<a.length){
            if(a[temp]==0)
                count++;
            inc++;
            temp=3*inc+1;
        }
        if(count==zeroSize)
            return 1;
        else
            return 0;
    }
    
}


