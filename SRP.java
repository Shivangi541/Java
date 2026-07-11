class Student {
    private String name;
    private int studentID;
    private int marks1, marks2, marks3;

    Student(String name, int studentID, int marks1, int marks2, int marks3) {
        this.name = name;
        this.studentID = studentID;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }
}

class GradeCalculator {

    private Student student;
    private double average;
    private int total;

    GradeCalculator(Student student) {
        this.student = student;
    }

    public int calculateTotal() {
        total = student.getMarks1() + student.getMarks2() + student.getMarks3();
        return total;
    }

    public double calculateAverage() {
        average = calculateTotal() / 3.0;
        return average;
    }

    public String determineGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public StudentResult getStudentResult() {
        int totalmarks = calculateTotal();
        double averageMarks = calculateAverage();
        String status = (averageMarks >= 60) ? "Pass" : "Fail";
        return new StudentResult(totalmarks, averageMarks, status);
    }
}

class StudentResult {
    private int total;
    private double average;
    private String status;

    StudentResult(int total, double average, String status) {
        this.total = total;
        this.average = average;
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getStatus() {
        return status;
    }
}

class ResultPrinter {
    private Student student;
    private StudentResult studentResult;

    ResultPrinter(Student student, StudentResult studentResult) {
        this.student = student;
        this.studentResult = studentResult;
    }

    public void printResult() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Total Marks: " + studentResult.getTotal());
        System.out.println("Average Marks: " + studentResult.getAverage());
        System.out.println("Status: " + studentResult.getStatus());
    }
}

public class SRP {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345, 85, 90, 78);
        GradeCalculator gradeCalculator = new GradeCalculator(student);
        StudentResult studentResult = gradeCalculator.getStudentResult();
        ResultPrinter resultPrinter = new ResultPrinter(student, studentResult);
        resultPrinter.printResult();
    }
}