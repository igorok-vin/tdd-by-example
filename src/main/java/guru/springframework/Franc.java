package guru.springframework;

import java.util.Objects;

public class Franc extends Money {

    public Franc(int amount,String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

   /* public boolean equals(Object o) {
        Franc franc = (Dollar) o;
        return amount == franc.amount;
    }*/
}

