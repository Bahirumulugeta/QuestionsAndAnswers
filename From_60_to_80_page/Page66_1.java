
package From_60_to_80_page;

public class Page66_1 {
    public static void main(String... args){
        int ret=isMeera(21);
        if(ret==1){
                    System.out.print("it is meera number");
        }else
            System.out.print("it is not meera number");
    }

    public static int isMeera(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                count++;
            
        }
        if(n%count==0)
            return 1;
        else return 0;
    }
}
