public class RectanglePerimeter {
    private double length;
    private double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10.0, 5.0);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
}
}