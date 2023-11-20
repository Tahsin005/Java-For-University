package HomeWork;
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    int area(int length,int width){
        return length * width;
    }
}
public class homework3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 10);
        int areaOfRectangle = r.area(r.length,r.width);
        System.out.println("The area of the rectangle is : " + areaOfRectangle);
    }
}
