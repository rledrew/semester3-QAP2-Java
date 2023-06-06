public class Person {
    private String last_name;
    private String first_name;
    private Address home;

    public String toString() {
        return first_name + " " + last_name + "\n" + home;
    }
}
