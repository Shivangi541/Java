class Student {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

    }

    public void displaayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

class CollegeStudent extends Student {
    String collegeName;

    CollegeStudent(String name, int age, int rollNo, String collegeName) {
        super(name, age, rollNo);
        this.collegeName = collegeName;
    }

    public void displaayDetails() {
        super.displaayDetails();
        System.out.println("College Name: " + collegeName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("Shivangi", 24, 101, "XYZ College");
        student.displaayDetails();
    }
}