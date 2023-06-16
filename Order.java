package BankApplication;


public class Order {
    private User orderedBy;
    private Product orderedProduct;
    private CreditCard paymentBy;

    public Order(User orderedBy, Product orderedProduct, CreditCard creditCard) {
        this.orderedBy = orderedBy;
        this.orderedProduct = orderedProduct;
        this.paymentBy = creditCard;
    }

    public User getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(User orderedBy) {
        this.orderedBy = orderedBy;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public CreditCard getPaymentBy() {
        return paymentBy;
    }

    public void setPaymentBy(CreditCard paymentBy) {
        this.paymentBy = paymentBy;
    }

    public void ordering(){
        if (orderedProduct.stockInf()){
            orderedBy.purchasing(orderedProduct,paymentBy);
        }else {
            System.out.println("The product stock is empty");
        }

    }


}
