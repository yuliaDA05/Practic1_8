/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.doynekodz2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Doynekodz2 {
    public static void main(String[] args) {
        System.out.println("Вариант 1. Дойнеко Юлия Антоновна");
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Volvo s90", 2015, "x001xx"));
        carList.add(new Car("Lada Vesta", 2020, "x002xx"));
        carList.add(new Car("Kia Rio", 2012, "x003xx"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить новую машину");
            System.out.println("2. Удалить машину по регистрационному номеру");
            System.out.println("3. Удалить все машины");
            System.out.println("Ваш выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Введите марку машины: ");
                    String brand = scanner.nextLine();
                    System.out.println("Введите год выпуска: ");
                    int year = 0;
                    while (true) {
                    try {
                    year = Integer.parseInt(scanner.nextLine());
                    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                    if (year >= 1900 && year <= currentYear) {
                    break; // Выход из цикла в случае корректного ввода года
                    } else {
                     System.out.println("Введите корректный год выпуска (от 1900 до " + currentYear + ").");
                    }
                    } catch (NumberFormatException e) {
                    System.out.println("Введите корректный год в числовом формате.");
                    }
                    }

                    System.out.println("Введите регистрационный номер: ");
                    String regNumber = scanner.nextLine();

                    Car newCar = new Car(brand, year, regNumber);
                    if (!carList.contains(newCar)) {
                        carList.add(newCar);
                        System.out.println("Машина успешна добавлена.");
                    } else {
                        System.out.println("Машина с такими регистрационным номером уже существует.");
                    }
                    break;

                case 2:
                    System.out.println("Введите регистрационный номер машины, которую нужно удалить из списка: ");
                    String regNumToRemove = scanner.nextLine();

                    Iterator<Car> iterator = carList.iterator();
                    while (iterator.hasNext()) {
                        Car car = iterator.next();
                        if (car.regNumber.equals(regNumToRemove)) {
                            iterator.remove();
                            System.out.println("Машина успешно удалена.");
                        }
                    }
                    break;

                case 3:
                    carList.clear();
                    System.out.println("Все машины стёрты.");
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте заново.");
            }

            System.out.println("Текущий список машин:");
            for (Car car : carList) {
                System.out.println(car);
            }
        }
    }
}
///В данной программе использование Map не подходит, т. к. нам нужно зранить список объектов класса Car, а не связывать их с какими-либо ключами.
