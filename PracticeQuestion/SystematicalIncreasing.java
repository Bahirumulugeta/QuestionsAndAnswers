
package PracticeQuestion;
public class SystematicalIncreasing 
{   
public static void main(String... args){ 
         int[] arr={1, 1, 2, 3};
         System.out.println(isSystematicallyIncreasing(arr));
}
    public static int isSystematicallyIncreasing(int[] a) {
        int inc=0;int index;int temp=0;
       if(a[0]!=1)
           return 0;
       else{
           for(int i=1;i<a.length;){
                index=i+1;
               while(index<a.length && a[i]==1){
                   if(a[index]==1){
                       i=index;
                       break;
                   }
                   index++;
                   inc++;
               }
               i=index;
            if(inc-temp!=1)
                return 0;
           temp=inc;
           inc=0;
         }
           return 1;
       }
    }
}

