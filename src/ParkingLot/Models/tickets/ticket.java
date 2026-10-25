package ParkingLot.Models.tickets;

import ParkingLot.Models.mobility.Vehicle;
import ParkingLot.Models.parking.ParkingSlot;
import ParkingLot.Models.payment.PaymentStrategy;
import ParkingLot.Models.pricing.PricingStrategy;

import java.util.List;
import java.util.Optional;

public class ticket {
    private int entryTime;
    private Optional<Integer> exitTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private List<PricingStrategy> pricingStrategies;
    private Optional<PaymentStrategy> paymentStrategy;

    public ticket(int entryTime,Optional<Integer> exitTime,Vehicle vehicle,ParkingSlot parkingSlot,List<PricingStrategy> pricingStrategies,Optional<PaymentStrategy> paymentStrategy) {
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.pricingStrategies = pricingStrategies;
        this.paymentStrategy = paymentStrategy;
    }

   public void setExitTime(Integer exitTime){
        this.exitTime = Optional.of(exitTime);
   }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = Optional.of(paymentStrategy);
    }

    public void calculateAndPay(){
        //

        int price = pricingStrategies.stream().mapToInt(PricingStrategy::calculatePricing).sum();
        System.out.println("Price Calculated" + price);
        paymentStrategy.get().pay(price);
    }
}