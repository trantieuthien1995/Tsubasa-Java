package Session06;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = input.nextInt();
        if(n <= 0){
            System.err.println("Kích thước rỗng");
            return;
        }
        int[] arr = new int[n];
        float total = 0;
        float average = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: " , i+1);
            arr[i] = input.nextInt();
            total += arr[i];
            average = total/n;
        }
        System.out.printf("Tổng các phần tử trong mảng: %.0f%n" , total);
        System.out.printf("Trung bình các phần tử trong mảng: %.1f" , average);
    }
}
