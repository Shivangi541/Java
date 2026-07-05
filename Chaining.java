class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        // default constructor
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College: " + college);
    }
}

public class Chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shivangi");
        Student s3 = new Student("Shivangi", 24);
        Student s4 = new Student("Shivangi", 24, 541);
        Student s5 = new Student("Shivangi", 24, 541, "KIIT");

        s1.printDetails();
        System.out.println("\n");
        s2.printDetails();
        System.out.println("\n");
        s3.printDetails();
        System.out.println("\n");
        s4.printDetails();
        System.out.println("\n");
        s5.printDetails();
    }
}
