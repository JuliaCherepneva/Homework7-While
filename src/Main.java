//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        {
            int deposit = 15_000;
            int total = 0;
            int month = 0;
            while (total <= 2_459_000) {
                total += deposit;
                month++;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

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
            int period = 9*12;
            for (int Month = 1; Month < period; Month++) {
                deposit = deposit + (deposit * depositPercent / 100);
                if (Month % 6 == 0) {
                    System.out.println("Месяц " + Month + ", сумма накоплений равна " + deposit + " рублей");
                }
            }
        }
        System.out.println("\nЗадание 7");
        int dayNumber = 7;
        for ( ; dayNumber <= 31; dayNumber += 7) {
            System.out.println("Сегодня пятница " + dayNumber + " число. Необходимо подготовить отчет");
        }
        System.out.println("\nЗадание 8");
        int nowYear = 2024;
        int yearBefor = nowYear - 200;
        int yearAfter = nowYear + 100;
        for (int cometYear = yearBefor; cometYear < yearAfter; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
    }
}