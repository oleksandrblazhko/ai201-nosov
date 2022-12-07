package org.example;


public class Main {
    public static void main(String[] args) {
        User user = new User();// создание объекта User
        user.setUserLocation(new Location(12,34));// присваивание полю юзера новой локации
        System.out.println(user); // вывод всей информации о юзере
        Illumination illumination = new Illumination();// создание объекта Illumination
        user.sendLocation(clearAir);// отправка локации юзера на Illumination
        illumination.printAllMeters();// вывод значений счетчиков
    }
}