package Session03;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        int count = 0;
        float total = 0;
        float maxScore = Float.MIN_VALUE;
        float minScore = Float.MAX_VALUE;
        do {
            System.out.println("************** MENU NHẬP ĐIỂM *************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("------------ Nhập điểm học viên, nhập -1 để dừng -------------");
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        float score = input.nextFloat();
                        if (score == -1) {
                            break;
                        } else if (score < 0 || score > 10) {
                            System.err.println("Điểm không hợp lệ. Nhập lại từ 0 đến 10");
                        } else {
                            if (score < 5) {
                                System.out.println("Học lực: Yếu");
                            } else if (score < 7) {
                                System.out.println("Học lực: Trung Bình");
                            } else if (score < 8) {
                                System.out.println("Học lực: Khá");
                            } else if (score < 9) {
                                System.out.println("Học lực: Giỏi");
                            } else {
                                System.out.println("Học lực: Xuất sắc");
                            }
                            count++;
                            total += score;
                            maxScore = Math.max(score, maxScore);
                            minScore = Math.min(score, minScore);
                        }
                    }
                    break;
                case 2:
                    if(count == 0){
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.println("------------ KẾT QUẢ -------------");
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.printf("Điểm trung bình: %.2f%n", total / count);
                        System.out.println("Điểm cao nhất: " + maxScore);
                        System.out.println("Điểm thấp nhất: " + minScore);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình nhập điểm");
                    break;
                default:
                    System.out.println("Vui lòng chọn 1, 2 hoặc 3");
            }
        } while (choose != 3);
    }
}