package B1;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("GT đầu");
        int SD =scanner.nextInt();
        System.out.println("GT cuối");
        int SC = scanner.nextInt();
        double total = 0;
        for (int i = SD; i <= SC; i++) {
            if (i%2 == 0){
               total= total + i;
            }
        }
        System.out.println(total);
    }
}
