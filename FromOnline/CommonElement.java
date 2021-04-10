
package FromOnline;

public class CommonElement {
     
public static void main(String... args){ 
       int[] array={1, 8, 3, 2};
       int[] arr={4, 2, 6, 1};
       int[] ret=commonElement(array,arr);
       if(ret==null)
            System.out.print("null");
        else
        {
           for(int i=0;i<ret.length;i++){
               System.out.print(ret[i]);
           }
        }
    }
    public static int[] commonElement(int[] first,int[] second) {
        int size=0;
        if(first==null||second==null)
            return null;
        else{
            for(int i=0;i<first.length;i++){
                for(int j=0;j<second.length;j++){
                    if(first[i]==second[j])
                        size++;
                }
            }
            int[] newArray=new int[size];
            int index=0;
            for(int i=0;i<first.length;i++){
                for(int j=0;j<second.length;j++){
                    if(first[i]==second[j]){
                         newArray[index]=first[i];
                         index++;
                    }
                          
                }
            }
       return newArray;
        }
      }
}



