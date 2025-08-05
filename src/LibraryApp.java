import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        while(true){
            System.out.println("\n===== Library Management Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Display All Members");
            System.out.println("6. Search Book by Title");
            System.out.println("7. Search Member by Name");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:{
                    //add book
                    System.out.println("Enter Book ID:");
                    String bookId = sc.nextLine();
                    System.out.println("Enter Book Title: ");
                    String title=sc.nextLine();
                    System.out.println("Enter Author Name");
                    String author=sc.nextLine();
                    Book newBook = new Book(bookId, title, author,true);
                    lib.addBook(newBook);
                    break;
                }

                case 2:{

                    //add member
                    System.out.println("Add Member");
                    System.out.println("Enter 1 for Student, 2 for Faculty:");
                    int memberType=Integer.parseInt(sc.nextLine());

                    System.out.println("Enter Member ID: ");
                    String id=sc.nextLine();

                    System.out.println("Enter name: ");
                    String name = sc.nextLine();

                    if(memberType==1){
                        System.out.println("Enter Course: ");
                        String course=sc.nextLine();
                        System.out.println("Enter Year");
                        int year=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter your contact no.: ");
                        String contact=sc.nextLine();
                        Student newstudent = new Student(id,name,course,year,contact);
                        lib.addMember(newstudent);
                    }else if(memberType==2){
                        System.out.println("Enter Department: ");
                        String department = sc.nextLine();
                        System.out.println("Enter Designation: ");
                        String designation = sc.nextLine();
                        System.out.println("Enter Experience: ");
                        String experience = sc.nextLine();
                        System.out.println("Enter your contact no.: ");
                        String contact=sc.nextLine();
                        Faculty newFaculty = new Faculty(id,name,contact,department,designation,experience);
                        lib.addMember(newFaculty);

                    }else{
                        System.out.println("Invalid Choice!");
                        break;
                    }
                    break;
                }

                case 3:{

                    //issue book
                    System.out.println("Issue Book");
                    System.out.println("Enter Book ID to issue : ");
                    sc.nextLine();
                    String bookId = sc.nextLine().trim();
                    System.out.println("Enter Member ID:");
                    String memberId = sc.nextLine().trim();

                    boolean issued = lib.issueBook(bookId,memberId);
                    if(issued){
                        System.out.println(" Book issued successfully!");
                    }else{
                        System.out.println("Failed to issue book.");
                    }
                    break;
                }
                case 4:{
                    //display all books
                    lib.displayBooks();
                    break;
                }

                case 5:{
                    //display members
                    lib.displayMembers();
                    break;
                }

                case 6:{
                    //search book
                    sc.nextLine();

                    System.out.println("Enter the Title of Book u want to search");
                    String searchtitle = sc.nextLine();
                    Book foundBook = lib.searchBookByTitle(searchtitle);
                    if(foundBook!=null){
                        System.out.println("BOOK found");
                        System.out.println(foundBook);
                    }else{
                        System.out.println("Book not found, please check the title once");
                    }
                    break;
                }

                case 7:{
                    //search member
                    sc.nextLine();

                    System.out.println("Enter the Name of Member u want to search");
                    String searchmem = sc.nextLine();
                    Member foundmem = lib.searchMemberByName(searchmem);
                    if(foundmem!=null){
                        System.out.println("Member found");
                        System.out.println(foundmem);
                    }else{
                        System.out.println("Member not found, please check the Name once");
                    }
                    break;
                }

                case 8:{
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
