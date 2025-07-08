package Strategies;

public interface Ibuy {
    boolean canBuy(int quantity);
    void handleBuy(int quantity);
    double getPrice(int quantity);
}
