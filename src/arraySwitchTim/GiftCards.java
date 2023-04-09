package arraySwitchTim;

public class GiftCards implements TimMerchendise{
    @Override
    public String getFeature() {
        return "buy 5 get 1 free Donut";
    }

    @Override
    public double getPrice() {
        return 6.99;
    }
}
