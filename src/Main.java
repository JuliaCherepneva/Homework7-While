//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        int cash = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + cash;
            month++;
        }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");


        System.out.println("\nЗадание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int g = 10; g >= 1; g--) {
            System.out.print(g + " ");
        }
        System.out.println();

        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int death = 8;
        int born = 17;
        int diff = born - death;
        for (int year = 1; year <= 10; year++) {
            population = population + diff * population / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }

        System.out.println("\nЗадание 4");
        {
            int deposit = 15_000;
            int depositPercent = 7;
            int Month = 0;
            while (deposit < 12_000_000) {
                deposit = deposit + (deposit * depositPercent / 100);
                Month++;
                System.out.println("Месяц " + Month + ", сумма накоплений равна " + deposit+ " рублей");
            }
        }
        System.out.println("\nЗадание 5");
        {
            int deposit = 15_000;
            int depositPercent = 7;
            int Month = 0;
            while (deposit < 12_000_000) {
                deposit = deposit + (deposit * depositPercent / 100);
                Month++;
                if (Month % 6 == 0) {
                    System.out.println("Месяц " + Month + ", сумма накоплений равна " + deposit + " рублей");
                }
            }
        }
        System.out.println("\nЗадание 6");
        {
            int deposit = 15_000;
            int depositPercent = 7;
            int Month = 0;
            while (Month <= 108) {
                deposit = deposit + (deposit * depositPercent / 100);
                Month++;
                if (Month % 6 == 0) {
                    System.out.println("Месяц " + Month + ", сумма накоплений равна " + deposit + " рублей");
                }
            }
        }
        System.out.println("\nЗадание 7");
        for (int dayNumber = 7; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 0) {
                System.out.println("Сегодня пятница " + dayNumber + " число. Необходимо подготовить отчет");
            }
        }
        System.out.println("\nЗадание 8");
        int now = 2024;
        int befor = now - 200;
        int after = now + 100;
        for (int comet = befor; comet < after; comet++) {
            if (comet % 79 == 0) {
                System.out.println(comet);
            }
        }
    }
}