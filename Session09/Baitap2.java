package Session09;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal[] animals = new Animal[10];
        int count = 0;
        int choose;
        do {
            System.out.println("************** MENU QUẢN LÝ NHÂN VIÊN *************");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính lương cho từng loại nhân viên");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            choose = input.nextInt();
            input.nextLine();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (true);
    }
}
interface SalaryCalculator{
    double calculateSalary();
}
abstract class Employee implements SalaryCalculator {
    private String name;
    private  int age;
    private double baseSalary;
    private String employeeType;

    public void setName(String newName) {
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setBaseSalary(double newBaseSalary){
        baseSalary = newBaseSalary;
    }
    public void setEmployeeType(String newEmployeeType){
        employeeType = newEmployeeType;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getEmployeeType(){
        return employeeType;
    }
    @Override
    public String toString() {
        return  "Tên: " + name + "," + "Tuổi: " + age + ","+ " Loại: " + employeeType;
    }

}
class  PermanentEmployee extends Employee{
    public double calculateSalary(){
        return getBaseSalary();
    }
}
class  ContractEmployee extends Employee{
    public double calculateSalary(){
        return getBaseSalary()*0.8;
    }
}