/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;

public class pairUse {

    public static void main(String[] args) {
        pair <String>p=new pair<String>("Deep","Darji");
        
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        
        
//        User cant not use primitive datatype in Gererics Like
//        int char double float etc...
//        but insted of user can use class of this primitive Datatype Like
//        Integer Character....etc.
        pair <Integer>obj=new pair<>(2,3);
        System.out.println(obj.getFirst()+"  "+obj.getSecond());
        
        
        
    }
    
}
