package Theory_Assignment;
class Course{
    private String courseName;
    private int courseId;
    private int maxStudents;
    private int enrolledStudents;

    // Constructors
    public Course(){
        this.courseName = "No course";
        this.courseId = 00;
        this.maxStudents = 0;
        this.enrolledStudents = 0;
    }

    public Course(String courseName, int courseId){
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxStudents = 55;
    }

    public Course(String courseName, int courseId, int maxStudents){
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxStudents = maxStudents;
    }

    // Methods
    public void enrollStudent(){
        if(enrolledStudents < maxStudents){
            enrolledStudents++;
            System.out.println("Student enrolled in the course.");
        }
        else{
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }

    public boolean isCourseFull(){
        return enrolledStudents >= maxStudents;
    }

    private int calculateAvailableSeats(){
        return maxStudents - enrolledStudents;
    }

    public void displayCourseInfo(){
        System.out.println("Course Information:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Maximum Students: " + maxStudents);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Available Seats: " + calculateAvailableSeats());
    }
}
public class course_class{
    public static void main(String[] args){
        Course OOP = new Course("Object Oriented Programming", 115);
        Course SPL = new Course("Structured Programming Language", 113, 60);
        
        OOP.enrollStudent();
        OOP.enrollStudent();
        OOP.enrollStudent();
        OOP.enrollStudent();
        OOP.enrollStudent();
        OOP.enrollStudent();
        OOP.enrollStudent();
        SPL.enrollStudent();
        
        OOP.displayCourseInfo();
        System.out.println("-------------------------");
        SPL.displayCourseInfo();
        
    }
}
