package TreeMap;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double per;

    public Student(int id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPer() {
        return per;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", percentage=" + per + "]";
    }
}
