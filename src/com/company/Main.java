package com.company;

public class Main {

    public static void main(String[] args) {
        int ClientOS = 1;
        int clientDeviceYear = 2015;
        if (ClientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Устаноите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (ClientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Устаноите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


        int year = 2021;
        if (year == 4 && year == 400 && year != 100) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }


        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:   + доставка 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:   + доставка 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:   + доставка 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Потребуется дней:   + доставка 4 дня и более");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                break;
        }
    }
}
