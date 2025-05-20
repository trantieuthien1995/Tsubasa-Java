package Session06;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        System.out.print("Nhập số hàng: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột: ");
        int columns = input.nextInt();
        input.nextLine();
        if (rows <= 0 || columns <= 0) {
            System.err.println("Kích thước không hợp lệ");
            return;
        }
        arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Nhập phần tử [%d][%d]: ", i, j);
                arr[i][j] = input.nextInt();
            }
        }
        int n = arr.length;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows - 1; i++) {
                for (int k = 0; k < rows - 1 - i; k++) {
                    if (arr[k][j] < arr[k + 1][j]) {
                        int temp = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = temp;
                    }
                }
            }
        }
        System.out.println("Ma trận sau khi sắp xếp theo cột giảm dần: " );
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
