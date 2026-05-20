import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input names for dog and cat

        String dName = scanner.nextLine();
        String cName = scanner.nextLine();

        // Create Dog objects
        Abstraction dog = new Dog(dName);
        dog.makeSound();

        // Create Cat objects
        Abstraction cat = new Cat(cName);
        cat.makeSound();

        scanner.close();
    }
}
