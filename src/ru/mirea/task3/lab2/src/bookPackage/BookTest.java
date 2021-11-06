package bookPackage;

public class BookTest {
    static public void test() {
        Book b1 = new Book("Над пропастью моржи", "Иван Ерохин", 2020);
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());
        b1.setName("Колобок");
        b1.setAuthor("Вячеслав Сычев");
        b1.setYear(2015);
        System.out.println();
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getYear());
    }
}
