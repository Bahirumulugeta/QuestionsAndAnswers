
package From_60_to_0_page;
public class Page46_3 {
public static void main(String... args){ 
    int[] array={2, 1, 18, -5};
    int[] arr=pairwiseSum(array);
    for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" , ");
    }
    public static int[] pairwiseSum(int[] a) {
       int sum=0;int index=0;
       int[] array=new int[a.length/2];
        if(a.length%2!=0||a.length==0)
            return null;
        else{
          for(int i=0;i<=a.length/2;i=i+2){
              sum=a[i]+a[i+1];
              array[index]=sum;
              index++;
          }  
          return array;
        }
        
    }
    
}
