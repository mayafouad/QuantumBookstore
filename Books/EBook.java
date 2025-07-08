package Books;

import Strategies.IDelivery;
import Strategies.Ibuy;

public class EBook extends Book {
    private String fileFormat;

    public EBook(String isbn, String title, int publishYear, double price, String fileFormat, Ibuy buyStrategy, IDelivery deliveryStrategy) {
        super(isbn, title, publishYear, price, buyStrategy, deliveryStrategy);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
}
