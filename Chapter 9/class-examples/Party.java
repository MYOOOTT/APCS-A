public class Party
{
    public static void main(String[] args) {
        //create a party of 3 hobbits
        Hobbit[] party = new Hobbit[3];
        for (int i = 0; i < 3; i++) {
            party[i] = new Hobbit();
        }
        party[0].setName("Bilbo");
        party[1].setName("Frodo");
        party[2].setName("Rose");
        
        //Use a for each loop to print out the names
        for (Hobbit h : party) {
            System.out.print(h.getName() + " is a " );
            System.out.println("good Hobbit name");
        }
    }
}