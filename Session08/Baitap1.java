package Session08;

public class Baitap1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[0].setName("Buddy");
        animals[0].setAge(3);
        ((Dog)animals[0]).setBreed("Golden Retriever");

        animals[1] = new Cat();
        animals[1].setName("Whiskers");
        animals[1].setAge(2);
        ((Cat)animals[1]).setFurColor("Ghi");

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
        }
    }
}
class Animal {
        private String name;
        private int age;

        public void setName (String newName){
            if (newName.isEmpty()) {
                System.err.println("Vui lòng nhập tên động vật");
            } else {
                name = newName;
            }
        }

        public void setAge ( int newAge){
            if (newAge < 0) {
                System.err.println("Tuổi không hợp lệ, vui lòng nhập lại");
            } else {
                age = newAge;
            }
        }

        void displayInfo () {
            System.out.println("Tên: " + name + "," + "Tuổi: " + age);
        }

        void makeSound () {
            System.out.println("Âm thanh: Some generic sound\n");
        }
    }


class Dog extends Animal {
    private String breed;
    public void setBreed(String newBreed){
        breed = newBreed;
    }
    @Override
    void makeSound() {
        System.out.println("Âm thanh: Woof Woof\n");
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Giống chó: "+ breed);
    }
}

class Cat extends Animal {
    private String furColor;
    public void setFurColor(String newColor){
        furColor = newColor;
    }
    @Override
    void makeSound() {
        System.out.println("Âm thanh: Meow Meow\n");
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }
}
