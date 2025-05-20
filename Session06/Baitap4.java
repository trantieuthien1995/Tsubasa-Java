package Session06;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập đoạn văn bản: ");
        String  phoneCheck = input.nextLine().trim();
        String regex = "^(03|05|07|08|09)\\d{8}$";
        String[] parts = phoneCheck.split("\\s+");
        System.out.println("Các số điện thoại tìm thấy: ");
        for (int i = 0; i < parts.length; i++){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(parts[i]);
            if (matcher.matches()) {
                System.out.println( parts[i]);
            }
        }
    }
}
