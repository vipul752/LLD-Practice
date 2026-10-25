package ParkingLot.Models.pricing;

public class ConstantPricingStrategy implements PricingStrategy{
    private final int price;

    public ConstantPricingStrategy(int price){
        this.price =price;
    }

    @Override
    public int calculatePricing() {
        return this.price;
    }

    @Override
    public PricingStrategyType getType() {
        return PricingStrategyType.CONSTANT;
    }


}
