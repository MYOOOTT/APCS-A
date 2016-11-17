public class RationalNumberTester5_3 {
    public static void main(String[] args) {
        Project5_3 r1 = new Project5_3(2, 10);
        Project5_3 r2 = new Project5_3(4, 5);
        Project5_3 r3, r4, r5, r6, r7, r8;
        
        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);
        
        r3 = r1.add(r2);
        System.out.println("r1 + r2 = " + r3);
        r4 = r1.subtract(r2);
        System.out.println("r1 - r2 = " + r4);
        r5 = r2.subtract(r1);
        System.out.println("r2 - r1 = " + r5);
        r6 = r1.multiply(r2);
        System.out.println("r1 * r2 = " + r6);
        r7 = r1.divide(r2);
        System.out.println("r1 / r2 = " + r7);
        r8 = r2.divide(r1);
        System.out.println("r2 / r1 = " + r8);
    }
}
