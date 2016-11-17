public class Duck
{
    private String name;
    public Duck() {
        name = "Some duck";
    }
    
    public Duck(String s) {
        name = s;
    }
    
    public void quack() {
        System.out.println(name + " says, 'Quack! Quack!'");
    }
    
    public void sayHello() {
        this.quack(); //make myself quack
    }
    
    public void sayHello(Duck d) {
        this.quack();
        d.quack(); //make another duck quack
    }
}