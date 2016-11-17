public class PiggyTester
{
    public static void main(String[] args) {
        Piggy myPiggy = new Piggy();
        Piggy yourPiggy = new Piggy();

        System.out.println("My Piggy bank");
        myPiggy.showData();
        myPiggy.addData(500);
        myPiggy.showData();

        System.out.println("Your Piggy Bank");
        yourPiggy.showData(); // prints the data
        yourPiggy.addData(1200);
        yourPiggy.showData();
    }
}
