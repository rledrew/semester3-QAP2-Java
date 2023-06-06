public class Person {
    private String last_name;
    private String first_name;
    private Address home;

    public Person(String last, String first, Address residence) {
        last_name = last;
        first_name = first;
        home = residence;
    }

    public String toString() {
        return first_name + " " + last_name + "\n" + home;
    }
}
