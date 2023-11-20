package Theory_Assignment;
class Book{
    private String title;
    private String author;
    private int pageCount;
    private boolean isPopular;

    // Constructors
    public Book(){
        this.title = "No Title";
        this.author = "No Author";
        this.pageCount = 0;
        this.isPopular = false;
    }

    public Book(String title, String author, int pageCount, boolean isPopular){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isPopular = isPopular;
    }

    // Methods
    public void setDetails(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isPopular = false;
    }

    public boolean isPopular(){
        return isPopular;
    }

    public void determinePopularity(){
        if(pageCount > 300){
            isPopular = true;
        }
    }
    public void displayBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Popular: " + isPopular());
    }
}
public class Book_class {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Book 1 information : ___________________________");
        b1.displayBookInfo();
        
        Book b2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 309, false);
        b2.determinePopularity();
        System.out.println("Book 2 information : ___________________________");
        b2.displayBookInfo();
    }
}
