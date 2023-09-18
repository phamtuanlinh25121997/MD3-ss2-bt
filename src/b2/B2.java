package b2;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");

            System.out.print("Chọn một lựa chọn (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HCN();
                    break;
                case 2:
                    TGV();
                    break;
                case 3:
                    TGC();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    public static void HCN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void TGV() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của tam giác vuông: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void TGC() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của tam giác cân: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


