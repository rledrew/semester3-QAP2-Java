public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = new String(street);
        this.city = new String(city);
        this.state = new String(state);
        this.zip = new String(zip);
    }

    public String toString() {
        return street + "\n" + city + ", " + state + " " + zip;
    }
}
