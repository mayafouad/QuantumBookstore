package Books;

import Strategies.IDelivery;
import Strategies.Ibuy;

public class Book {
    protected String isbn;
    protected String title;
    protected int publishYear;
    protected double price;
    protected Ibuy buyStrategy;
    protected IDelivery deliveryStrategy;
    public Book(String isbn, String title, int publishYear, double price, Ibuy buyStrategy, IDelivery deliveryStrategy) {
        this.isbn = isbn;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        this.buyStrategy = buyStrategy;
        this.deliveryStrategy = deliveryStrategy;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Ibuy getBuyStrategy() {
        return buyStrategy;
    }

    public IDelivery getDeliveryStrategy() {
        return deliveryStrategy;
    }

}
