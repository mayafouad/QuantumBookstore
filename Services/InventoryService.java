package Services;

import Books.Book;
import java.util.*;

import Strategies.IDelivery;
import Strategies.Ibuy;

public class InventoryService {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println(book.getTitle() + " has been added.");
    }

    public List<String> removeOutdatedBooks(int currentYear, int maxAge) {
        List<String> outdatedBooks = new ArrayList<>();
        for (Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Book> entry = it.next();
            Book book = entry.getValue();
            if (currentYear - book.getPublishYear() > maxAge) {
                outdatedBooks.add(book.getTitle());
                it.remove(); 
            }
        }
        return outdatedBooks;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
           System.out.println("Book not found.");
           return 0.0;
        }
        Ibuy buyStrategy = book.getBuyStrategy();
        IDelivery deliveryStrategy = book.getDeliveryStrategy();
        if(buyStrategy.canBuy(quantity)) {
            buyStrategy.handleBuy(quantity);
            double deliveryCost = deliveryStrategy.deliver(email, address);
            double totalCost = buyStrategy.getPrice(quantity) + deliveryCost;
            System.out.println("Book: " + book.getTitle());
            System.out.println("Quantity: " + quantity);
            System.out.println("Delivery cost: " + deliveryCost);
            System.out.println("Price per book: " + book.getPrice());
            System.out.println("Total cost: " + totalCost);
            System.out.println("Order processed successfully.");
            return totalCost;
        }
        
        System.out.println("Unable to process order.");
        return 0.0;
    }
}
