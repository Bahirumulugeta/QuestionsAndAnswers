
package From_60_to_80_page;

public class Page89_3 {
   
public static void main(String... args){
     int[] arr={1,2,4,0,0,3,4,8};
     int ret=isHollow(arr);
            if(ret==1)
                System.out.println("it is hollow");
            else
                System.out.println("it is not hollow");
    }
    public static int isHollow(int[] a) {
        int zeroCounter=0;int index1=0,index2=a.length-1;int c1=0,c2=0;
        for(int i=0;i<a.length;i++){
         if(a[i]==0)
             zeroCounter++;
        }
        if(zeroCounter>=3){
            while(a[index1]!=0){
            c1++;
            index1++;
           }
           while(a[index2]!=0){
               c2++;
               index2--;
           }
        }
        else
            return 0;
        if(c1==c2)
            return 1;
        else return 0;
    }
}

