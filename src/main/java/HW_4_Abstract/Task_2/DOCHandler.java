package HW_4_Abstract.Task_2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Open DOC");
    }

    @Override
    public void create() {
        System.out.println("Create .doc");
    }

    @Override
    public void change() {
        System.out.println("Change .doc");
    }

    @Override
    public void save() {
        System.out.println("Save .doc");
    }
}
