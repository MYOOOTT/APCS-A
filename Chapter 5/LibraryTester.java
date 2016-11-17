public class LibraryTester
{
    public static void main(String[] args) {
        Book greatExpectations = new Book("Great Expectations",
                                          "Charles Dickens");
        Book tree = new Book("The Giving Tree", "Shel Silverstein");
        Book caterpillar = new Book("The Very Hungry Caterpillar",
                                    "Eric Carle");
        Book hobbit = new Book("The Hobbit", "J.R.R. Tolkien");
        Book seuss = new Book("Oh, The Places You'll Go!", "Dr.Seuss");
        
        System.out.println("Our library has: ");
        System.out.println(greatExpectations + "\n" + tree +
                           "\n" + caterpillar + "\n" + hobbit +
                           "\n" + seuss + "\n");
                           
        Patron Matthew = new Patron("Matthew");
        System.out.println(Matthew);
        
        Matthew.borrow(greatExpectations);
        System.out.println(Matthew);
        
        Matthew.askBorrow("Great Expectations");
        System.out.println();
        
        Matthew.examine(seuss);
        
        Matthew.borrow(hobbit);
        Matthew.borrow(tree);
        System.out.println(Matthew);
        
        
        Matthew.refund("Oh, The Places You'll Go!");
        Matthew.refund("The Hobbit");
        Matthew.refund("Great Expectations");
        System.out.println();
        System.out.println(Matthew);
        
        
    }
}