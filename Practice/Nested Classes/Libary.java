public class Library {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    static void displayBooks() {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        book1.display();
        book2.display();
    }

    public static void main(String[] args) {
        displayBooks();
    }
}
