package solid.example;

public class Sale implements DiscountStrategy{
    @Override
    public double getBillAmount(double billAmount){
        return billAmount * 0.9;
    }
}