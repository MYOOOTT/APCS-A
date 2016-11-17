public class Book {
    protected String author, title;
    public Book(String name, String writer) {
        title = name;
        author = writer;
    }

    public Book() {
        this(null, null);
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return (title + " by " + author);
    }
    
}