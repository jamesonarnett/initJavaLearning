public class Student implements Comparable<Student>{
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int compareTo(Student other) {
        return this.rollno - other.rollno;
    }

    public String toString() {
        return "Rollno: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}
