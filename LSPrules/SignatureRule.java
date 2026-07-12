package LSPrules;

class Animal {
    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

class Dog extends Animal {
    @Override
    void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}

public class SignatureRule {
    public static void main(String[] args) {
        // Animal myAnimal = new Dog();
        Animal myAnimal = new Animal();
        myAnimal.eat("bone"); // This will call the Animal's eat method
    }
}