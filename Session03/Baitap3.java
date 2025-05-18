package Session03;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        int count = 0;
        long total = 0;
        long totalBonus = 0;
        long average = 0;
        long maxSalary = Long.MIN_VALUE;
        long minSalary = Long.MAX_VALUE;
        long bonus;
        do {
            System.out.println("************** MENU NHẬP LƯƠNG *************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("------------ Nhập lương nhân viên, nhập -1 để kết thúc -------------");
                    while (true) {
                        System.out.print("Nhập lương: ");
                        long salary = input.nextLong();
                        if (salary == -1) {
                            break;
                        } else if (salary < 0 || salary > 500000000L) {
                            System.err.println("Lương không hợp lệ. Nhập lại từ 0 đến 500000000");
                        } else {
                            if (salary < 5000000) {
                                System.out.println("Phân loại: Thấp");
                                bonus = (long) (0.05*salary);
                            } else if (salary < 15000000) {
                                System.out.println("Phân loại: Trung Bình");
                                bonus = (long) (0.1*salary);
                            } else if (salary < 50000000) {
                                System.out.println("Phân loại: Khá");
                                bonus = (long) (0.15*salary);
                            } else if(salary < 100000000) {
                                System.out.println("Phân loại: Cao");
                                bonus = (long)(0.2*salary);
                            } else {
                                System.out.println("Phân loại: Cao");
                                bonus = (long) (0.25*salary);
                            }
                            count++;
                            total += salary;
                            maxSalary = Math.max(salary, maxSalary);
                            minSalary = Math.min(salary, minSalary);
                            average = total/count;
                            totalBonus += bonus;
                        }
                    }
                    break;
                case 2:
                    if(count == 0){
                        System.err.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("------------ Thống Kê -------------");
                        System.out.println("Số nhân viên: " + count);
                        System.out.println("Tổng lương: " + String.format("%,d", total) + " VND");
                        System.out.println("Lương trung bình: " + String.format("%,d", average) + " VND");
                        System.out.println("Lương cao nhất: " + String.format("%,d", maxSalary) + " VND");
                        System.out.println("Lương thấp nhất: " + String.format("%,d", minSalary) + " VND");
                    }
                    break;
                case 3:
                    if(count == 0){
                        System.err.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("----- Tính tổng số tiền thưởng nhân viên -----");
                        System.out.println("Tổng tiền thưởng nhân viên: " + String.format("%,d", totalBonus) + " VND");
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình nhập lương nhân viên");
                    break;
                default:
                    System.out.println("Vui lòng chọn 1, 2, 3  hoặc 4");
            }
        } while (choose != 4);
    }
}
