package com.codemanship.carpetquote;

public class Carpet {
    private final double pricePerSqM;
    private final boolean roundUpToSqM;

    public Carpet(double pricePerSqM, boolean roundUpToSqM) {
        this.pricePerSqM = pricePerSqM;
        this.roundUpToSqM = roundUpToSqM;
    }

    double totalPrice(double area) {
        if(roundUpToSqM)
            area = Math.ceil(area);

        return area * pricePerSqM;
    }
}
