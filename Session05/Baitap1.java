package Session05;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String str = input.nextLine().trim();
        System.out.print("Nhập từ cần tìm: ");
        String search = input.nextLine().trim();
        int index = str.indexOf(search);
        if (index != -1) {
            System.out.println("Từ " + "\"" + search + "\"" + " xuất hiện tại vị trí " + index + " trong chuỗi.");
        } else {
            System.err.println("Không tìm thấy từ " + "\"" + search + "\"" + " trong chuỗi." );
        }
    }
}
