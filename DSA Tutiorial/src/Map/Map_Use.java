package Map;

import java.util.HashMap;
import java.util.Set;

public class Map_Use { 

    public static void main(String[] args) {
        HashMap<String, Integer>map=new HashMap<>();
        map.put("abc", 21);
        map.put("def", 11);
        map.put("efg", 74);
        map.put("hig", 13);
        
        System.out.println("Size ==>"+map.size());
        
        if(map.containsKey("abc")){
            System.out.println("yas abc Presence");
            
            System.out.println("Get Value ==> "+map.get("abc"));
            
            System.out.println("Remove Value ==>"+map.remove("def"));
            
            System.out.println("Size ==>"+map.size());
            
            Set<String>keys=map.keySet();
            
            for(String str:keys){
                System.out.println(str);
            }
            
        }
    }

}
