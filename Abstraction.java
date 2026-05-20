

abstract class Abstraction {
    protected String name;

    public Abstraction(String name) {
        this.name = name;
    }

    abstract public void makeSound();
}

class Dog extends Abstraction {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog " + name + " says: Woof!");
    }
}

class Cat extends Abstraction {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat " + name + " says: Meow!");
    }
}
