package From_60_to_0_page;
public class Page57_3 {
public static void main(String... args){
    int array[]={-1, 1, -8, -27, 8};
     int ret=cubePerfect(array);
            if(ret==1)
                System.out.println("it is cube perfect");
            else
                System.out.println("it is not cube perfect");
    }
    public static int cubePerfect(int[] a) {
        int count=0;int pro;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=a.length;j++){
                if(a[i]%j==0){
                   pro=j*j*j;
                   if(pro==a[i] || pro==a[i]*-1)
                    count++;
                }
            }
        }
       System.out.print(count);
        if(count==a.length)
            return 1;
        else
            return 0;
    }
    
}



