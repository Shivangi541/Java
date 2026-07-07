class Student {
    String name;
    int age;
    int rollNo;
    static String schoolName;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    static {
        schoolName = "ABC School";
    }

}

public class Static {
    public static void main(String[] args) {
        Student student1 = new Student("John", 15, 101);
        Student student2 = new Student("Alice", 16, 102);

        Student.schoolName = "XYZ School"; // Changing the static variable value
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", Roll No: " + student1.rollNo
                + ", School: " + Student.schoolName);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", Roll No: " + student2.rollNo
                + ", School: " + Student.schoolName);
    }
}