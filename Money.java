public class Money {
    private long dollars;
    private long cents;


    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }


    public Money(Money other) {
        dollars = other.dollars;
        cents = other.cents;
    }

    public Money add(Money other) {
        Money sum = new Money(0);
        sum.cents = this.cents + other.cents;
        sum.dollars = this.dollars + other.dollars + sum.cents / 100;
        sum.cents = sum.cents % 100;
        return sum;
    }

    public Money subtract(Money other) {
        Money difference = new Money(0);
        difference.cents = this.cents - other.cents;
        difference.dollars = this.dollars - other.dollars;
        if (difference.cents < 0) {
            difference.cents = 100 - Math.abs(difference.cents);
            difference.dollars--;
        }
    
        return difference;
    }

    public int compareTo(Money other) {
        if (this.dollars < other.dollars) {
            return -1;
        } else if (this.dollars > other.dollars) {
            return 1;
        } else if (this.cents < other.cents) {
            return -1;
        } else if (this.cents > other.cents) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Money other) {
        if (this.compareTo(other) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "$" + dollars + "." + cents;
    }
}