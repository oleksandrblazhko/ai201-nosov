package org.example;

import java.util.Random;

public class Illumination {

    private int levelOfIllumination;
    private int time;
    private Location userLocation;

    public int getLevelOfIllumination() {
        return levelOfIllumination;
    }

    public void setLevelOfIllumination(int levelOfIllumination) {
        this.levelOfIllumination = levelOfIllumination;
    }

    public int gettime() {
        return time;
    }

    public void settime(int time) {
        this.time = time;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }


    
    public void printAllMeters(){// вывод всех значений счетчиков
        // вычисление значений счетчиков по местоположению пользователя
        parseData(userLocation);
        // вывод значений счетчиков на экран
        System.out.println("illumination: " + levelOfIllumination + "% " + "time: " + time + "% on " + userLocation);
    }
    private void parseData(Location location){//входящие параметры: локация откуда берутся значения
        System.out.println("searching info in " + location + "...");
        Random rand = new Random();
        // установка значений параметров
        setLevelOfIllumination(rand.nextInt(100));
        settime(rand.nextInt(100));
    }
}
