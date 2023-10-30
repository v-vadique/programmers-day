import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("День программиста будет 12.09." + year);
        } else {
            System.out.println("День программиста будет 13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year%4 == 0) {
            isLeapYear = true;
            if (year%100 == 0 && year%400 != 0){
                isLeapYear = false;
            }
        }
        return isLeapYear;
    }
} 