package com.sparta.ben;

public class App 
{
    public static void main( String[] args )
    {
        NumberFactors numberFactors = new NumberFactors();
        Raindropper raindropper = new Raindropper();
        String raindrop = raindropper.rainDropper(numberFactors.numberFactors(105));
        System.out.println(raindrop);
    }
}
