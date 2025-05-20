package Session06;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = input.nextLine().trim();
        String[] parts = fullName.split("\\s+");
        if(parts.length < 2){
            System.err.println("Tên không hợp lệ. Vui lòng nhập cả họ và tên!");
            return;
        }
        String name = (parts[parts.length-1]).toLowerCase();
        String abbreviation = "";
        for (int i = 0; i < parts.length - 1; i++) {
            abbreviation += Character.toLowerCase(parts[i].charAt(0));
        }
        String email = name + "." + abbreviation + "@gmail.com";
        System.out.println("Địa chỉ email: " + email);
    }
}
