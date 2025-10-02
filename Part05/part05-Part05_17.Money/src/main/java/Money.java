
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

     public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
 
        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }
 
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        return (this.euros < compared.euros) || (this.euros == compared.euros && this.cents < compared.cents);
    }

    public Money minus(Money decremented) {
        int totalCentsThis = this.euros * 100 + this.cents;
        int totalCentsOther = decremented.euros * 100 + decremented.cents;
        int diff = totalCentsThis - totalCentsOther;
        if (diff < 0) {
            return new Money(0, 0);
        }
        return new Money(diff / 100, diff % 100);
    }
}
