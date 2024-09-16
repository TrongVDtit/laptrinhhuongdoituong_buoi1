public class bai1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập đúng 2 tham số: chiều rộng và chiều cao.");
            System.exit(1);
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            if (width <= 0 || height <= 0) {
                System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương.");
                System.exit(1);
            }
            int perimeter = 2 * (width + height);
            int area = width * height;
            System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
            System.out.println("Diện tích của hình chữ nhật là: " + area);

        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập các số nguyên hợp lệ.");
            System.exit(1);
        }
    }
}
