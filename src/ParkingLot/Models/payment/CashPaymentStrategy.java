package ParkingLot.Models.payment;

public class CashPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using cash.");
    }
}
