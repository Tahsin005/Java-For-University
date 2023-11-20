package HomeWork;
class Circle{
    double radius;

    public void setter(double r){
        radius = r;
    }
    public void modifier(double r){
        radius = r;
    }
    public double area(double r){
        return 3.1416 * r * r;
    }
    public double circumference(double r){
        return 2.0 * 3.1416 * r;
    }
}
public class homework4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setter(5);

        System.out.println("Area of circle before modifying : " + c.area(c.radius));
        System.out.println("Circumference of circle before modifying : " + c.circumference(c.radius));
        
        c.modifier(10);
        System.out.println("Area of circle after modifying : " + c.area(c.radius));
        System.out.println("Circumference of after before modifying : " + c.circumference(c.radius));

    }
}
 