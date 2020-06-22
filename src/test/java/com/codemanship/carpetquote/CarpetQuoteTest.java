package com.codemanship.carpetquote;

import com.codemanship.carpetquote.CarpetQuote;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarpetQuoteTest {

    @Test
    public void carpetPriceNotRounded(){
        CarpetQuote quote = new CarpetQuote();
        assertEquals(1562.5,
                quote.calculate(12.5, 12.5, 10.0, false), 0.0);
    }

    @Test
    public void carpetPriceRounded(){
        CarpetQuote quote = new CarpetQuote();
        assertEquals(1570.0,
                quote.calculate(12.5, 12.5, 10.0, true), 0.0);
    }
}
