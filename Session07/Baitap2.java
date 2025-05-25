package Session07;

public class Baitap2 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("John Doe");
        b.setPrice(29.99);
        System.out.println("Tiêu đề: "+ b.getTitle());
        System.out.println("Tác giả: "+ b.getAuthor());
        System.out.println("Giá: "+ b.getPrice());

        b.setPrice(35.50);
        System.out.println("Giá mới: " + b.getPrice());

        b.setPrice(-5.00);
    }
}
class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.out.println("Giá không được âm");
        }
    }
}