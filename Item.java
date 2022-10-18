public class Item {
    private String upcCode;
    private int cost;

    public Item(String upcCode, int cost){
        this.upcCode = upcCode;
        this.cost = cost;
    }

    public String getUpcCode() {
       return upcCode;

    }

    public  int getCost() {
       return cost;
    }

}

