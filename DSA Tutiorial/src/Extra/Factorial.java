package Extra;
import java.util.Scanner;

public class Factorial {
    public static int fact(int no){
        int ans=1;
//        for(int i=no;i>=1;i--){
//            ans=ans*i;
//        }
        for(int i=1;i<=no;i++){
            ans=ans*i;
        }
       return ans;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number want to get Factorial ==>");
        int n=s.nextInt();
        
        int ans=fact(n);
        System.out.println("Factorial of "+n+" is "+ans );

    }
    
}
