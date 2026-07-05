// implementing constructors
class Student {
    String name;
    int age;
    int rollNo;
    String college;

    Student() {
        // constructor can be oerloaded like functions
    }

    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }
}

public class Demo3 {
    public static void main(String[] args) {

        Student s2 = new Student("Shivangi", 24, 541, "KIIT");
        s2.printDetails();

    }
}