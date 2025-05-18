package Session02;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập vào số nguyên từ 1 đến 12 để biết số ngày trong tháng");
        int date = input.nextInt();
        switch (date){
            case 1:
                System.out.println("Tháng 1 có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.println("Tháng 3 có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng 4 có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng 5 có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng 6 có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng 7 có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng 8 có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng 9 có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng 10 có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng 11 có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng 12 có 31 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ. Hãy nhập một số từ 1 đến 12");
        }
    }
}

