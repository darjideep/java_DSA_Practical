package accessSpeciAndFun;


public class sFinalStaticThis {
    static int numStudent;
    
    String name;
    private final int rollNo;
    
    
//    public void setROllNo(int rn){
//        rollNo = rn;
//    }
    public int getROllNo(){
        return rollNo;
    }
    
    sFinalStaticThis(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
        numStudent++;
    }
    
    sFinalStaticThis(int rollNo){
        this.rollNo=rollNo;
     }
    
}
