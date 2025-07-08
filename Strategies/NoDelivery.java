package Strategies;

public class NoDelivery implements IDelivery {
    @Override
    public double deliver(String email, String address) {
        System.out.println("No delivery method selected.");
        return 0.0;
    }
}
