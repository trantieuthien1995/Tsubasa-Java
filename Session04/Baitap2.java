package Session04;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        sum(arr);
    }

    public static void sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: " + total);
    }
}
