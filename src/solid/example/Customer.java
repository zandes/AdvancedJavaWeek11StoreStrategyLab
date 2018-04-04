package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discount;

    public Customer(String customerName, double billAmount, DiscountStrategy discount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discount = discount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getDiscount() {
        return discount.getBillAmount(billAmount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discount +
                '}';
    }
}
