class Book {
    private String title;
    private String author;
    private double price;
    private int pages;

    Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getPages() {
        return pages;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
        System.out.println();
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 180);
        Book book2 = new Book("1984", "George Orwell", 8.99, 328);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99, 281);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        double priceSum = book1.getPrice() + book2.getPrice() + book3.getPrice();
        System.out.println("Total Price of Books: $" + priceSum);
    }
}