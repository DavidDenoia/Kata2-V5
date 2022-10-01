package Kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data= {1,2,3,4,5,2,2,4,3,1,5,6,3,2,5};
        Histogram histo=new Histogram(data);
        Map<Integer,Integer> histogr=histo.getHistogram();

        histogr.forEach((k,v) -> System.out.println(k + "==>"+v));   
    }
    
}
