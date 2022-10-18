public class PaypalStrategy implements PaymentStrategy{

    String emailID;
    String password;

    PaypalStrategy(String emailID, String password) {
        this.emailID =  emailID;
        this.password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Amount due Paypal: " + amount);
    }
}
