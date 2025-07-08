package Strategies;
import Services.ShippingService;

public class ShippingDelivery implements IDelivery {
    @Override
    public double deliver(String email, String address) {
        return ShippingService.shipBook(email, address);
    }
}
