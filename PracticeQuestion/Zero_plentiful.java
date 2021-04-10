
package PracticeQuestion;

public class Zero_plentiful {
    
public static void main(String... args){ 
   
         int[] arr={0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
         System.out.println(isZeroPlentiful(arr));
}
    public static int isZeroPlentiful(int[] a) {
        int counter=0;
        int sequenceCounter=0;int i=0;
         while(i<a.length){
             if(a[i]==0){
                 while(i<a.length && a[i]==0){
                     counter++;
                     i++;
                 }
                 if(counter<4)
                     return 0;
                 counter=0;
                 sequenceCounter++;
             }
             else
                 i++;
         }
         return sequenceCounter;
    }
}
