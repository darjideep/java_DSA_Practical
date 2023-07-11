package accessSpeciAndFun;

public class Student {

    public String Name;
    private int rollNo;

    public void setRollNo(int rn) {
        if (rn <= 0) {
            return;
        }
        rollNo = rn;
    }

    public int getRollNo() {
        return rollNo;
    }
}
