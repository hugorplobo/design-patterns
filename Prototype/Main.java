package Prototype;

import Prototype.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(0, 0, "red", 10);
        System.out.println(String.format(
            "x: %d\ny: %d\ncolor: %s\nsize: %d",
            sq1.x,
            sq1.y,
            sq1.color,
            sq1.size
        ));

        Square sq2 = sq1.getClone();
        System.out.println(String.format(
            "x: %d\ny: %d\ncolor: %s\nsize: %d",
            sq2.x,
            sq2.y,
            sq2.color,
            sq2.size
        ));
    }
}
