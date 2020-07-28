import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    GiftCard giftcard;
    CreditCard creditcard;
    DebitCard debitcard;

    ReportingSoftware repsoft;

    @Before
    public void setup() {
        giftcard = new GiftCard(35);
        creditcard = new CreditCard("012301230", null, 213, 6000);
        debitcard = new DebitCard("0120123", null, 424, 1010, 444);

        repsoft = new ReportingSoftware();
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

    @Test
    public void testCountCharges(){
        creditcard.charge(10);
        creditcard.charge(100);
        assertEquals(2, creditcard.countCharges());
    }

    @Test
    public void testReporting1() {
        repsoft.addTransaction(2);
        repsoft.addTransaction(3);
        repsoft.addTransaction(5);
        repsoft.addTransaction(2);
        assertEquals(4, repsoft.countTransactions(), 0.001);
    }

    @Test
    public void testReporting2() {
        repsoft.addTransaction(2);
        repsoft.addTransaction(3);
        repsoft.addTransaction(5);
        repsoft.addTransaction(2);
        assertEquals(2+3+5+2, repsoft.total(), 0.001);
    }
}
