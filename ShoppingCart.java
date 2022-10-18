import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public int calculateTotal(){
        int total = 0;

        for(int i = 0; i < items.size(); i++){
           total = total + items.get(i).getCost();
        } return total;
    }

    public void pay(PaymentStrategy paymentMethod ) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);

        Item item2 = new Item("5678",40);



        cart.addItem(item1);

        cart.addItem(item2);



//pay by paypal

        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));



//pay by credit card

        cart.pay(new CreditCardStrategy("123456789012", "786", "12/15"));
    }
}
