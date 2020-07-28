import java.util.Date;

public class CreditCard extends PaymentCard {

    double creditLimit;

    public CreditCard(String cardNumber, Date expiryDate, int securityNumber, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber);
        this.creditLimit = creditLimit;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0.02 * purchaseAmount;
    }
}
