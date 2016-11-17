public class SafePiggyTester
{
    public static void main(String args[]) {
        SafePiggy tom = new SafePiggy("Tom", 2000);
        tom.setName("Thomas");
        tom.setSavings(5275);
        System.out.println("Name: " + tom.getName());
        System.out.println("Savings: " + tom.getSavings());
    }
}
