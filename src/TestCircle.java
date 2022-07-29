public class TestCircle {
    private double radius = 1.0;
    private String color = "red";

    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public TestCircle() {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(this.radius, 2)* Math.PI;
    }
}
