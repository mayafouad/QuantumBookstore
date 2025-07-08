package Services;

public class ShippingService {
    public static double shipBook(String email, String address) {
        System.out.println("Shipping to " + email + " at " + address);
        return 10.0; // fixed rate shipping cost
    }
}
