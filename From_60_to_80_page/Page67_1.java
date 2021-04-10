
package From_60_to_80_page;

public class Page67_1 {
    
 public static void main(String... args){
        int ret=isContinuousFactored(99);
        if(ret==1){
            System.out.print("it is contineus factored");
        }else
            System.out.print("it is not contineus factored");
    }
    public static int isContinuousFactored(int n) {
        int pro=1,inc=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                while(n%(i+inc)==0){
                    pro=pro*(i+inc);
                    inc++;
                    if(pro==n){
                         return 1;
                    }
                }
                pro=1;
                inc=0;
            }
            else{
                pro=1;
                inc=0;
            }
        }
           
      return 0;
    }
}


