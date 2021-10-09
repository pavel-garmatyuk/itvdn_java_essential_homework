package HW_4_Abstract.Practicle_1.Practicle_1.Practicle_2;

public class Trapezoid extends Figure {
    private final int sideOne;
    private final int sideTwo;
    private final int height;

    public Trapezoid(int sideOne, int sideTwo, int height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    private int calculateArea(int sideOne, int sideTwo, int height) {

        return (height / 2) * (sideOne + sideTwo);
    }

    @Override
    public int calculateArea() {
        return calculateArea(sideOne, sideTwo, height);
    }
}
