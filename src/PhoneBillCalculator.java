public class PhoneBillCalculator {
    public static void main(String[] args) {
        /*--------------CLIENT1------------*/

        PhoneBill client1 = new PhoneBill();
        client1.printItemizedBill();

        /*--------------CLIENT3------------*/

        PhoneBill client2 = new PhoneBill(2);
        client2.setMinutesUsed(205);
        client2.printItemizedBill();

        /*--------------CLIENT3------------*/

        PhoneBill client3 = new PhoneBill(3, 100, 100, 115);
        client3.printItemizedBill();
    }
}

