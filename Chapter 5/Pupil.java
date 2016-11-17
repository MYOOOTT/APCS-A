public class Pupil{

    private String name;
    private int test1;
    private int test2;
    private int test3;
    private String testError = "SORRY: must have 0 <= test score <= 100";
    private String nameError = "SORRY: name required";

    public Pupil(String nm, int t1, int t2, int t3){ // model constructor
        name = nm;
        test1 = t1;
        test2 = t2;
        test3 = t3;
    }

    public Pupil() { // no parameters
        this("", 0, 0, 0);
    }

    public Pupil(Pupil s) { // copy data from another Pupil object
        this(s.name,s.test1, s.test2, s.test3);
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName(){
        return name;
    }

    public void setScore(int i, int score){
        if (i == 1) test1 = score;
        if (i == 2) test2 = score;
        else        test3 = score;
    }

    public int getScore(int i) {
        if (i == 1)      return test1;
        else if (i == 2) return test2;
        else             return test3;
    }

    public int getAverage() {
        int average;
        average = (int) Math.round((test1+ test2 + test3) / 3.0);
        return average;
    }

    public int getHighScore() {
        int highScore;
        highScore = test1;
        if (test2 > highScore) highScore = test2;
        if (test3 > highScore) highScore = test3;
        return highScore;
    }

    public String validateData() {
        String check = "";
        if (checkName() == false && checkTest() == false){ // false = length of string > 0
            check = null;
        } else if (checkName() == true && checkTest() == true) {
            check = nameError + "\n" + testError;
        } else if (checkName() == true) {
            check = nameError;
        } else if (checkTest() == true) {
            check = testError;
        }
        return check;
    }

    private boolean checkName() {
        return name.isEmpty();
    }

    private boolean checkTest() {
        if (test1 > -1 && test2 > -1 && test3 > -1 ||
        test1 < 100 && test2 < 100 && test3 < 100){
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        String str;
        str = "Name:   " + name + "\n" +
        "Test 1: " + test1 + "\n" +
        "Test 2: " + test2 + "\n" +
        "Test 3: " + test3 + "\n" +
        "Average: " + getAverage();
        return str;
    }
}