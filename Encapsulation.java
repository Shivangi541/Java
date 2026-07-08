class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student("Shivangi", -24);
        System.out.println("Student Details : \n");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("\nUpdating Student Details : \n");
        student.setName("Shivangi Dutta");
        student.setAge(25);
        System.out.println("Updated Name : " + student.getName());
        System.out.println("Updated Age : " + student.getAge());
    }
}