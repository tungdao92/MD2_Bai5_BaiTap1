import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestCircle testCircle1 = new TestCircle();
        TestCircle testCircle = new TestCircle(5,"blue");
        System.out.println("Bán kính ban đầu là: "+ testCircle1.getRadius());
        System.out.println("Diện tích ban đầu là: "+testCircle1.getArea());
        System.out.println("Bán kính sau là: " + testCircle.getRadius());
        System.out.println("Diện tích sau là: " + testCircle.getArea());
    }
}
