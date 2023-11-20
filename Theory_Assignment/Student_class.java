package Theory_Assignment;
class Student{
    private String name;
    private int age;
    private double cgpa;

    // Constructors
    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.cgpa = 0.0;
    }

    public Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }


    // Methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGPA(double cgpa){
        this.cgpa = cgpa;
    }


    private String gradeStatus(){
        if(cgpa >= 3.0){
            return "Good Standing";
        } 
        else{
            return "Probation";
        }
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + cgpa);
        System.out.println("Grade Status: " + gradeStatus());
    }
}
public class Student_class{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("Student 1 informations ------- : ");
        s1.displayStudentInfo();
        
        Student s2 = new Student();
        s2.setName("Tahsin");
        s2.setAge(21);
        s2.setGPA(3.88);
        System.out.println("Student 2 informations ------- : ");
        s2.displayStudentInfo();
        
        Student s3 = new Student("Messi", 36, 4.00);
        System.out.println("Student 3 informations ------- : ");
        s3.displayStudentInfo();
    }
}
