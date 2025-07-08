package Strategies;

public class NotBuyable implements Ibuy {
    @Override
    public boolean canBuy(int quantity) {
        return false;
    }

    @Override
    public void handleBuy(int quantity) {
        System.out.println("This item is not available for purchase.");
    }

    @Override
    public double getPrice(int quantity) {
        System.out.println("This item is not available for purchase.");
        return 0.0;
    }
    
}
