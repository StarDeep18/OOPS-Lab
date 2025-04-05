class Item {
    String title;
    String author;

    Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBasicInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends Item {
    int pages;
    String genre;

    Book(String title, String author, int pages, String genre) {
        super(title, author);
        this.pages = pages;
        this.genre = genre;
    }

    void displayBookInfo() {
        displayBasicInfo();
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
    }
}

class DigitalBook extends Book {
    int fileSize; 
    String quality;

    DigitalBook(String title, String author, int pages, String genre, int fileSize, String quality) {
        super(title, author, pages, genre);
        this.fileSize = fileSize;
        this.quality = quality;
    }

    void displayDigitalInfo() {
        displayBookInfo();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Quality: " + quality);
        System.out.println("Estimated Download Time: " + calculateDownloadTime() + " seconds");
    }

    int calculateDownloadTime() {
        int speed = 5;
        return fileSize / speed;
    }
}

public class Multi2 {
    public static void main(String[] args) {
        DigitalBook dBook = new DigitalBook("Heaven And Hell", "Deepak", 666, "Fantasy", 50, "High");
        dBook.displayDigitalInfo();
    }
}
