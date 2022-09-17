package guru.springframework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void testMultiplicationDollar() {
        /*Dollar five = new Dollar(5); or */
        Money fiveDollar = Money.dollar(5);
        /*assertEquals(new Dollar(10),five.times(2));
        assertEquals(new Dollar(15),five.times(3));*/
        /*removing the direct references to the dollar object.*/
        assertEquals(Money.dollar(10),fiveDollar.times(2));
        assertEquals(Money.dollar(15),fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10),fiveFranc.times(2));
    }

    @Test
    void testEqualityDollar(){
     /*   assertEquals(new Dollar(5),new Dollar(5));
        assertNotEquals(new Dollar(5),new Dollar(8));
        assertNotEquals(new Franc(5),new Dollar(8));*/

        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));

        assertNotEquals(Money.dollar(5),Money.franc(8));
    }

    /*@Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        *//*assertEquals(new Franc(10),five.times(2));
        assertEquals(new Franc(15),five.times(3));*//*
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }*/

    @Test
    void testEqualityFranc(){
        assertEquals(Money.franc(5),Money.franc(5));
        assertNotEquals(Money.franc(5),Money.franc(8));
    }

    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
