package Session03;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==================== NHẬP THÔNG TIN HÓA ĐƠN =====================");
        System.out.print("Nhập tên khách hàng: ");
        String customerName = input.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String productName = input.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        float productPrice = input.nextFloat();
        System.out.print("Nhập số lượng mua: ");
        int productQuantity = input.nextInt();
        System.out.print("Khách có thẻ thành viên？ (true/false) ");
        boolean member = input.nextBoolean();

        float price = productPrice*productQuantity;
        float VAT = 0.08f*productPrice*productQuantity;
        float memberPrice = member ? 0.1f*productPrice*productQuantity: 0f;
        float total = price - memberPrice + VAT;

        String productPriceFomated = String.format("%,.2f", productPrice);
        String priceFomated = String.format("%,.2f", price);
        String vatFomated = String.format("%,.2f", VAT);
        String memberPriceFomated = String.format("%,.2f", memberPrice);
        String totalFomated = String.format("%,.2f", total);


        System.out.println("==================== HÓA ĐƠN =====================");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Số lượng: " + productQuantity);
        System.out.println("Đơn giá: " + productPriceFomated + " VND");
        System.out.println("Thành tiền: " + priceFomated + " VND");
        System.out.println("Giảm giá thành viên (10%): " + memberPriceFomated + " VND");
        System.out.println("Tiền VAT (8%): " + vatFomated + " VND");
        System.out.println("Tổng thanh toán: " + totalFomated + " VND");

    }
}
