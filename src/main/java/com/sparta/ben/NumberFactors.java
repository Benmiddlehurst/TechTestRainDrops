package com.sparta.ben;

import java.util.ArrayList;

public class NumberFactors {
    private ArrayList<Integer> factors = new ArrayList<>();
    private int divider;

    public ArrayList<Integer> numberFactors(int number){
        if (number <= 0 ){
            throw new IllegalArgumentException("Only positive numbers are accepted.");
        }

        for (divider = 1; divider <= number; divider++){
            if (number % divider == 0){
                factors.add(divider);
            }
        }
        System.out.println("The Number is: " + number + ". It has " + factors.size() + " factors. They are: " + factors.toString());
        return factors;
    }
}
