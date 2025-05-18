package Session01;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật:");
        float length = input.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật:");
        float width = input.nextFloat();
        float area = length* width;
        float circumference = 2*(length + width);
        if (length <= 0 || width <= 0){
            System.out.println("Chiều dài và chiều rộng phải lớn hơn 0");
            return;
        }
        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f%n", circumference);
    }
}
