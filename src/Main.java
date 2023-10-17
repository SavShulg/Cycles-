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

        // 2 ЧАСТЬ ЗАДАЧ

        // 1 Задача

        int salary3 = 15000;
        int total3 = 0;
        int i = 0;
        while (total3 < 2_459_000) {
            total3 = total3 + salary3;
            i++;
            if (i % 1 == 0) {
                System.out.println("Месяц " + i + ". Сумма накоплений равна " + total3 + " рублей");
            }
        }

        // 2 Задача

        int start = 0;
        while (start <= 10) {
            System.out.print(start + " ");
            start ++;
        }
        System.out.println(" ");
        int start1 = 10;
        for (; start1 >= 0; start1--) {
            System.out.print(start1 + " ");
        }
        System.out.println(

        );

        // 3 Задача

        int Y = 12_000_000;
        double birthRate = 17;
        double deathRate = 8;
        double birth = (birthRate - deathRate) / 1000 * Y;
        for (int year = 0; year <= 10; year++) {
            Y += birth = (birthRate - deathRate) / 1000 * Y;
            System.out.println("Год " + year + ", численность населения составляет " + Y);

        }
        System.out.println();

        // 4 Задача

        double salaryVasiliy = 15000;
        double vklad = 15000 * 0.07;
        double total4 = 0;
        int month = 0;
        for (;total4 < 12_000_000; month++) {
            total4 =  total4 + salaryVasiliy + vklad;
            if (month % 1 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений равна " + total4);
            }

        }
        System.out.println();


        // 5 Задача

        double salaryVasiliy1 = 15000;
        double vklad1 = 15000 * 0.07;
        double total5 = 0;
        int month1 = 0;
        for (;total5 < 12_000_000; month1++) {
            total5 =  total5 + salaryVasiliy1 + vklad1;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ". Сумма накоплений равна " + total5);
            }

        }
        System.out.println();

        // Задача 6

        double salaryVasiliy2 = 15000;
        double vklad2 = 15000 * 0.07;
        double total6 = 0;
        int month2 = 0;
        for (;month2 <= 108 ;month2++) {
            total6 =  total6 + salaryVasiliy2 + vklad2;

            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ". Сумма накоплений равна " + total6);
            }

        }

        System.out.println();


        // 7 Задача

        int friday = 5;
        //int dayMonth = 31;
        for (; friday < 31; friday = friday + 7) {
            System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();

        // 8 Задача

        int backYear = 1823;
        int futureYear = 2123;
        while (futureYear > backYear) {
            backYear = backYear + 79;
            System.out.println(backYear);
        }
    }
}