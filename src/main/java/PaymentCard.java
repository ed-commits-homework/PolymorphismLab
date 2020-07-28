import java.util.ArrayList;
import java.util.Date;

public abstract class PaymentCard implements IChargeable {
    String cardNumber;
    Date expiryDate;
    int securityNumber;
    ArrayList<Double> charges;
    //Charging implies updating the list of charges

}
