package Session04;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        System.out.print("Nhập số hàng: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột: ");
        int columns = input.nextInt();
        input.nextLine();
        if(rows <= 0 || columns <= 0){
            System.err.println("Kích thước không hợp lệ");
            return;
        }
        arr = new int[rows][columns];
        System.out.println("Nhập các phần tử cho mảng (theo từng hàng): ");

        for (int i = 0; i < rows; i++) {
            System.out.printf("Hàng %d: ", i + 1);
            for (int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(arr[i][j] % 2 == 0){
                  even += arr[i][j];
                } else {
                    odd += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn là: " + even);
        System.out.println("Tổng các số lẻ là: " + odd);
    }
}
