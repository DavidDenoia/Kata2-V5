package Kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo=new Histogram(data);
        Map<String,Integer> histogr=histo.getHistogram();

        histogr.forEach((k,v) -> System.out.println(k + "==>"+v));   
    }
    
}
