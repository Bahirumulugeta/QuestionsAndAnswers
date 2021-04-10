
package PracticeQuestion;

public class HMS {
    public static void main(String... args){
        int[] ret=computeHMS(0);
        for(int i=0;i<3;i++)
            System.out.print(ret[i]+",");
        
    }
    static int[] computeHMS(int second){
        int[] array=new int[3];
        array[0]=second/3600;
        array[1]=(second-array[0]*3600)/60;
        array[2]=second-(array[0]*3600+array[1]*60);
        return array;
    }
}
