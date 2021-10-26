package HW_7_Anonimus_and_Enum.pactical_work_1;

public class Main {
    public static void main(String[] args) {
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Печатать новости");
            }
        };
        Printable[] news = {
                new Book(), new Magazine(), newspaper
        };

        for (int i = 0; i < news.length; i++) {
            Printable item = news[i];
            item.print();
        }
    }
}
