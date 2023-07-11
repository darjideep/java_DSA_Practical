/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accessSpeciAndFun;

public class studentConst2 {
    
        String name;
        int rollNo;
	
        // Constructor 1
        studentConst2(int num){
                rollNo = num;
                name = "abc";
        }	
	
        // Constructor 2
        studentConst2(int num, String str){
                rollNo = num;
                name = str;
        }
	
        public void print(){
                System.out.print(name +" " + rollNo+" ");
        }
   }