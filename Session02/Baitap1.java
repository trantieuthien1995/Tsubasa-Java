package Session02;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một số nguyên bất kỳ");
        int n = input.nextInt();
        if(n == 0){
            System.out.println("Số không phải chẵn cũng không phải lẻ");
            return;
        } else if ( n % 2 == 0) {
            System.out.println(n + " "+"là số chẵn");
        } else {
            System.out.println(n + " "+"là số lẻ");
        }
    }
}
