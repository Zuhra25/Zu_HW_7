
    public class Main {
        public static void main(String[] args) {
            task1(); task2(); task3();task4();task5();task6();task7();task8();
        }
    public static void task1 () {
        System.out.println("Задача 1:");
        int invest = 15_000;
        int deposit = 0;
        int month = 0;
        while (deposit <= 2_459_000) {
            deposit += invest;
            month += 1;
            System.out.println("Месяц " + month + "," + " сумма накоплений равна " + deposit + " рублеймесяц ");
        }
    }

    public static void task2 () {
            System.out.println("Задача 2:");
            int number = 1;
            while (number <= 10){
                System.out.print(number + " ");
                number += 1;
            }
            System.out.println();
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3:");
        int countryY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            countryY += Math.abs((countryY / 1000 * fertility) - (countryY / 1000 * mortality));
            System.out.println("год " + i + "," + "численность населения составляет " + countryY);
        }
    }

    public static void task4 () {
            System.out.println("Задача 4:");
            int deposit = 15_000;
            for (int month = 1; deposit <= 12_000_000; month++) {
                deposit *= 1.07;
                System.out.println("месяц " + month + ", накоплений " + deposit);
            }
     }

    public static void task5 () {
            System.out.println("Задача 5:");
            int deposit = 15_000;
            for (int month = 1; deposit <= 12_000_000; month++) {
                deposit *= 1.07;
                if (month % 6 ==0)
                System.out.println("месяц " + month + ", накоплений " + deposit);
            }
    }
        public static void task6() {
            System.out.println("Задача 6:");
            int deposit = 15_000;
            for (int month = 1; month <= 108; month++) {
                deposit *= 1.07;
                if (month % 6 ==0) {
                    double halfYear = (double) month / 12;
                    System.out.println("год - " + halfYear + ", накоплений " + deposit);
                }
            }
        }

        public static void task7() {
            System.out.println("Задача 7:");
            int firstFeb = 5;
            for (int i = firstFeb; i <= 31; i += 7)
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
        }

        public static void task8() {
            System.out.println("Задача 8:");
            int comet = 79;
            int year1 = 1823;
            int year2 = 2123;
            for (int i = 0; i <= year2; i++) {
                if ((i % comet == 0) && (i >= year1))
                    System.out.println(i);
            }
        }
}
