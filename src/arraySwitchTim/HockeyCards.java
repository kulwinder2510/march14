package arraySwitchTim;

public class HockeyCards implements TimMerchendise{
    @Override
    public String getFeature() {
        return "free points";
    }

    @Override
    public double getPrice() {
        return 5.99;
    }
}
