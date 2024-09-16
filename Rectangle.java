public class Rectangle {
    public double width;
    public double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public double getArea(){
        return width * height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
    }
}
