package guru.springframework;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
       super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

   /* public boolean equals(Object o) {
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }*/


}
