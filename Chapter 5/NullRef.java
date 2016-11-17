
public class NullRef
{
    public static void main(String[] args) {
        Duck d = new Duck();
        d = null;
        d.quack();
    }
}