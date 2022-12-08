
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1"); // Реализуйте метод, который получает в качестве параметра год, проверяет
        System.out.println("Введите год");
        Scanner a1 = new Scanner(System.in);
        int year = a1.nextInt();
        int leapYear = printYear(year);
        if (leapYear == 1) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static int printYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return 1;
        } else {
            return 0;
        }
    }
}




    public static void main(String[] args) {
        System.out.println("Задача 2"); // Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android )
        System.out.println("Ввведите вашу ОС 1/0");
        Scanner a2 = new Scanner(System.in);
        int system = a2.nextInt();
        System.out.println("Ввведите годы выпуска вашего телефона");
        Scanner a3 = new Scanner(System.in);
        int yearSystem = a2.nextInt();
        int currentYear = yearChoose(yearSystem, system);

        if (currentYear == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (currentYear == 2) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (currentYear == 3) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (currentYear == 4) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static int yearChoose(int yearSystem, int system) {
        if ((yearSystem >= 2015) && (system == 1)) {
            return 1;
        } else if  ((yearSystem >= 2015) && (system == 0)) {
            return 2;
        } else if  ((yearSystem < 2015) && (system == 1)) {
            return 3;
        }  else if ((yearSystem < 2015) && (system == 0)) {
            return 4;
        }  else {
            return 5;
        }
    }
}


    public static void main(String[] args) {
        System.out.println("Задача 3"); // Доставка карт
        int deliveryDistance = 95;
        int Distance = cardDelivery(deliveryDistance);
        int dayDelivery = 1;
        if (Distance == 1) {
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (Distance == 2) {
            System.out.println("Потребуется дней: " + (dayDelivery + 1));
        } else if (Distance == 3) {
            System.out.println("Потребуется дней: " + (dayDelivery + 2));
        } else if (Distance == 4) {
            System.out.println("Доставки нет");
        }
    }
    public static int cardDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (20 <= deliveryDistance && deliveryDistance <= 60) {
            return 2;
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            return 3;
        } else   {
            return 4;
        }
    }
}