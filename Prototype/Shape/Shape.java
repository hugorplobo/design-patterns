package Prototype.Shape;

import Prototype.Prototype.Prototype;

public abstract class Shape implements Prototype {
    public int x, y;
    public String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape getClone();
}
