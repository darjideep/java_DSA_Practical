package Arrays;

public class ExtraFunction {

   public static int CheckPri(int s){
       int sum=0;
       int a=5,b=10;
       sum=a+b+s;
       return sum;
   }
    public static void main(String[] args) {
        int e=10;
        int Ans=CheckPri(e);
        System.out.println("sum==>"+Ans);
    }
    
}
