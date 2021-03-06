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
    
    @Test
    public void testSumar(){
    	Fraction f = new Fraction (1,2);
    	assertEquals(22, integerFraction.sumar(f).getNumerator());
    	assertEquals(4, integerFraction.sumar(f).getDenominator());
    }

    @Test
    public void testRestar(){
    	Fraction f = new Fraction (1,2);
    	assertEquals(18, integerFraction.restar(f).getNumerator());
    	assertEquals(4, integerFraction.restar(f).getDenominator());
    }
    
    @Test
    public void testMultiplicar(){
    	Fraction f = new Fraction (1,2);
    	assertEquals(10, integerFraction.multiplicar(f).getNumerator());
    	assertEquals(4, integerFraction.multiplicar(f).getDenominator());
    }
    
    @Test
    public void testDividir(){
    	Fraction f = new Fraction (1,2);
    	assertEquals(20, integerFraction.dividir(f).getNumerator());
    	assertEquals(2, integerFraction.dividir(f).getDenominator());
    }
    
    @Test
    public void testIsPropia() {
        assertEquals(false, integerFraction.isPropia());
    }
    
    @Test
    public void testIsImpropia() {
        assertEquals(true, integerFraction.isImpropia());
        integerFraction = new Fraction(2, 2);
        assertEquals(true, integerFraction.isImpropia());
    }
    
    @Test
    public void testIsEquivalent() {
    	// Success case
    	Fraction f = new Fraction(20, 4);
    	assertEquals(true, integerFraction.isEquivalent(f));
    	
    	// Fail case
    	Fraction f1 = new Fraction(4, 20);
    	assertEquals(false, integerFraction.isEquivalent(f1)); 
    }
}
