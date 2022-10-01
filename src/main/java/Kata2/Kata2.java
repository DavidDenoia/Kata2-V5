package Kata2;

import java.util.HashMap;


public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data= {1,2,3,4,5,2,2,4,3,1,5,6,3,2,5};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for (Integer integer : data) {
            histogram.put(integer, histogram.containsKey(integer) ? histogram.get(integer)+1:1);
        }
        histogram.forEach((k,v) -> System.out.println(k + "==>"+v));   
    }
    
}
