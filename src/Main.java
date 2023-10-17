public class Main {
    public static void main(String[] args) {
        // 1 Задача


        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        // 2 Задача

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println(" ");

        // 3 Задача

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);

        }
        System.out.println(" ");

        // 4 Задача

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println(" ");

        // 5 Задача

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println(" ");

        // 6 Задача

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println(" ");

        // 7 Задача

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println(" ");

        // 8 Задача

        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц- " + i + ", сумма накоплений равна " + total);
        }

        System.out.println(" ");

        // 9 Задача

        int salary1 = 29000;
        int total2 = 0;
        for (int i = 0; i <= 12; i++) {
            total2 = total2 + salary1;
            total2 = total2 + total2 / 100;
            System.out.println("Месяц- " + i + ", сумма накоплений равна " + total2);
        }

        System.out.println(" ");

        // 10 Задача
        int y = 2;
        for (int i = 1; i <= 10; i++) {

            System.out.println(y + " * " + i + " = " + y * i);
        }

    }
}