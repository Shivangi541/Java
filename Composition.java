class CPU {

    private String brand;
    private int numberOfCores;
    private double clockSpeed;

    CPU(String brand, int numberOfCores, double clockSpeed) {
        this.brand = brand;
        this.numberOfCores = numberOfCores;
        this.clockSpeed = clockSpeed;
    }

    public void displayInfo() {
        System.out.println("CPU Brand: " + brand);
        System.out.println("Number of Cores: " + numberOfCores);
        System.out.println("Clock Speed: " + clockSpeed + " GHz");
    }
}

class RAM {

    private int capacity;
    private String type;
    private int frequency;

    RAM(int capacity, int frequency, String type) {
        this.capacity = capacity;
        this.type = type;
        this.frequency = frequency;
    }

    public void displayInfo() {
        System.out.println("RAM Capacity: " + capacity + " GB");
        System.out.println("RAM Type: " + type);
        System.out.println("RAM Frequency: " + frequency + " MHz");
    }
}

class Computer {
    private CPU cpu;
    private RAM ram;
    private String name;
    private String manufacturer;

    Computer(String name, String manufacturer, CPU cpu, RAM ram) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("Computer Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        cpu.displayInfo();
        ram.displayInfo();
    }
}

public class Composition {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", 8, 3.6);
        RAM ram = new RAM(16, 3200, "DDR4");
        Computer computer = new Computer("MyPC", "Dell", cpu, ram);

        computer.displayInfo();
    }
}