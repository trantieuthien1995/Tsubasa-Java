package Session06;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        ArrayList<String> students = new ArrayList<>();
        do {
            System.out.println("************** MENU  *************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Sắp xếp sinh viên tăng dần");
            System.out.println("3. Sắp xếp sinh viên giảm dần");
            System.out.println("4. Thêm sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            choose = input.nextInt();
            input.nextLine();
            switch (choose){
                case 1:
                    if(students.isEmpty()){
                        System.err.println("Chưa có sinh viên nào");
                    } else {
                        System.out.println("Danh sách sinh viên: ");
                        for (String student : students){
                            System.out.println("- "+ student);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên sinh viên: ");
                    String addStudent = input.nextLine().trim();
                    if(!addStudent.isEmpty()){
                        students.add(addStudent);
                        System.out.println("Đã thêm sinh viên:  " + addStudent);
                    } else {
                        System.out.println("Tên sinh viên không hợp lệ");
                    }
                break;
                case 5:
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    String deleteStudent = input.nextLine().trim();
                    if(students.remove(deleteStudent)){
                        System.out.println("Đã xóa sinh viên: " + deleteStudent);
                    }else {
                        System.err.println("Không tìm thấy sinh viên cần xóa");
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình nhập tên sinh viên");
                    break;
                default:
                    System.out.println("Vui lòng chọn 1, 2, 3, 4, 5  hoặc 6");
            }
        } while (choose != 6);
    }

}
