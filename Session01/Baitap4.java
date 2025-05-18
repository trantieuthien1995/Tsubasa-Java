package Session01;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên a:");
        int a = input.nextInt();
        System.out.println("Nhập số nguyên b:");
        int b = input.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        System.out.printf("a = %d và b = %d%n", a, b);
        System.out.printf("Tổng 2 số a + b = %d%n", sum);
        System.out.printf("Hiệu 2 số a - b = %d%n", sub);
        System.out.printf("Tích 2 số a * b = %d%n", mul);
        if (b != 0){
            int div = a / b;
            int mod = a % b;
            System.out.printf("Thương 2 số a / b = %d%n", div);
            System.out.printf("Số dư khi chia số a cho b = %d%n", mod);
        } else {
            System.out.printf("Không thể chia cho 0.");
        }

    }
}
