package org.example;

public class Location {

    private int xPos; // позиция по плоскости х
    private int yPos; // позиция по плоскости у

    /*
    Конструктор:
    входные параметры:
     позиция по плоскости х
     позиция по плоскости у
     */
    public Location(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Location{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
