package recursion;

public class FibonaciNumber {
    public static int Fibonaci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fibonaci(n-1)+Fibonaci(n-2);
        
    }

    public static void main(String[] args) {
        int n=3;
        int ans=Fibonaci(n);
        System.out.println(ans);
        
    }
    
}
