package shoppingAPI.demo.entity;

public class Payment {
    private String id;
    private String PaymentMethod;
    private String PaymentDate;
    private double price;

    public Payment() {
    }

    public Payment(String id, String PaymentMethod, String PaymentDate, double price) {
        this.id = id;
        this.PaymentMethod = PaymentMethod;
        this.PaymentDate = PaymentDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        PaymentDate = paymentDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
