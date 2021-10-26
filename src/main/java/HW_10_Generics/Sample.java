package HW_10_Generics;

public class Sample<T> {
    private T t;

    public Sample(T t) {
        this.t = t;
    }

    public void show() {
        System.out.println(t.getClass());
    }
}
