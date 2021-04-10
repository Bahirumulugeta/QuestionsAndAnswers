
package From_60_to_80_page;

public class Page63_2 {
    
 public static void main(String... args){
     int arr[]={1,2,3,-2,3,4,9};
         int[] ans=fill(arr,3,10);
          
           for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
           }
     }
     
   static public int[] fill(int[] arr,int k,int n){
         int[] array=new int[n];
         int j=0;
         for(int i=0;i<n;i++){
             if(k>0){
                 array[i]=arr[j];
                 j++;
                 if(j>=k){
                     j=0;
                 }
             }
         }
         return array;
 }
     
}


