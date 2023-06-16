package BankApplication;

import java.util.ArrayList;

public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddresses;
    private String workAddresses;
    private ArrayList<Product> productsOrdered;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<CreditCard> creditCard;

    public User(String username, String name, String surname, String dateOfBirth, String password, String email, String homeAddresses, String workAddresses) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddresses = homeAddresses;
        this.workAddresses = workAddresses;
        this.favoriteProducts = new ArrayList<>();
        this.productsOrdered = new ArrayList<>();
        this.creditCard = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddresses() {
        return homeAddresses;
    }

    public void setHomeAddresses(String homeAddresses) {
        this.homeAddresses = homeAddresses;
    }

    public String getWorkAddresses() {
        return workAddresses;
    }

    public void setWorkAddresses(String workAddresses) {
        this.workAddresses = workAddresses;
    }

    public void addProductToFavorites(Product product){
        favoriteProducts.add(product);
        System.out.println("Features of the added product :" +product.toString());
        System.out.println("The product has been added to your favorite products.");
        System.out.println("Your favourite products are : ");
        for (Product i : favoriteProducts){
            System.out.println(i.getProductName());
        }

    }
    public void removeProductFromFavourites(Product product){
        favoriteProducts.remove(product);
        System.out.println("Features of the deleted product : " + product.toString());
        System.out.println("The product has been removed from your favorite products.");
        System.out.println("Your favourite products are : ");
        for (Product i : favoriteProducts){
            System.out.println(i.getProductName());
        }

    }
    public void purchasing(Product product, CreditCard creditCard){
        if(product.stockInf()){
            System.out.println("Your ordering is succesfull");
            System.out.println("Features of the spent credit card :"+creditCard.toString());
            System.out.println("Features of the purchased product :"+product.toString());
            productsOrdered.add(product);
            product.decreasingStock();
        }else{
            System.out.println("The product stock is empty");
        }
    }


    public void addCreditCard(CreditCard creditCards){
        creditCard.add(creditCards);
    }



}
