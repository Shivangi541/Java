interface PaymentMethod {
    public void processpayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void processpayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    public void processpayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class UPIPayment implements PaymentMethod {
    public void processpayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

class PaymentProcessor {
    private PaymentMethod paymentMethod;

    PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.processpayment(amount);
    }
}

public class OCP {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        creditCardProcessor.processPayment(100.0);

        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalPayment());
        paypalProcessor.processPayment(50.0);

        PaymentProcessor upiProcessor = new PaymentProcessor(new UPIPayment());
        upiProcessor.processPayment(75.0);
    }
}