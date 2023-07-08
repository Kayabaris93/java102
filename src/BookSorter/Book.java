package BookSorter;

public class Book implements Comparable <Book>{

    private String bookName;
    private int bookPage;

    private String bookAuthorName;
    private String bookPublishDate;

/*
 @Override
    public int compareTo(Book b) {
        return this.getBookName().compareTo(b.getBookName());
    }
*/


    @Override
    public int compareTo(Book b) {
        return this.getBookPage()-b.getBookPage();
    }




    public Book(String bookName, int bookPage, String bookAuthorName, String bookPublishDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.bookAuthorName = bookAuthorName;
        this.bookPublishDate = bookPublishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(String bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }
}
