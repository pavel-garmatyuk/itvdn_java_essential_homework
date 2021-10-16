package HW_4_Abstract.Task_2;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Open .txt");
    }

    @Override
    public void create() {
        System.out.println("Create .txt");
    }

    @Override
    public void change() {
        System.out.println("Change .txt");
    }

    @Override
    public void save() {
        System.out.println("Save .txt");
    }
}
