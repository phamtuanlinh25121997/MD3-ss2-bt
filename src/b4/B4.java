package b4;

import java.util.Scanner;

public class B4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = scanner.nextInt();

        int count = 0; // Đếm số lượng số nguyên tố đã in ra
        int N = 2; // Số nguyên tố bắt đầu từ 2

        System.out.println(numbers + " số nguyên tố đầu tiên là:");

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    // Phương thức kiểm tra xem một số có phải là số nguyên tố không
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

