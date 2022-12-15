public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

    }
    public static void task1 () {
        System.out.println("Задание №1");
        int investment = 15000;
        int accumulation = 0;
        int months = 0;
        while (accumulation<=2_459_000) {
            accumulation = accumulation + investment;
            months = months + 1;
            System.out.println("Месяц "+months+", сумма накоплений "+accumulation+" рублей");
            }
            System.out.println("Месяц "+months+", сумма накоплений "+accumulation+" рублей");
        }

    public static void task2 () {
        System.out.println("Задание №2");
        int number = 1;
        while (number<=10) {
            System.out.print(number+" ");
            number = number + 1;
        }
        System.out.println();
        for (int i=10;i>=1;i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задание №3");
        int population = 12_000_000;
        int fertilityOnThousand = 17;
        int mortalityOnThousand = 8;
        for (int i = 1; i <=10; i++) {
            population = population +fertilityOnThousand * population / 1000 + mortalityOnThousand * population / 1000;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
    }
    public static void task4 () {
        System.out.println("Задание №4");
        int months = 0;
        int investment = 15000;
        double percent = 0.07;
        double sum = investment;
        while (sum<12_000_000) {
            sum = sum * (1+percent);
            months++;
            System.out.println("Месяц "+months+", сумма накоплений "+sum+" рублей");
        }
        System.out.println("Необходимо "+months+" месяцев, чтобы накопить "+sum+"рублей");

    }
    public static void task5 () {
        System.out.println("Задание №5");
        int months = 0;
        int investment = 15000;
        double percent = 0.07;
        double sum = investment;
        while (sum<12_000_000) {
            sum = sum * (1+percent);
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений " + sum + " рублей");
            }
        }
        System.out.println("Необходимо "+months+" месяцев, чтобы накопить "+sum+"рублей");

    }
    public static void task6 () {
        System.out.println("Задание №6");
        int months = 0;
        int investment = 15000;
        double percent = 0.07;
        double sum = investment;
        int finishOfAccumulation = 9*12;
        while (months != finishOfAccumulation) {
            sum = sum * (1+percent);
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений " + sum + " рублей");
            }
        }
        System.out.println("Необходимо "+months+" месяцев, чтобы накопить "+sum+"рублей");

    }
    public static void task7 () {
        System.out.println("Задание №7");
        int firstFridayOfMonths = 3;
        int fridays = firstFridayOfMonths;
        while (fridays<=31) {
            System.out.println("Сегодня пятница, "+fridays+" число. Необходимо подготовить отчет.");
            fridays = fridays + 7;
        }


    }
    public static void task8 () {
        System.out.println("Задание №8");
        int currentYear = 2021;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        while (yearBefore != currentYear) {
            if (yearBefore % 79 == 0) {
                System.out.println(yearBefore);
            }
            yearBefore = yearBefore + 1;
        }
        while (yearAfter != currentYear) {
            if (yearAfter % 79 == 0) {
                System.out.println(yearAfter);
            }
            yearAfter = yearAfter - 1;
        }
    }

}