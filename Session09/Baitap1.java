package Session09;



import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal[] animals = new Animal[10];
        int count = 0;
        int choose;
        do{
            System.out.println("************** MENU QUẢN LÝ ĐỘNG VẬT *************");
            System.out.println("1. Thêm động vật");
            System.out.println("2. Hiển thị danh sách động vật");
            System.out.println("3. Thực hiện hành động cho động vật");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            choose = input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                    Animal a;
                    int speciesChoice;
                    String name;
                    while (true) {
                        System.out.println("Chọn loại động vật (1: Mèo, 2: Chó, 3: Chim): ");
                        speciesChoice = input.nextInt();
                        input.nextLine();

                        if (speciesChoice == 1) {
                            a = new Cat();
                            a.setAnimalSpecies("Cat");
                            break;
                        } else if (speciesChoice == 2) {
                            a = new Dog();
                            a.setAnimalSpecies("Dog");
                            break;
                        } else if (speciesChoice == 3) {
                            a = new Bird();
                            a.setAnimalSpecies("Bird");
                            break;
                        } else {
                            System.err.println("Loài không hợp lệ. Vui lòng chọn loài có trong danh sách.");
                        }
                    }
                    do {
                        System.out.println("Nhập tên động vật: ");
                        name = input.nextLine().trim();
                        if (name.isEmpty()) {
                            System.err.println("Tên không được để trống. Vui lòng nhập lại.");
                        }
                    } while (name.isEmpty());
                    a.setName(name);

                    System.out.print("Nhập tiếng kêu: ");
                    String sound = input.nextLine();
                    a.setSound(sound);

                    if(count >= 10){
                        System.err.println("Danh sách đã đầy, không thể thêm mới.");
                        break;
                    }else {
                        animals[count++] = a;
                        System.out.println("Thêm mới động vật thành công!");
                    }
                    break;

                case 2:
                    if (count == 0){
                        System.err.println("Chưa có dữ liệu. Vui lòng chọn 1 để thêm dữ liệu");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(animals[i]);
                        }
                    }
                    break;
                case 3:
                    if(count == 0){
                        System.err.println("Chưa có dữ liệu. Vui lòng chọn 1 để thêm dữ liệu");
                    } else {
                        for (int i = 0; i < count; i++) {
                            animals[i].makeSound();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn 1, 2 hoặc 3");
            }
        }while (true);
    }
}

interface IAnimal{
    void makeSound();
}
class Animal implements IAnimal{
    private String name;
    private String sound;
    private String animalSpecies;
    public void setName(String newName){
        name = newName;
    }
    public void setSound(String newSound){
        sound = newSound;
    }
    public void setAnimalSpecies(String newSpecies) {
        animalSpecies = newSpecies;
    }

    public String getName(){
        return name;
    }
    public String getAnimalSpecies(){
        return animalSpecies;
    }
    public String getSound(){
        return sound;
    }
    @Override
    public String toString() {
        return  "Tên: " + name + "," + " Loại: " + animalSpecies;
    }
    @Override
    public void makeSound(){
        System.out.println(name + " kêu: "+ sound);
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: "+ getSound());
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: "+ getSound());
    }
}

class Bird extends Animal{
    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: " + getSound());
  }
}