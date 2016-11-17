public class Piggy
{
    public double savings;
    public String name;
    
    public Piggy () {
        System.out.println("No parameter constructor");
        savings = 0;
        name = "";
    }
    
    public Piggy(String n, double s) {
        System.out.println("Parameter constructor");
        name = n;
        savings = s;
    }
    
    public void addData(double s) { // s can be any variable, but is defined as a double
        savings += s;
    }
    
    public void showData() { // prints the data
        System.out.println("Savings: " + savings);
        System.out.println("Name: " + name);
    }
}