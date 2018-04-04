package solid.example;

public class Discount implements DiscountStrategy{
    @Override
    public double getBillAmount(double billAmount){
        return billAmount * 0.5;
    }
}