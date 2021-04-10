
package FromOnline;

public class CharArray {
public static void main(String... args){ 
    char[] array={'a', 'b', 'c'};
    char[] ret=f(array,0,4);
    if(ret==null)
         System.out.print("null");
    else
    {
     for(int i=0;i<ret.length;i++)
        System.out.print(ret[i]+" , ");
    }
    }
    public static char[] f(char[] a,int start,int len) {
        char[] newArray=new char[len];
        if(start+len>a.length ||start<0||len<0)
            return null;
        else{
            int index=0;
            for(int i=start;i<len+start;i++){
                newArray[index]=a[i];
                index++;
            }
            return newArray;
        }
    }
}





