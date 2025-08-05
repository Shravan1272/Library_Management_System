public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, boolean isAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }

    //Encapsulation
    public String getBookId(){
        return this.bookId;
    }// this is a keyword which represents current object
    public void setBookId(String bookId){
        this.bookId=bookId;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public boolean isAvailable(){
        return this.isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }

    @Override
    public String toString() {
        return "\nBook ID: "+bookId+"\nBook title: "+title+"\nBook's Author: "+author;
    }
}
