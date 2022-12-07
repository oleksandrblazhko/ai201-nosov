package org.example;

import java.util.Random;

public class Illumination {

    private int levelOfIllumination; // параметр освещения
    private int time; // параметр времени
    private Location userLocation; // локация пользователя для которого высчитываются параметры

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

    public void printAllMeters(){
        parseData(userLocation);
        System.out.println("illumination: " + levelOfIllumination + "% " + "time: " + time + "% on " + userLocation);
    }

    private void parseData(Location location){//in developing
        Random rand = new Random();
        setLevelOfIllumination(rand.nextInt(100));
        settime(rand.nextInt(100));
    }
}
