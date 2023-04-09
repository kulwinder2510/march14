package arraySwitchTim;

public class Mugs implements TimMerchendise{
    @Override
    public String getFeature() {
        return "medium size coffee mug";
    }

    @Override
    public double getPrice() {
        return 13.99;

    }
}
