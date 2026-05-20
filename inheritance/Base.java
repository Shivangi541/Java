package inheritance;

public class Base {
    private String name;// encpsulation is done by making the data members private
    private int age;

    // constructor
    public Base(String name, int age) {
        System.out.println("Base class constructor called");
        this.name = name;
        this.age = age;

    }

    // getter setter functions to access the private data menbers
    public void getName() {
        System.out.println("Name : " + name);
    }

    public void getAge() {
        System.out.println("Age : " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Child extends Base {
    private String school;
    private String grade;
    public int rollNo;

    public Child(String name, int age, String school, String grade, int rollNo) {
        super(name, age);// parent class constructor called using super keyword
        System.out.println("Child class constructor called");
        this.school = school;
        this.grade = grade;
        this.rollNo = rollNo;
    }

    public void getSchool() {
        System.out.println("School : " + school);
    }

    public void getGrade() {
        System.out.println("Grade : " + grade);
    }

    public void getRollNo() {
        System.out.println("Roll No : " + rollNo);
    }
}

// multilevel inheritance is also possible in java
class GrandChild extends Child {
    private String hobby;
    public String course;

    public GrandChild(String name, int age, String school, String grade, int rollNo, String hobby, String course) {
        super(name, age, school, grade, rollNo);
        System.out.println("GrandChild class constructor called");
        this.hobby = hobby;
        this.course = course;
    }

    public void getHobby() {
        System.out.println("Hobby : " + hobby);
    }

    public void getCourse() {
        System.out.println("Course : " + course);
    }
}