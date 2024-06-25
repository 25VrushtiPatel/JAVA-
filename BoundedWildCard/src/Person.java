public class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', city='" + city + "'}";
    }
}
