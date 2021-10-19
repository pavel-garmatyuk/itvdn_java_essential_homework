package pactical_work_1;

public class Main {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Override void print");
            }
        };
        Printable[] news = {
                new Book(), new Magazine(), printable
        };

        for (int i = 0; i < news.length; i++) {
            Printable item = news[i];
            item.print();
        }
    }
}
