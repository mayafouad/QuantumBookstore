package Strategies;

public class Buyable implements Ibuy {
    private int stock;
    private double price;

    public Buyable(int stock, double price) {
        this.stock = stock;
        this.price = price;
    }

    @Override
    public boolean canBuy(int quantity) {
        return stock >= quantity && quantity > 0 && quantity <= stock;
    }

    @Override
    public void handleBuy(int quantity) {
        if (stock < quantity)
            System.out.println("Not enough stock.");
        stock -= quantity;
    }

    @Override
    public double getPrice(int quantity) {
        return price * quantity;
    }
}
