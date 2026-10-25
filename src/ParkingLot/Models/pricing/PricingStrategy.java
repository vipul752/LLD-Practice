package ParkingLot.Models.pricing;

public interface PricingStrategy {

    int calculatePricing();

    PricingStrategyType getType();
}
