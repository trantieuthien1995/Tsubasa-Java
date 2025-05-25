package Session07;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
        double length = input.nextDouble();
        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
        double width = input.nextDouble();

        Rectangle r = new Rectangle(1,1);
        System.out.println("\nHình chữ nhật 1: ");
        r.display();

        Rectangle m = new Rectangle(length, width);
        System.out.println("\nHình chữ nhật 2: ");
        m.display();
    }
}
class  Rectangle{
    double length;
    double width;
    Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length + width)*2;
    }
    void display(){
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: "  + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}