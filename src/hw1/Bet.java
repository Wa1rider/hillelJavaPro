package hw1;

import java.util.Objects;

public class Bet {
    private int betValue;

    public Bet() {
    }

    public int getBetValue() {
        return this.betValue;
    }

    public void setBetValue(int betValue) {
        if (betValue < 0) {
            System.out.println("Ставка не может принимать отрицательное значение!");
        } else {
            this.betValue = betValue;
        }

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Bet bet = (Bet)o;
            return this.betValue == bet.betValue;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.betValue});
    }

    public String toString() {
        return "Значение ставки = " + this.betValue;
    }
}
