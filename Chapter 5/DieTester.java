public class DieTester
{
   public static void main(String[] args) {
       //create a regular die and println it
       Die d6 = new Die();
       System.out.println(d6);
       
       d6.roll();
       System.out.println("Rolled a six sided die and got a: " + d6.getFaceValue());
       System.out.println();
       
       //create a 20 sided die and println it
       Die d20 = new Die(20);
       System.out.println(d20);
       
       d20.roll();
       System.out.println("Rolled a 20-sided die and got a: " + d20.getFaceValue());
    }
}
