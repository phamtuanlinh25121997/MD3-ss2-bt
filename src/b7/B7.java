package b7;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Chọn một lựa chọn (1/2/3/4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HCN();
                    break;
                case 2:
                    HTG();
                    break;
                case 3:
                    HT();
                    break;
                case 4:
                    System.out.println("Ứng dụng kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void HCN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }

    public static void HTG() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a của tam giác: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh b của tam giác: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh c của tam giác: ");
        double c = scanner.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Chu vi của tam giác là: " + perimeter);
        System.out.println("Diện tích của tam giác là: " + area);
    }

    public static void HT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Chu vi của hình tròn là: " + perimeter);
        System.out.println("Diện tích của hình tròn là: " + area);
    }
}
