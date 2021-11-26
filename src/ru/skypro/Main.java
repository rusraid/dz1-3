package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
//        Вариант 1, длинный, но правильный
        int clientOs = 1;

        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

////        Вариант 2, короче и тоже работает, но не совсем соответствует условиям задачи
//        int clientOs = 1;
//        if (clientOs == 1) {
//            System.out.println("Установите версию приложения для Android по ссылке");
//        } else {
//            System.out.println("Установите версию приложения для IOS по ссылке");
    }

    public static void task2() {
        int clientOs = 0;
        int clientDeviceYear = 2014;

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task3() {

        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4() {

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Приносим извинения, пока доставка карт к Вам не осуществляется");
        }

    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

