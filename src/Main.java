
import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задача 1"); // Реализуйте метод, который получает в качестве параметра год, проверяет
        System.out.println("Введите год");
        int year = scanner.nextInt();
        int year1 = printYear(year);
        if (year1 == 1) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        System.out.println("Задача 2 Вариант 1"); // Задача 2 Вариант 1
        int versionOS = choseOSAndVersion();
        if (versionOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (versionOS == 2) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (versionOS == 3) {
            System.out.println("Установите облегченную  версию приложения для Android по ссылке.");
        } else if (versionOS == 4) {
            System.out.println("Установите облегченную  версию приложения для iOS по ссылке.");
        }

        System.out.println("Задача 2. Вариант 1"); // Задача 2 Вариант 2
        int versionOS1 = choseOSAndVersion1();

        System.out.println("Задача 3"); // Доставка карт
        int days = deliveryDay();
        if (days <= 4) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static int printYear(int year) { // Метод к Задаче 1
        int year1 = 0;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            year1 = 1;
        } else {
            year1 = 0;
        }
        return year1;
    }

    public static int choseOSAndVersion() {  // Метод к задаче 2 Вариант 1
        System.out.println("Введите Вашу ОС 0 или 1");
        int versionOS = scanner.nextInt();
        System.out.println("Введите год выпуска телефона");
        int yearTelefone = scanner.nextInt();
        if ((yearTelefone >= 2015) && (versionOS == 1)) {
            return 1;
        } else if ((yearTelefone >= 2015) && (versionOS == 0)) {
            return 2;
        } else if ((yearTelefone < 2015) && (versionOS == 1)) {
            return 3;
        } else if ((yearTelefone < 2015) && (versionOS == 0)) {
            return 4;
        }
        return 0;
    }

    public static int choseOSAndVersion1() { // Метод к задаче 2 Вариант 1
        System.out.println("Введите Вашу ОС 0 или 1");
        int versionOS1 = scanner.nextInt();
        System.out.println("Введите год выпуска телефона");
        int yearTelefone1 = scanner.nextInt();
        if ((yearTelefone1 >= 2015) && (versionOS1 == 1)) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if ((yearTelefone1 >= 2015) && (versionOS1 == 0)) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if ((yearTelefone1 < 2015) && (versionOS1 == 1)) {
            System.out.println("Установите облегченную  версию приложения для Android по ссылке.");
        } else if ((yearTelefone1 < 2015) && (versionOS1 == 0)) {
            System.out.println("Установите облегченную  версию приложения для iOS по ссылке.");
        } else {
        }
        return versionOS1;
    }

    public static int deliveryDay() {         // Метод Задача 3
        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (20 <= deliveryDistance && deliveryDistance <= 60) {
            days = 2;
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            days = 3;
            ;
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            days = 4;
        } else {
            days = 6;
        }
        return days;
    }
}










