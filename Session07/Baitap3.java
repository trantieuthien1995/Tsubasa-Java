package Session07;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.print("Nhập tên người thứ nhất: ");
        person1.setName(input.nextLine());
        System.out.print("Nhập tuổi người thứ nhất: ");
        person1.setAge(input.nextInt());
        input.nextLine();
        System.out.print("Nhập tên người thứ hai: ");
        person2.setName(input.nextLine());
        System.out.print("Nhập tuổi người thứ hai: ");
        person2.setAge(input.nextInt());
        input.nextLine();

        if(person1.getAge() < 0 || person2.getAge() < 0){
            System.out.println("Tuổi không hợp lệ, vui lòng nhập lại");
        } else
            if(person1.getAge() == person2.getAge()){
            System.out.println(person1.getName() + " bằng tuổi với "+person2.getName());
        } else if(person1.getAge() > person2.getAge()){
            System.out.println(person1.getName() +" lớn tuổi hơn "+ person2.getName());
        } else {
            System.out.println(person1.getName() +" nhỏ tuổi hơn "+ person2.getName());
        }
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
       age = newAge;
    }
}