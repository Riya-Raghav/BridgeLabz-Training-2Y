class Book {
    static String libraryName = "City Library";
    String title, author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        displayLibraryName();
        Book b1 = new Book("Java Basics", "James", "12345");
        Book b2 = new Book("Python Guide", "Guido", "67890");
        b1.display();
        b2.display();
    }
}
