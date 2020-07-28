import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    GiftCard giftcard;
    CreditCard creditcard;
    DebitCard debitcard;

    @Before
    public void setup() {
        giftcard = new GiftCard(35);
        creditcard = new CreditCard("012301230", null, 213, 6000);
        debitcard = new DebitCard("0120123", null, 424, 1010, 444);
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    // Test the gift card
    @Test
    public void testGiftCardTransactionCost() {
        assertEquals(0, giftcard.getTransactionCost(100), 0.001);
    }

    @Test
    public void testGiftCardCharge() {
        giftcard.charge(5);
        assertEquals(35-5, giftcard.getAmount(), 0.001);
    }

    // Test credit card
    @Test
    public void testCreditCardTransactionCost() {
        assertEquals(2, creditcard.getTransactionCost(100), 0.001);
    }

    // Test debit card
    @Test
    public void testDebitCardTransactionCost() {
        assertEquals(1, debitcard.getTransactionCost(100), 0.001);
    }
}
