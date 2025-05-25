package Session07;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Bob");
        student1.setAge(21);
        student1.setClassName("A1");
        student1.setAvgScore(7.0);

        student2.setName("Eve");
        student2.setAge(20);
        student2.setClassName("A1");
        student2.setAvgScore(8.0);

        student3.setName("Marry");
        student3.setAge(26);
        student3.setClassName("B1");
        student3.setAvgScore(6.0);

        Student[] students = {student1, student2, student3};

        System.out.print("Nhập điểm min: ");
        double min = input.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = input.nextDouble();

        if(min < 0 || min > 10 || max < 0 || max > 10) {
            System.out.println("Điểm không hợp lệ, vui lòng nhập lại");
        } else {
            System.out.println("Danh sách sinh viên có điểm trung bình từ "+ min + " đến " +max +":");
            for (Student s : students) {
                if (s.getAvgScore() >= min && s.getAvgScore() <= max) {
                    System.out.println("Tên: " + s.getName() + ", Tuổi: " + s.getAge() +
                            ", Lớp: " + s.getClassName() + ", Điểm trung bình: " + s.getAvgScore());
                }
            }
        }
    }
}
class Student{
    String name;
    int age;
    String className;
    double avgScore;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getClassName(){
        return className;
    }
    public double getAvgScore(){
        return avgScore;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setClassName(String newClassName){
        className = newClassName;
    }
    public void setAvgScore(double newAvgScore){
        avgScore = newAvgScore;
    }

}