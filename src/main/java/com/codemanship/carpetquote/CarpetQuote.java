package com.codemanship.carpetquote;

public class CarpetQuote {
    public double calculate(Room room, Carpet carpet) {
        return carpet.totalPrice(room.area());
    }

}
