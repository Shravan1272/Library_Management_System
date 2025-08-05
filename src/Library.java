import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{
    private List<Book> books;
    private List<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    //Methods
    public void addBook(Book book){
        if(book==null){
            System.out.println("Cant add");
            return;
        }
        if(books.contains(book)){
            System.out.println("his book is already in the library.");
            return;
        }
        else{
            books.add(book);
        }
    }

    public boolean issueBook(String bookId, String memberId){
        Book bookToIssue =null;
        Member issuingMember=null;

        //find the book by id
        for(Book b:books){
            if(b.getBookId().equalsIgnoreCase(bookId)){
                bookToIssue=b;
                break;
            }
        }
        //find member by id
        for(Member m:members){
            if(m.getId().equalsIgnoreCase(memberId)){
                issuingMember=m;
                break;
            }
        }
        //check if book/member exists
        if(bookToIssue==null){
            System.out.println("Book not found");
            return false;
        }
        if(issuingMember==null){
            System.out.println("Member not found");
            return false;
        }

        //check if book is available
        if(!bookToIssue.isAvailable()){
            System.out.println("Book is currently issued to someone else");
            return false;
        }
        //check members max limit
        if(issuingMember.getIssuedBooks().size()>issuingMember.getMaxBooksAllowed()){
            System.out.println("Member has already reached the max allowed book limit.");
            return false;
        }
        //finally issue the book
        issuingMember.addIssuedBook(bookToIssue);
        bookToIssue.setAvailable(false);
        System.out.println("Book issued successfully to: "+issuingMember.getName()+".");
        return true;
    }

    public void addMember(Member member){
        if(member== null){
            System.out.println("Cant add");
            return;
        }
        if(members.contains(member)){
            System.out.println("Theres already member present with same credentials");
            return;
        }
        else
            members.add(member);
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("📚no books available");
            return;
        }else{
            System.out.println("List of Books: ");
            for (Book b:books){
                System.out.println(b);
            }
        }
    }

    public void displayMembers(){
        if(members.isEmpty()){
            System.out.println("no members currently");
        }
        else{
            System.out.println("👥List of Registered Members: ");
            for(Member m:members){
                System.out.println(m);
            }
        }

    }
    public Book searchBookByTitle(String title){
        for(Book b:books){
            if(b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }
    public Member searchMemberByName(String name){
        for(Member m:members){
            if(m.getName().equalsIgnoreCase(name)){
                return m;
            }
        }
        return null;
    }


}