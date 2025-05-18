package Session01;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        System.out.println("===TÍNH DIỆN TÍCH HÌNH TRÒN");
        System.out.println("Nhập bán kính hình tròn vào bên dưới.");
        System.out.printf("--> Nhập -1 nếu bạn muốn thoát. %n%n");
        while (true) {
            Scanner input = new Scanner(System.in);
            final double PI = 3.14;

            System.out.println("Nhập bán kính:");
            double r = input.nextDouble();
            if (r == -1) {
                System.out.println("Kết thúc chương trình");
                break;
            } else if (r < 0) {
                System.out.println("Bán kính phải lớn hơn 0");
                continue;
            }
            double dienTich = PI * r * r;
            System.out.printf("Diện tích hình tròn:%.2f%n%n", dienTich);
        }
    }
}
