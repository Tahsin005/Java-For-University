class Student3{
    int id;
    String name;
    void display(){
        System.out.println(id + " " + name);
    }
}
public class constructor{
    /*
     * 
     * Write a java program to display the default value for 
     * integer and strign data type using constructor concepts
     */
    public static void main(String[] args){
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();

        s1.display();
        s2.display();
    }
}
