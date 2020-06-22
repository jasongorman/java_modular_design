package com.codemanship.carpetquote;

public class RectangularRoom implements Room {
    private final double length;
    private final double width;

    public RectangularRoom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
