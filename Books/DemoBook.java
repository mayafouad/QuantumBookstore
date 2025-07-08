package Books;

import Strategies.IDelivery;
import Strategies.Ibuy;

public class DemoBook extends Book {
    public DemoBook(String isbn, String title, int publishYear, double price, Ibuy buyStrategy, IDelivery deliveryStrategy) {
        super(isbn, title, publishYear, price, buyStrategy, deliveryStrategy);
    }
}
