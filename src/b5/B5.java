package b5;

public class B5 {
    public static void main(String[] args) {
        int N = 1; // Bắt đầu từ số 1

        while (true) {
            if (isMultipleOf(N, 5) && isMultipleOf(N, 7) && isMultipleOf(N, 11)) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7, và 11 là: " + N);
                break;
            }
            N++;
        }
    }

    // Kiểm tra xem một số có chia hết cho một số khác hay không
    public static boolean isMultipleOf(int num, int divisor) {
        return num % divisor == 0;
    }
}

