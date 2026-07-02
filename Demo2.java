public class Demo2 {
    public static void main(String[] args) {
        // implementing function overloading in java

        int sum1 = sum(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum1);
        double sum2 = sum(10.5, 20.5);
        System.out.println("Sum of 10.5 and 20.5 is: " + sum2);
        greet();
        greet1();

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void greet() {
        System.out.println("Hello");
    }

    public static int greet1() {
        return 10;
    }

}