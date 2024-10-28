import java.util.ArrayList;
import java.util.Scanner;

class MyBook {
    private String title;
    private String author;
    private double price;

    public MyBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class MyBookStore {
    private ArrayList<MyBook> books;

    public MyBookStore() {
        books = new ArrayList<>();
    }

    public void addBook(MyBook book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the store.");
        } else {
            System.out.println("Books in the store:");
            for (MyBook book : books) {
                book.display();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBookStore store = new MyBookStore();

for (int i = 0; i < num; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Author: ");
            String author = sc.nextLine();
            
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            System.out.print("Number of Pages: ");
            int numPages = sc.nextInt();
            sc.nextLine(); // Consume the newline

            MyBook book = new MyBook(name, author, price, numPages);
            books.add(book);
        }
                System.out.println("\nBook Details:");
        for (MyBook book : books) {
            System.out.println(book);
        }

        sc.close();
    }
}
