import java.util.ArrayList;

class Book{
    public String name, author;
    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }
}

class Mylibrary{
    ArrayList<Book> books;
    public Mylibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        books.add(book);
    }
    public void issuedBook(Book book){
        System.out.println("The book has been issued from the library");
        books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("This Book has been returned");
        books.add(book);
    }
    public void availableBooks(){
        System.out.println("Available Books in the library: ");
        for (Book book:books){
            System.out.println(book.name + " - " + book.author );
        }
    }
}


public class p_43_Exercise_Library_Management {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        bk.add(new Book("Math", "Jhon"));
        bk.add(new Book("English", "aaaa"));
        bk.add(new Book("Bangla", "bbbb"));
        bk.add(new Book("physic", "pppp"));

        Mylibrary l= new Mylibrary(bk);
        l.availableBooks();
        l.addBook(new Book("Math2", "Jhon2"));
        l.availableBooks();
        l.issuedBook(bk.getFirst());
        l.availableBooks();
        l.returnBook(new Book("math", "jhon"));
        l.availableBooks();
    }
}
