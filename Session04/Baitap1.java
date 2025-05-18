package Session04;

import java.util.Scanner;
import java.util.Arrays;

public class Baitap1 {
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
        selectionSort(arr);
        System.out.println("Mảng sau khi được sắp xếp theo thứ tự giảm dần: " + Arrays.toString(arr));
        int maxElement = arr[0];
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++ ){
            int maxIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}