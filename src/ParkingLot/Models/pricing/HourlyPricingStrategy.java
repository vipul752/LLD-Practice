package ParkingLot.Models.pricing;

public class HourlyPricingStrategy implements PricingStrategy{
    private final int perHourPrice;
    private  int numberOfHours;

    public HourlyPricingStrategy(int perHourPrice){
        this.perHourPrice = perHourPrice;
    }

    @Override
    public int calculatePricing() {
        return perHourPrice * numberOfHours;
    }

    @Override
    public PricingStrategyType getType() {
        return PricingStrategyType.HOURLY;
    }


    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }


}
