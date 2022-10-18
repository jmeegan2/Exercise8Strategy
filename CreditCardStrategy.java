public class CreditCardStrategy implements PaymentStrategy {
    String cardHolderName;
    String cardNo;
    String expDate;

     CreditCardStrategy(String cardHolderName, String cardNo,  String expDate) {
         this.cardHolderName = cardHolderName;
         this.cardNo = cardNo;
         this.expDate = expDate;
     }


    @Override
    public void pay(int amount) {
        System.out.println("Amount due: " + amount);
    }
}
