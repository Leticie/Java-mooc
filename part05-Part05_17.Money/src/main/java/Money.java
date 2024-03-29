
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = addition.euros + this.euros;
        int newCents = addition.cents + this.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int decreasedEuros = this.euros - decreaser.euros;
        int decreasedCents = this.cents - decreaser.cents;
        if (decreasedCents < 0) {
            decreasedCents = 100 + decreasedCents;
            decreasedEuros -= 1;
        }
        if (decreasedEuros < 0) {
            decreasedEuros = 0;
            decreasedCents = 0;
        }
        Money newMinusMoney = new Money(decreasedEuros, decreasedCents);
        return newMinusMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
