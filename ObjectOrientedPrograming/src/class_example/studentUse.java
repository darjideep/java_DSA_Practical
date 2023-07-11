package class_example;

class Teacher{
    String name;
    int contactNumber;
}
public class studentUse {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Deep";
        s1.rollNumber = 123;

        Teacher t1=new Teacher();
        t1.name="Amit";
        t1.contactNumber=958615601;
        System.out.println(t1.name +" This Roll No "+ t1.contactNumber);
        System.out.println(s1.name + " This Roll No " + s1.rollNumber);
    }

}
