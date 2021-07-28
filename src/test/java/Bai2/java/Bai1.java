package Bai2.java;

public class Bai1 {

    public static void main(String[] args) {

        System.out.println("Các số chia hết cho 5 và 7 trong khoảng từ 10 đến 200 là: ");

        for (int i = 10; i <= 200; i++) {

            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i+",");
            }




        }

    }
}

