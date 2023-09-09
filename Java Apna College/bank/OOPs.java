package bank;
class Student{
    String name;
    int age;

    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // Student(){
    //     System.out.println("Constructor called");
    // }
    // Student(String name, int  age){
    //     this.name = name;
    //     this.age = age;
    // }
    
    // Student(Student ferdous){
    //     this.name = ferdous.name;
    //     this.age = ferdous.age;
    //     System.out.println("This is the copied constructor");
    // }
    // Student(){

    // }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

}
public class OOPs {
    public static void main(String[] args) {
        // Student tahsin = new Student();
        // // Student tahsin = new Student("Tahsin",1068);
        // tahsin.name = "Mohammad Tahsin Ferdous";
        // tahsin.age = 1068; 

        // Student ferdous = new Student(tahsin);
        // ferdous.printInfo();
        
        Student s1 = new Student();
        s1.name = "Tahsin";
        s1.age = 21;

        // s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        // s1.printInfo(s1.name,s1.age);
    }
    
}
