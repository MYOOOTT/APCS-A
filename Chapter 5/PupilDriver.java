public class PupilDriver {

    public static void main(String[] args) {
        String positiveData = "Wowie! This student has test scores inbetween 0-100" +
                              " and has a name!";
        Pupil Mary = new Pupil("Mary", 89, 80, 70);
        System.out.println(Mary);
        System.out.println();
        
        String result = Mary.validateData();
        if (result == null) {
            System.out.println(positiveData);
        } else {
            System.out.println(result);
        }
        System.out.println();
        
        
        Pupil noName = new Pupil("", 100, 50, 75);
        System.out.println(noName);
        System.out.println();
        
        result = noName.validateData();
        if (result == null) {
            System.out.println(positiveData);
        } else {
            System.out.println(result);
        }
        System.out.println();
        
        Pupil cheater = new Pupil("Cheater", 120, 103, -3);
        System.out.println(cheater);
        System.out.println();
        
        result = cheater.validateData();
        if (result == null) {
            System.out.println(positiveData);
        } else {
            System.out.println(result);
        }
        System.out.println();
        
        Pupil nothing = new Pupil();
        System.out.println(nothing);
        System.out.println();
        
        result = nothing.validateData();
        if (result == null) {
            System.out.println(positiveData);
        } else {
            System.out.println(result);
        }
    }
}