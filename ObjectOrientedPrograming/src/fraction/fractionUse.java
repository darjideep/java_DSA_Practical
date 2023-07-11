
package fraction;

public class fractionUse {
    public static void main(String[] args) {
        fraction f1=new fraction(20,30);
//        f1.print();
        f1.setNumerator(12);
        int d=f1.getDenumerator();
//        System.out.println(d); 
//        f1.print();
        
        f1.setNumerator(10);
        f1.setDenumerator(30);
        f1.print();
        
        fraction f2=new fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();
        
        fraction f3=new fraction(4,5);
        f3.mul(f2);
        f3.print();
        f2.print();
        
        fraction f4=fraction.count(f1,f3);
        f1.print();
        f3.print();
        f4.print();
        
        
        
        
    }
    
}
