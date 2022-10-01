/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata2;

import java.util.HashMap;


/**
 *
 * @author David
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] data= {1,2,3,4,5,2,2,4,3,1,5,6,3,2,5};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for (Integer integer : data) {
            
            if(histogram.containsKey(integer)){
                histogram.put(integer, histogram.containsKey(integer) ? histogram.get(integer)+1:1);
            }else{
                histogram.put(integer, 1);
            }    
        }
        
        histogram.forEach((k,v) -> System.out.println(k + "==>"+v));
        
        
    }
    
}
