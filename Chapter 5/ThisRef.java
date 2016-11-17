public class ThisRef {
    public static void main(String[] args) {
        Duck d1 = new Duck("Donald");
        d1.sayHello();
        
        System.out.println();
        Duck d2 = new Duck();
        d1.sayHello(d2);
        
        System.out.println();
        Duck d3 = new Duck("Daisy");
        d3.sayHello(d1);
    }
}