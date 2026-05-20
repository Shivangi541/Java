
interface Interfaces {
    public void processPayment(double amount);
}

class CreditCardPayment implements Interfaces {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}

class UPIPayment implements Interfaces {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }
}