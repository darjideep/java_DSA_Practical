/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

public class fraction {

    private int numerator;
    private int denumerator;

    public fraction(int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;
        simplyfy();
    }
    
    public void setNumerator(int numerator){
        this.numerator=numerator;
        this.simplyfy();
    }
    public void setDenumerator(int denumerator){
        if(denumerator==0){
            //TODO error out.
            return;
        }
        this.denumerator=denumerator;
        this.simplyfy();
    }
    
    public int getNumerator(){
        return numerator;
    }
    public int getDenumerator(){
        return denumerator;
    }
    
    private void simplyfy() {
        int gcd = 1;
        int smaller = Math.min(numerator, denumerator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denumerator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denumerator = denumerator / gcd;
    }

    public void print() {
        if (denumerator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(+numerator + "/" + denumerator);
        }
    }
    
    public static fraction count(fraction f1,fraction f2){
        int num=f1.numerator*f2.denumerator+f2.numerator*f1.denumerator;
        int den=f1.denumerator*f2.denumerator;
        fraction f= new fraction(num,den);
        return f;
        
    }
        public void add(fraction f2){
            this.numerator=this.numerator * f2.denumerator +
                    f2.numerator * this.denumerator;
            this.denumerator=this.denumerator * f2.denumerator;
            simplyfy();
        }
        
        public void mul(fraction f2){
            this.numerator=this.numerator * f2.numerator ;
            this.denumerator=this.denumerator * f2.denumerator;
            simplyfy();
            
        }
}
