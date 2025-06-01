package Session11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Baitap1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Các số chẵn trong danh sách: ");
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);

        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println("Tổng của tất cả các số trong danh sách: "+sum);
    }
}
