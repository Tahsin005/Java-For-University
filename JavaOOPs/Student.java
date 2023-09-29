package JavaOOPs;

public class Student {
    String name;
    int roll;
    double percentage;
    final String sclname = "CGHS";

    private static int numberOfStudents;
    // public void setRoll(int y){
    //     this.roll = y;
    // }
    public static int getnumberOfStudents(){
        return numberOfStudents;
    }
    public int getRoll(){
        return roll;
    }

    public Student(String name,int roll,double percentage){
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
        numberOfStudents++;
    }
    public Student(){

    }
}
