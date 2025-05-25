package Session08;

public class Baitap3 {
    public static void main(String[] args) {
        Colorable circle = new Circle();
        circle.setColor("Red");
        Colorable retangle = new Rectangle();
        retangle.setColor("Blue");
        Colorable square = new Square();
        square.setColor("Green");
    }
}
interface Colorable{
    void setColor(String color);
}
class Circle implements Colorable{
    @Override
    public void setColor(String color){
        System.out.println("Circle color: " + color);
    }
}
class Rectangle implements Colorable{
    @Override
    public void setColor(String color){
        System.out.println("Rectangle color: " + color);
    }
}
class Square implements Colorable{
    @Override
    public void setColor(String color){
        System.out.println("Square color: " + color);
    }
}