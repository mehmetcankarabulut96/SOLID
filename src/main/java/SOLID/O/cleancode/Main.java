package SOLID.O.cleancode;

public class Main {
    static void main() {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        DiscountStrategy cardDiscount = new CardDiscount();
        processor.execute(creditCard, 250.0, cardDiscount);

        PaymentMethod payPalPayment = new PayPalPayment();
        DiscountStrategy noDiscount = new NoDiscount();
        processor.execute(payPalPayment, 1000.0, noDiscount);
    }
}