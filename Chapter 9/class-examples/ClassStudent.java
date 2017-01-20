public class ClassStudent
{
    private String eyeColor = "", name = "";
    public ClassStudent(String nm, String eye) {
        eyeColor = eye;
        name = nm;
    }
    
    public String toString() {
        return "Name: " + name + "\nEye color: " 
               + eyeColor + "\n";
    }
    
    public String getName() {
        return name;
    }
    
    public String getEyeColor() {
        return eyeColor;
    }
}