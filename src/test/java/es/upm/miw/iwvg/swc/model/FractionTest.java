package es.upm.miw.iwvg.swc.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    Fraction fraction;
    Fraction decimalFraction;
    Fraction integerFraction;
    
    @Before
    public void init(){
        fraction = new Fraction();
        decimalFraction = new Fraction(5, 3);
        integerFraction = new Fraction(10, 2);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(10, integerFraction.getNumerator());
        assertEquals(2, integerFraction.getDenominator());
    }

    @Test
    public void testFraction() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testGetNumerator() {
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(1.6666, decimalFraction.decimal(), 10e-5);
    }

}
