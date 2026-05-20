package inheritance;

public class Main {
    public static void main(String[] args) {
        // Base b1 = new Base("Shivangi", 24);
        // b1.getName();
        // b1.getAge();
        // b1.setName("Shivangi Dutta");
        // b1.getName();
        // b1.setAge(23);
        // b1.getAge();

        // Child c1 = new Child("Shivangi", 24, "KIIT", "A+", 101);
        // c1.getName();
        // c1.getAge();
        // c1.getSchool();
        // c1.getGrade();
        // c1.getRollNo();

        GrandChild g1 = new GrandChild("Shivangi", 24, "KIIT", "A+", 101, "Coding", "B.Tech");
        g1.getName();
        g1.getAge();
        g1.getSchool();
        g1.getGrade();
        g1.getRollNo();
        g1.getHobby();
        g1.getCourse();
    }
}