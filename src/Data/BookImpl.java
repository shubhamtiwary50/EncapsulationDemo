package Data;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(" Book name : "+book.getBookName() );
        book.setBookName(" Malgudi Days ");
        System.out.println(" ISBN no : "+book.getISBNNo());
        book.setISBNNo(1234567798534.0);
        System.out.println(" Author name :"+book.getAuthor());
        book.setAuthor(" R.K Narayan ");
        System.out.println("book.getGenre() = " + book.getGenre());
        book.setGenre(" Fiction ");
        System.out.println("book.getPrice() = " + book.getPrice());
        book.setPrice(599f);
        System.out.println( " Details of the books "+ book.toString());
    }
}
