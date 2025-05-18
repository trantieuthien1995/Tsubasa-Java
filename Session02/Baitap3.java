package Session02;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập một số nguyên N bất kỳ để tính tổng từ 1 đến N");
        int n = input.nextInt();
        int total = 0;
        if(n <= 0){
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            for(int i = 1; i <= n; i++){
                total += i;
            }
            System.out.printf("Tổng các số từ 1 đến %d là: %d",n,total);
        }
    }
}
