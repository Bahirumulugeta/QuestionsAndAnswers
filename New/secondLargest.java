
package New;
public class secondLargest {
   public static void main(String... args){ 
    int[] array={4,3,2,1} ;
    int ret=f(array);
         System.out.print(ret);
        }
    public static int f(int[] a) {
      if(a.length==0)
         return -1;
      else{
                int largest=a[0],smalestIndex=0;
                for(int i=0;i<a.length;i++){
                if(a[i]>largest)
                    largest=a[i];
                else if(a[i]<a[smalestIndex])
                    smalestIndex=i;
                 }
                System.out.println(largest);
                System.out.println(smalestIndex);
                int secondLargestIndex=smalestIndex;
            for(int i=0;i<a.length;i++){
                if(a[secondLargestIndex]<a[i]&&a[i]<largest)
                    secondLargestIndex=i;
            }
            if(secondLargestIndex==0&&largest==a[0])
                return -1;
            else
            return a[secondLargestIndex];
      }
      
    }
}

