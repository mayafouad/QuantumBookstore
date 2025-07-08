package Books;

import Strategies.IDelivery;
import Strategies.Ibuy;

public class PaperBook extends Book {
    private int quantity;

    public PaperBook(String isbn, String title, int publishYear, double price, int quantity, Ibuy buyStrategy, IDelivery deliveryStrategy) {
        super(isbn, title, publishYear, price, buyStrategy, deliveryStrategy);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
