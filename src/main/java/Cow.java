public class Cow implements Domesticatable, Tradable {
    private int price;

    Cow(int price) {
        super();
        this.price = price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    @Override
    public String sound() {
        return "Moo!";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Cost: " + this.price +")";
    }
}
