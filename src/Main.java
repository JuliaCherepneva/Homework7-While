//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        int cash = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + (total/100);
            total = total + cash;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
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

        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int death = 8;
        int born = 17;
        int diff = born - death;
        int populationInYear = 0;
        for (int year = 1; year <= 10; year++) {
            populationInYear = diff * population / 1000;
            population = populationInYear + population;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }

    }
}