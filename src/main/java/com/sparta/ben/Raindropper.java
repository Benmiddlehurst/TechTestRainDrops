package com.sparta.ben;

import java.util.ArrayList;

public class Raindropper {
    public String rainDropper(ArrayList<Integer> factors){
        ArrayList<String> raindrops =  new ArrayList<>();
        StringBuffer raindropFinal = new StringBuffer();


        if (factors.contains(3) | factors.contains(5) | factors.contains(7)) {
            for (int factor : factors){
                if (factor == 3) {
                    raindrops.add("Pling");
                }
                if (factor == 5) {
                    raindrops.add("Plang");
                }
                if (factor == 7) {
                    raindrops.add("Plong");
                }
            }
        } else return factors.get(factors.size()-1).toString();
        for (String droplet : raindrops){
            raindropFinal.append(droplet);
        }
        String raindropString = raindropFinal.toString();
        return raindropString;
    }
}