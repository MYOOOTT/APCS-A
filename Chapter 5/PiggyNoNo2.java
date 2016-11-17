public class PiggyNoNo2
{
    public static void main(String[] args) {
        Piggy tom = new Piggy("Tom", 2000);
        tom.showData();
        tom.name = "George";
        tom.savings = 2500000;
        tom.showData();
    }
}
