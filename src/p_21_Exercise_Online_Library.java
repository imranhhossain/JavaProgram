class Library{
    String []availableBooks;
    int no_of_books;

    Library(){
        this.availableBooks = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book){
        this.availableBooks[this.no_of_books] = book;
        System.out.println(book + " Has been added to the Library");
        this.no_of_books++;
    }

    public void showAvailableBooks(){
        System.out.println("Available Books are : ");
        for(int i=0; i<availableBooks.length; i++){
            if(availableBooks[i] == null){
                continue;
            }
            System.out.println("* "+availableBooks[i]);
        }
    }


    public void issueBook(String book){
        for(int i=0; i<availableBooks.length; i++){
            if(availableBooks[i] != null && book.equals(availableBooks[i])){
                System.out.println(availableBooks[i] + " Book has been issued From the Library");
                availableBooks[i] = null;
                return;
            }
        }
            System.out.println( book + "Book are not available");
    }

    public void returnBook(String book){
        addBook(book);
    }
}


public class p_21_Exercise_Online_Library {
    public static void main(String[] args) {

        Library l = new Library();
        l.addBook("Bangla");
        l.addBook("English");
        l.addBook("Math");
        l.addBook("C++");
        l.showAvailableBooks();
        l.issueBook("Bangla");
        l.issueBook("physics");
        l.showAvailableBooks();
        l.returnBook("Bangla");
        l.showAvailableBooks();
    }
}
