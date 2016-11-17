public class SafePiggy
{
    private double savings;
    private String name;
    
    public SafePiggy () {
        System.out.println("No parameter constructor");
        savings = 0;
        name = "";
    }
    
    public SafePiggy(String n, double s) {
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
    
    public double getSavings() {
        return savings;
    }
    
    public void setSavings(double newAmount) {
        savings = newAmount;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
}