package Strategies;
import Services.MailService;

public class EmailDelivery implements IDelivery {
    @Override
    public double deliver(String email, String address) {
        MailService.sendBook(email);
        return 0.0;
    }
}
