import java.util.*;

interface LibraryItem {
    String getDetails();
    boolean borrow();
    void returnItem();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getDetails() {
        return "Book: " + title + " by " + author;
    }

    public boolean borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You borrowed the book: " + title);
            return true;
        } else {
            System.out.println("The book is already borrowed.");
            return false;
        }
    }

    public void returnItem() {
        isBorrowed = false;
        System.out.println("You returned the book: " + title);
    }
}

class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void showItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getDetails());
        }
    }

    public LibraryItem getItem(String title) {
        for (LibraryItem item : items) {
            if (item.getDetails().contains(title)) {
                return item;
            }
        }
        return null;
    }
}

public class Inter3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addItem(new Book("Heaven and Hell", "Deepak"));
        library.addItem(new Book("2025", "Vaishnav"));

        while (true) {
            System.out.println("\nLibrary System: ");
            System.out.println("1. View Library Items");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.showItems();
                    break;
                case 2:
                    System.out.print("Enter the book title you want to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    LibraryItem itemToBorrow = library.getItem(borrowTitle);
                    if (itemToBorrow != null) {
                        itemToBorrow.borrow();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the book title you want to return: ");
                    String returnTitle = scanner.nextLine();
                    LibraryItem itemToReturn = library.getItem(returnTitle);
                    if (itemToReturn != null) {
                        itemToReturn.returnItem();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}