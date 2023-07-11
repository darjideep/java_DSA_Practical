/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessSpeciAndFun;

public class sMainFinalStaThis {

    public static void main(String args[]) {

        sFinalStaticThis s1 = new sFinalStaticThis(11);
        s1.name = "Deep";

        System.out.println("name :" + s1.name + "\tROll Number :" + s1.getROllNo());

        sFinalStaticThis s2 = new sFinalStaticThis(123, "yash");
        System.out.println("name :" + s2.name + "\tROll Number :" + s2.getROllNo());

        sFinalStaticThis s3 = new sFinalStaticThis(852, "Meet");
        System.out.println("name :" + s3.name + "\tROll Number :" + s3.getROllNo());

        System.out.println("Total Call -> " + (sFinalStaticThis.numStudent+1));
        //declare +1 Because One Below function are not  Added  to numStudent  
    }

}
