import java.util.Date;

public abstract class PaymentCard implements IChargeable {
    String cardNumber;
    Date expiryDate;
    int securityNumber;
    double charges;
    //Charging implies updating the list of charges

}
