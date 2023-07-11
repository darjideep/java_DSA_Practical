package Extra;

import java.util.*;


public class StringCount {
    public static void main(String[] args) {
        String str="DeepDarjee";
        
        Map<Character,Integer>characterCountMap=countCharacterDuplicates(str);
        System.out.println("Character Duplicates:");
        for(Map.Entry<Character,Integer>entry:characterCountMap.entrySet()){
                System.out.println("'"+entry.getKey()+"'->"+entry.getKey()+" Times ");
            }
        
    }
    public static Map<Character,Integer>countCharacterDuplicates(String input){
            Map<Character,Integer>characterCountMap=new HashMap<>();
            String lowercaseInput=input.toLowerCase();
            
            for(int i=0;i<lowercaseInput.length();i++){
                char currentChar=lowercaseInput.charAt(i);
                int count=characterCountMap.getOrDefault(currentChar, 0);
                characterCountMap.put(currentChar, count+1);
            }
        return characterCountMap;
    }
    

}
