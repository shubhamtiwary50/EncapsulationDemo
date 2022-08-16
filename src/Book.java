public class Book {
    int ISBNNo;
    String bookName;
    String author;
    String genre;
    float price;
    public Book(int ISBNNo, String bookName, String author, String genre, float price)
    {
        this.ISBNNo=ISBNNo;
        this.bookName=bookName;
        this.price=price;
        this.genre=genre;
        this.author=author;
    }
}
