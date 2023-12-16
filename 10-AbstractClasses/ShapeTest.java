public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.area());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.area());
        Circle circle = new Circle(3);
        System.out.println(circle.area());
    }
    
}
