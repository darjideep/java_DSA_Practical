
//Example This include both file.Class and main

package accessSpeciAndFun;

class student{
        String name;
        int rollNo;
        student(int num){
		rollNo = num;
        }	
        public void print(){
		System.out.print("\n "+name +" " + rollNo+" \n");
        }
    }
 
    public class StudentConstructorUse {
        public static void main(String[] args) {
            
            student s = new student(15);
            s.name="Deep";
            s.print();
            
            student s2 = new student(20);
            s2.name="yash";
            s2.print();
            
        }
    }

