import java.util.List;

import Books.Book;
import Services.InventoryService;
import Strategies.*;

public class Main {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();

        // Paper book with buyable strategy & shipping delivery
        Book paper = new Book("111", "Clean Code", 2008, 100,
                new Buyable(10, 100),
                new ShippingDelivery());
        // Ebook with buyable strategy & email delivery
        Book ebook = new Book("222", "Effective Java", 2018, 150,
                new EBuy(150),
                new EmailDelivery());
        // Demo book with not buyable strategy & no delivery
        Book demo = new Book("333", "AI Research Preview", 2020, 200,
                new NotBuyable(),
                new NoDelivery());

        // Add books to inventory
        inventory.addBook(paper);
        inventory.addBook(ebook);
        inventory.addBook(demo);

        System.out.println("-----------------------------------------------------");

        // Test buying books
        // Buying a paper book with sufficient quantity
        inventory.buyBook("111", 2, "a@example.com", "Cairo");
        System.out.println("-----------------------------------------------------");
        // Buying a paper book with insufficient quantity
        inventory.buyBook("111", 12, "a@example.com", "Cairo");
        System.out.println("-----------------------------------------------------");
        // Buying an ebook
        inventory.buyBook("222", 1, "b@example.com", "Cairo");
        System.out.println("-----------------------------------------------------");
        // Buying a demo book 
        inventory.buyBook("333", 1, "x@example.com", "Giza");
        System.out.println("-----------------------------------------------------");
        // Buying a not available book
        inventory.buyBook("000", 1, "x@example.com", "Giza");
        System.out.println("-----------------------------------------------------");

        // Test removing outdated books
        List<String> outdatedBooks = inventory.removeOutdatedBooks(2025, 10);
        System.out.println("Outdated books:");
        for (String book : outdatedBooks) {
            System.out.println(book + " is outdated and removed from inventory.");
        }
    }
}


/*
Clean Code has been added.
Effective Java has been added.
AI Research Preview has been added.
-----------------------------------------------------
Shipping to a@example.com at Cairo
Book: Clean Code
Quantity: 2
Delivery cost: 10.0
Quantity: 2
Delivery cost: 10.0
Price per book: 100.0
Total cost: 210.0
Order processed successfully.
-----------------------------------------------------
Unable to process order.
-----------------------------------------------------
Quantity: 2
Delivery cost: 10.0
Price per book: 100.0
Total cost: 210.0
Quantity: 2
Delivery cost: 10.0
Price per book: 100.0
Delivery cost: 10.0
Price per book: 100.0
Total cost: 210.0
Order processed successfully.
Order processed successfully.
-----------------------------------------------------
-----------------------------------------------------
Unable to process order.
-----------------------------------------------------
Sending to b@example.com
Sending to b@example.com
Book: Effective Java
Quantity: 1
Delivery cost: 0.0
Price per book: 150.0
Total cost: 150.0
Order processed successfully.
-----------------------------------------------------
Unable to process order.
-----------------------------------------------------
Book not found.
-----------------------------------------------------
Outdated books:
Clean Code is outdated and removed from inventory.

 */
