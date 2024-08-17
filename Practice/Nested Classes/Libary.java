class Libary {
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
        Book book2 = nwBook("To Kill a ockingbird", 
    
        book1.display();
        book2.display();
    }
    

    displayBooks();
    }
}