import java.util.ArrayList;
import java.util.List;

public abstract class Member {
    private String id;
    private String name;
    private String contact;

    private List<Book> issuedBooks = new ArrayList<>();
    public List<Book> getIssuedBooks(){
        return issuedBooks;
    }

    public void addIssuedBook(Book book){
        issuedBooks.add(book);
    }
    public void removeIssuedBook(Book book){
        issuedBooks.remove(book);
    }
    public Member(String id,String name,String contact) {
        this.id = id;
        this.name=name;
        this.contact=contact;
    }
    //abstract method
    public abstract int getMaxBooksAllowed();

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
