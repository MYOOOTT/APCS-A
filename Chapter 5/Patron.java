public class Patron {
    String name = "";
    Book borrowedBook1 = new Book(); //creates null books for the borrowed list
    Book borrowedBook2 = new Book();
    Book borrowedBook3 = new Book();
    String title = "";
    String checkout = "Yep! You checked it out.";
    String noCheckout = "Nope. You didn't check it out.";

    public Patron(String n, Book b1, Book b2, Book b3) {
        name = n;
        borrowedBook1 = b1;
        borrowedBook2 = b2;
        borrowedBook3 = b3;
    }

    public Patron() {
        this(null, null, null, null);
    }

    public Patron(String n) {
        this(n, null, null, null);
    }

    public boolean askBorrow(String name) {
        System.out.println("Checking if you checked out " + name + "...");
        if (borrowedBook1.getTitle().equals(name) || 
        borrowedBook2.getTitle().equals(name) ||
        borrowedBook3.getTitle().equals(name)) {
            System.out.println(checkout);
            return true;
        } else {
            System.out.println(noCheckout);
            return false;
        }
    }

    public boolean borrow(Book b) { // no way to use a string to check out a non-existing book???
        if (borrowedBook1 == null) { 
            borrowedBook1 = b;
            return true;
        } else if (borrowedBook2 == null) {
            borrowedBook2 = b;
            return true;
        } else if (borrowedBook3 == null) {
            borrowedBook3 = b;
            return true;
        } else {
            System.out.println("You already have 3 books checked out!");
            return false;
        }
    }

    public void refund(String name) {
        System.out.println("Refunding " + name + "...");
        if (name.equals(borrowedBook1.title)){
            borrowedBook1 = null;
        } else if (name.equals(borrowedBook2.title)){
            borrowedBook2 = null;
        } else if (name.equals(borrowedBook3.title)){
            borrowedBook3 = null;
        }
    }

    public void examine(Book b){
        System.out.println(name+ " examines the strange book... \n" + b.toString());
    }

    public String toString() {
        return "Name: " + name + "\n" + "Borrowed Books:\n" + borrowedBook1 +
               "\n" + borrowedBook2 + "\n" + borrowedBook3 + "\n";
        
    }
}

