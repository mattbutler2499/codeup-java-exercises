package Shapes;

public class Square extends Rectangle{


    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return this.width ^ 2;
    }

    @Override
    public int getPerimeter() {
        return this.width * 4;
    }
}
