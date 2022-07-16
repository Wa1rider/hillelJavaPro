package hw2;

import java.util.Objects;

public class Bet {
    private int value;
    private double risk;

    public Bet() {
        this.value = 0;
        this.risk = 0;
    }


    public int getBetValue() {
        return this.value;
    }

    public void setBetValue(int betValue) {
        if (betValue < 0) {
            System.out.println("Ставка не может принимать отрицательное значение!");
        } else {
            this.value = betValue;
        }

    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return value == bet.value && Double.compare(bet.risk, risk) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, risk);
    }

    @Override
    public String toString() {
        return "{Значение ставки = " + this.value +
                ", Значение риска = " + this.risk + "}";
    }
    //    public String toString() {
//        return "Значение ставки = " + this.value;
//    }
}

