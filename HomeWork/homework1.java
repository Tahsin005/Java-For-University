package HomeWork;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
public class homework1 {
    public static void main(String[] args) {
        Person p1 = new Person("Tahsin",21);
        Person p2 = new Person("Messi", 36);
        System.out.println("Person 1 name : " + p1.name + "  and Age : " + p1.age);
        System.out.println("Person 2 name : " + p2.name + "  and Age : " + p2.age);
    }
}
