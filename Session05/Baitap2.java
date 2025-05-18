package Session05;

public class Baitap2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello,Java World!");
        System.out.println("Chuỗi ban đầu: " + str);
        str.delete(5,9);
        System.out.println("Chuỗi sau khi xóa: " + str);
        str.replace(7,12, "Universe");
        System.out.println("Chuỗi sau khi thay thế: " + str);

    }
}
