package solid.example;

public class Liquidation implements DiscountStrategy{
    @Override
    public double getBillAmount(double billAmount){
        return billAmount * 0.25;
    }
}