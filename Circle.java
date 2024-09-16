public class Circle {
    public double radius;
    public Circle(double darius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public class Common {
        public static boolean isPositive(double value) {
            return value > 0;
        }
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn là: "+ circle.getArea());
    }
}
