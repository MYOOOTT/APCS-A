public class Champion
{
    private String myName;
    private int myHealth;

    public void setName(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public void setHealth(int health) {
        myHealth = health;
    }

    public int getHealth() {
        return myHealth;
    }

    public void sayHello() {
        System.out.println("Greetings, I am" + myName + ", a mighty champion with" +
                            myHealth + " health.");
    }
}