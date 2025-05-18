package Session02;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên N bất kỳ có thể âm hoặc dương");
        int number = input.nextInt();
        int total = 0;
        if (number < 0){
            number = Math.abs(number);
        }
        while (number > 0){
            total += number % 10;
            number /= 10;
        }
        System.out.println("Tổng các chữ số là: " + " " + total);
        }
    }

