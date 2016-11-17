public class SafePiggyNoNO
{
    public static void main(String[] args) {
        SafePiggy tom = new SafePiggy("Tom", 2000);
        tom.showData();
        tom.name = "George";
        tom.savings = 2500000;
        tom.showData();
    }
}
