package arraySwitchTim;

public class Sandwich implements TimConsumable{

    @Override
    public double getPrice() {
        return 12.99;
    }

    @Override
    public int getCalorie() {
        return 213;
    }
}
