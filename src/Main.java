
    public class Main {
        public static void main(String[] args) {
            task1(); //task2();task3();task4();task5();task6();task7();task8();
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int invest = 15_000;
            int deposit = 0;
            int month = 0;
            while (deposit <= 2_459_000) {
                deposit += invest;
                month += 1;
                System.out.println("Месяц " + month + "," + " сумма накоплений равна " + deposit + " рублеймесяц ");
            }
        }

//
//        public static void task2 () {
//            System.out.println("Задача 2");
//        ... // Пишем код для задачи 2
//        }
}
