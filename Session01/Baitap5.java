package Session01;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tử số của phân số thứ nhất:");
        int a = input.nextInt();
        System.out.println("Nhập mẫu số của phân số thứ nhất:");
        int b = input.nextInt();
        System.out.println("Nhập tử số của phân số thứ hai:");
        int c = input.nextInt();
        System.out.println("Nhập mẫu số của phân số thứ hai:");
        int d = input.nextInt();
        int tuSo = a*d + b*c;
        int mauSo = b*d;
        if(b == 0 || d == 0){
            System.out.println("Mẫu số không được bằng 0");
            return;
        }
        System.out.printf("Phân số 1: %d/%d%n", a, b);
        System.out.printf("Phân số 2: %d/%d%n", c, d);
        System.out.printf("Kết quả: %d/%d%n", tuSo, mauSo);
    }
}
