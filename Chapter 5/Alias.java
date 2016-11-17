public class Alias
{
    public static void main(String[] args) {
        Champion c1 = new Champion();
        Champion c2 = new Champion();
        
        c1.setName("Hercules");
        c1.setHealth(1000);
        
        c2.setName("Spongebob");
        c2.setHealth(500);
        
        c1.sayHello();
        c2.sayHello();
        
        System.out.println("Setting c1 = c2");
        c1 = c2;
        c1.setName("Galfdan the Weak");
        c1.setHealth(2);
        
        c1.sayHello();
}
}
