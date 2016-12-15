
public class Project6_7
{
    public static void main(String[] args) {
        int w, h, area, perimeter;
        System.out.println("W\t" + "H\t" + "Area\t" + "Perimeter");
        for (w = 1; w <= 10; w++) {
            for (h = 1; h <= 10; h++) {
                area = w * h;
                perimeter = (w * 2) + (h * 2);
                System.out.println(w + "\t" + h + "\t" + area + "\t" + perimeter);
            }
        }
    }
}