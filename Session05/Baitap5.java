package Session05;

public class Baitap5 {
    public static void main(String[] args) {
        long startTime, endTime;
        String str = "Hello";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            str += "World";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với String: " + (endTime - startTime) + " ms");

        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            sb.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuider: " + (endTime - startTime) + " ms");

        StringBuffer sbf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            sbf.append("World");
        };
        endTime =System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endTime - startTime) + " ms");

    }
}
