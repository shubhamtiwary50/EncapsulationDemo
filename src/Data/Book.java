package Data;

public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "ISBNNo=" + ISBNNo +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }

    private double ISBNNo;
     private String bookName;
     private String author;
     private String genre;
     private float price;

     public double getISBNNo() {
         return ISBNNo;
     }

     public void setISBNNo(double ISBNNo) {
         this.ISBNNo = ISBNNo;
     }

     public String getBookName() {
         return bookName;
     }

     public void setBookName(String bookName) {
         this.bookName = bookName;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public String getGenre() {
         return genre;
     }

     public void setGenre(String genre) {
         this.genre = genre;
     }

     public float getPrice() {
         return price;
     }

     public void setPrice(float price) {
         this.price = price;
     }



//        public Book(int ISBNNo, String bookName, String author, String genre, float price)
//        {
//            this.ISBNNo=ISBNNo;
//            this.bookName=bookName;
//            this.price=price;
//            this.genre=genre;
//            this.author=author;
//        }
    }
