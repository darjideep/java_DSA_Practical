package accessSpeciAndFun;

public class StudentUse {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Meet";
        s1.setRollNo(123);

        System.out.println(s1.Name + " And His Roll Number is " + s1.getRollNo());
    }

}
