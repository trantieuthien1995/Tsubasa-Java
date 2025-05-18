package Session05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một mật khẩu bất kỳ: ");
        String passWord = input.nextLine().trim();
        String regex = "^(?=.*[^a-zA-Z0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches()) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.err.println("Mật khẩu không hợp lệ");
        }
    }
}
