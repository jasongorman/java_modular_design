package com.codemanship.carpetquote;

public class CarpetQuote {
    public double calculate(double length, double width, double pricePerSqM, boolean roundUpToSqM) {
        double area = length * width;

        if(roundUpToSqM)
            area = Math.ceil(area);

        return area * pricePerSqM;
    }

}
