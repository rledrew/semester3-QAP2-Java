public class CC {
    private Money balance;
    private Money credit_limit;
    private Person owner;

    public CC(Person new_cardholder, Money limit) {
        owner = new_cardholder;
        credit_limit = new Money(limit);
        balance = new Money(0);
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return credit_limit;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        balance = balance.add(amount);
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
