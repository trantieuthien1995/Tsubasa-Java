package Session05;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String str = input.nextLine().trim();
        String result = str.replaceAll("\\d", "*" );
        System.out.println("Chuỗi sau khi thay thế: " + result);
    }
}
