public class Recipe
{
   public static void main(String[] args) {
       String[] ingredients = {"flour", "sugar", "cocoa", "oil", "butter", "eggs", "baking soda"};
       System.out.println("To make a chocolate cake, use the following " + ingredients.length +
                          " ingredients.");
       for (String s : ingredients) {
           System.out.println(s);
        }
    }
}