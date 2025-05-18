package Session02;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào một số nguyên và lớn hơn 0");
        int age;
        while (true) {
            if (input.hasNextInt()) {
                age = input.nextInt();
                if (age > 0) {
                    System.out.print("Tuổi của bạn là:" + " " + age);
                    break;
                } else {
                    System.out.println("Vui lòng nhập vào một số nguyên và lơn hơn 0");
                }
                } else{
                System.out.println("Vui lòng nhập vào một số nguyên và lơn hơn 0");
                input.next();
            }
        }
    }
}