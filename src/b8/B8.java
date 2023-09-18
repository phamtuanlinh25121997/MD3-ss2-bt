package b8;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C1, C2, C3;

        while (true) {
            System.out.println("Nhập độ dài 3 cạnh của tam giác:");
            System.out.print("Nhập cạnh 1: ");
            C1 = scanner.nextDouble();
            System.out.print("Nhập cạnh 2: ");
            C2 = scanner.nextDouble();
            System.out.print("Nhập cạnh 3: ");
            C3 = scanner.nextDouble();

            if (check(C1, C2, C3)) {
                double CV = TCV(C1, C2, C3);
                double DT = TDT(C1, C2, C3);

                System.out.println("Chu vi của tam giác là: " + CV);
                System.out.println("Diện tích của tam giác là: " + DT);
                break;
            } else {
                System.out.println("Ba cạnh không tạo thành tam giác. Vui lòng nhập lại.");
            }
        }
    }

    public static boolean check(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static double TCV(double a, double b, double c) {
        return a + b + c;
    }

    public static double TDT(double a, double b, double c) {
        double s = TDT(a, b, c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}




