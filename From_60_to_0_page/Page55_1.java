
package From_60_to_0_page;
public class Page55_1 
{
    public static void main(String... args){
     int ret=findSmallestBEQnumber();
           System.out.println(ret);
    }
    public static int findSmallestBEQnumber() {
        int num=1,temp,digit,counter=0;
        while(true){
          temp=(num*num*num);  
          while(temp>0){
              digit=temp%10;
              temp=temp/10;
              if(digit==6){
                  counter++;
              }
          }
          if(counter==4)
              return num;
          num++;
          counter=0;
        }

    }
    
}
