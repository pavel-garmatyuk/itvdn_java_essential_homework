package HW_4_Abstract.Task_2;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Open XML");
    }

    @Override
    public void create() {
        System.out.println("Create .xml");
    }

    @Override
    public void change() {
        System.out.println("Change .xml");
    }

    @Override
    public void save() {
        System.out.println("Save .xml");
    }
}
