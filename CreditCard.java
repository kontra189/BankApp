package BankApplication;


public class CreditCard {
    private int creditCardNumber;
    private User creditCardUser;
    private int securityCode;
    private String expDateOfCard;

    public CreditCard(int creditCardNumber, User creditCardUser, int securityCode, String expirationDateOfCard) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expDateOfCard = expirationDateOfCard;
        creditCardUser.addCreditCard(this);
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public User getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDateOfCard() {
        return expDateOfCard;
    }

    public void setExpirationDateOfCard(String expirationDateOfCard) {
        this.expDateOfCard = expirationDateOfCard;
    }

    @Override
    public String toString() {
        return "creditCardNumber=" + creditCardNumber +
                ", creditCardUser=" + creditCardUser +
                ", securityCode=" + securityCode +
                ", expirationDateOfCard='" + expDateOfCard + '\'' +
                '}';
    }
}
