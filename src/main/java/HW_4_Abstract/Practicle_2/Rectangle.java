package HW_4_Abstract.Practicle_2;

public class Rectangle extends Figure {

    private final int sideOne;
    private final int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    private int calculateAreaRectangle(int sideOne, int sideTwo) {

        return sideOne * sideTwo;
    }

    @Override
    public int calculateArea() {
        return calculateAreaRectangle(sideOne, sideTwo);
    }
}
