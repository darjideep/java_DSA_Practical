package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list.size());
        
        list.add(10);
        list.add(25);
        list.add(35);
         
        System.out.println(list.size());
        System.out.println(list.get(2));
        
    }
    
}
