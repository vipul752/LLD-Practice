package ParkingLot.Models.payment;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using card.");
    }
}
