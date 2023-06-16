package BankApplication;


public class Test {
    public static void main(String[] args) {
        User user1 = new User("dasda","dsad","dasdas","dsadsa","dsadas","dsad","dsadsa","dsad");
        CreditCard creditCard1 = new CreditCard(15,user1,15,"dasdsa");
        Product product1 = new Product("Product1","saddas","dsad",1,30,"dasdas");
        Product product2 = new Product("Product2","saddas","dsad",15,30,"dasdas");

        //System.out.println(product1.getProductStockInf());
        /*System.out.println(product1.getProductStockInf());
        user1.addProductToFavorites(product1);
        user1.addProductToFavorites(product2);
        user1.removeProductFromFavourites(product1);
        user1.purchasing(product1,creditCard1);*/
        Order order1 = new Order(user1,product1,creditCard1);
        order1.ordering();
    }
}
