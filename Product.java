package BankApplication;

public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockInf;
    private int productWeight;
    private String productDescript;

    public Product(String productName, String productColor, String productCategory, int productStockInf, int productWeight, String productDescriptionInf) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInf = productStockInf;
        this.productWeight = productWeight;
        this.productDescript = productDescriptionInf;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInf() {
        return productStockInf;
    }

    public void setProductStockInf(int productStockInf) {
        this.productStockInf = productStockInf;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescriptionInf() {
        return productDescript;
    }

    public void setProductDescriptionInf(String productDescriptionInf) {
        this.productDescript = productDescriptionInf;
    }
    public void decreasingStock(){
        productStockInf--;
    }
    public boolean stockInf(){
        if (productStockInf>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productStockInf=" + productStockInf +
                ", productWeight=" + productWeight +
                ", productDescriptionInf='" + productDescript + '\'' +
                '}';
    }
}
