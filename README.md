# 📚 Quantum Bookstore (OOP)

**Quantum Bookstore** is a Java-based bookstore system. It supports multiple book types with different purchasing and delivery behaviors, using the **Strategy Pattern** for clean, maintainable, and easily extensible design.

---

## 🧩 Features

- ✅ Supports 3 book types:
  - **PaperBook**: Buyable with stock, delivered via shipping
  - **EBook**: Buyable, delivered via email
  - **DemoBook**: Not for sale, no delivery

- ✅ Add books to inventory with
- ✅ Remove outdated books (based on year)
- ✅ Buy books by ISBN, quantity, email, and address
  - Updates inventory
  - Returns the paid amount
  - Calls delivery (email/shipping) methods

- ✅ Uses **Strategy Pattern** for:
  - Purchase logic (`Buyable`, `EBuy`, `NotBuyable`)
  - Delivery logic (`ShippingDelivery`, `EmailDelivery`, `NoDelivery`)

- ✅ Easily extensible: Add new book types or delivery methods without modifying existing classes

---

## 📁 Project Structure
```plaintext
src/

│
├── Books/
│ └── Book.java
│ ├── DemoBook.java
│ ├── PaperBook.java
│ ├── EBook.java
│
├── Strategies/
│ ├── Ibuy.java 
│ ├── Buyable.java
│ ├── EBuy.java
│ ├── NotBuyable.java
│ ├── IDelivery.java
│ ├── ShippingDelivery.java
│ ├── EmailDelivery.java
│ └── NoDelivery.java
│
├── Services/
│ ├── InventoryService.java
│ ├── MailService.java
│ └── ShippingService.java
│
└── Main.java
