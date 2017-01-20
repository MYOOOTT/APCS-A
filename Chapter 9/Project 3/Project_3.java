

public class Project_3
{
    public static void main(String[] args) {
        Frequency object = new Frequency();
        
        double median = object.findMedian();
        System.out.println("Median:" + median);
        int mode = object.findMode();
        System.out.println("Mode:" + mode);
        int[][] table = object.count();
        object.printTable(table);
        
    }

}
