package JavaLabReport;
import java.util.Scanner;
class Room {
    private int length;
    private int width;

    public int calculateArea(){
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        length = l;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }
}
public class _15_area_of_room_using_object {
    public static void main(String[] tahsin) {
        Scanner sc = new Scanner(System.in);
        Room r = new Room();
        System.out.print("Enter the length of the room : ");
        int l = sc.nextInt();
        System.out.print("Enter the width of the room : ");
        int w = sc.nextInt();
        r.setLength(l);
        r.setWidth(w);
        int area = r.calculateArea();

        System.out.println("The area of the room of length " + r.getLength() + " and the width " + r.getWidth() + " is : " + area);
        sc.close();
    }
}
