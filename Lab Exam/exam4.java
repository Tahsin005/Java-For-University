import java.util.Scanner;

class Room{
    private int length;
    private int width;

    public void setLength(int l){
        length = l;
    }

    public void setWidth(int w){
        width = w;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int Area(){
        return length * width;
    }

    public int Area(int len , int wid){
        return len * wid;
    }

}
public class exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room a = new Room();
        a.setLength(10);
        a.setWidth(5);
        int area1 = a.Area();
        System.out.println("Area of a is " + area1);


        System.out.print("Enter the length and width of Room b : ");
        Room b = new Room();
        int len = sc.nextInt();
        int wid = sc.nextInt();

        b.setLength(len);
        b.setWidth(wid);

        int lenOfB = b.getLength();
        int widOfB = b.getWidth();

        int area2 = b.Area(lenOfB, widOfB);
        System.out.println("Area of B is " + area2);
        sc.close();

    }
    
}
