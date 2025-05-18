package Session04;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Nhập số cần tìm: ");
        int key = input.nextInt();
        selectionSort(arr);
        System.out.println("Mảng sau khi được sắp xếp theo thứ tự giảm dần: " + Arrays.toString(arr));
        int resultSequential = sequentialSearch(arr,key);
        if (resultSequential != -1) {
            System.out.println("Tìm kiếm tuyến tính: Phần tử " + key + " tìm thấy tại chỉ số: " + resultSequential);
        } else {
            System.out.println("Không tìm thấy " + key + " trong mảng.");
        }
        int resultBinary = binarySearch(arr, key);
        if (resultBinary != -1) {
            System.out.println("Tìm kiếm nhị phân: Phần tử " + key + " tìm thấy tại chỉ số: " + resultBinary);
        } else {
            System.out.println("Không tìm thấy " + key + " trong mảng.");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
