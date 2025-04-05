class Book {
    String title;
    int pages;

    void setBook(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}

class EBook extends Book {
    double fileSizeMB;

    void setFileSize(double size) {
        fileSizeMB = size;
    }

    void downloadTime(double speedMbps) {
        double time = fileSizeMB / speedMbps;
        System.out.println("Downloading \"" + title + "\"...");
        System.out.println("Estimated time: " + String.format("%.2f", time) + " seconds");
    }
}

public class Single1 {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.setBook("Java for Beginners", 320);
        ebook.setFileSize(12.5);
        ebook.downloadTime(5); 
    }
}
