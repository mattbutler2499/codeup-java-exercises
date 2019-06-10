package Shapes;

public class Rectangle {
    protected int width;
    protected int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }
}
