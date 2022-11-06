package Prototype.Shape;

public class Square extends Shape {
    public int size;

    public Square(int x, int y, String color, int size) {
        super(x, y, color);
        this.size = size;
    }

    public Square getClone() {
        Square clone = new Square(this.x, this.y, this.color, this.size);
        return clone;
    }
}
