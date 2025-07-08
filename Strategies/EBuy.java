package Strategies;

public class EBuy implements Ibuy{
    private double price;
    public EBuy(double price) {
        this.price = price;
    }

    @Override
    public boolean canBuy(int amount) {
        return true;
    }

    @Override
    public void handleBuy(int amount) {
    }

    @Override
    public double getPrice(int amount) {
        return price;
    }

}
