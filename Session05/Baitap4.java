package Session05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một email bất kỳ: ");
        String email = input.nextLine().trim();
        String regex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email hợp lệ");
        } else {
            System.err.println("Email không hợp lệ");
        }
    }
}
