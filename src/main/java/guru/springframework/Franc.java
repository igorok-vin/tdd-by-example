package guru.springframework;

import java.util.Objects;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

   /* public boolean equals(Object o) {
        Franc franc = (Dollar) o;
        return amount == franc.amount;
    }*/
}
