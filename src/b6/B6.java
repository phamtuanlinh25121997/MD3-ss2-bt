package b6;

import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số.");
            System.out.println("2. Kiểm tra số nguyên tố.");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không.");
            System.out.println("4. Thoát.");
            System.out.print("Chọn một lựa chọn (1/2/3/4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkCL();
                    break;
                case 2:
                    checkSNT();
                    break;
                case 3:
                    checkCH3();
                    break;
                case 4:
                    System.out.println("Ứng dụng kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void checkCL() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " là số chẵn.");
        } else {
            System.out.println(num + " là số lẻ.");
        }
    }

    public static void checkSNT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }
    }

    public static void checkCH3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " chia hết cho 3.");
        } else {
            System.out.println(num + " không chia hết cho 3.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
