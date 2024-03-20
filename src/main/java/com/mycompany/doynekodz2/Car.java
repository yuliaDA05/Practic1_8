/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doynekodz2;

/**
 *
 * @author yulia
 */
class Car {
    String brand;
    int year;
    String regNumber;

    public Car(String brand, int year, String regNumber) {
        this.brand = brand;
        this.year = year;
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return brand + ", " + year + ", " + regNumber;
    }
}