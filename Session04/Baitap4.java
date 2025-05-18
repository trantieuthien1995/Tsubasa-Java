package Session04;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = input.nextInt();
        if(n <= 0){
            System.err.println("Kích thước rỗng");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/ 2; i++){
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
        }
    }
}
