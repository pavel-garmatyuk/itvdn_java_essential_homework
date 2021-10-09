package HW_4_Abstract.Practicle_1.Practicle_1.Practicle_2;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    private int calculateAreaCircle(int radius) {
        return (int) ((int) Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int calculateArea() {
        return calculateAreaCircle(radius);
    }
}

