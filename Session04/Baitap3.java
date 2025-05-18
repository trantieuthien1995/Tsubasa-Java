package Session04;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap3 {
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
        bubbleSort(arr);
        System.out.println("Mảng sau khi được sắp xếp theo thứ tự giảm dần: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++){
            swapped = false;
            for (int j = 0; j < n -1 - i; j++){
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
