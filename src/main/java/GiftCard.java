public class GiftCard implements IChargeable{
    double amount;

    public GiftCard(double amount) {
        this.amount = amount;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        this.amount -= purchaseAmount;
    }

    public double getAmount(){
        return amount;
    }
}
