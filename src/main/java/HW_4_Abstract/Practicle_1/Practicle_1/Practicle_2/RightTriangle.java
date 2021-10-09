package HW_4_Abstract.Practicle_1.Practicle_1.Practicle_2;

public class RightTriangle extends Figure {

    private final int sideOne;
    private final int sideTwo;

    public RightTriangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    private int calculateAreaRightTriangle(int sideOne, int sideTwo) {

        return (sideOne * sideTwo) / 2;
    }

    @Override
    public int calculateArea() {
        return calculateAreaRightTriangle(sideOne, sideTwo);
    }
}
