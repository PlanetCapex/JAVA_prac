package lab.lab41.zad5;

public class TestReader {
    public static void main(String[] args) {
        Viewer rd = new Viewer("Петров П.П.", 12, "МИРЭА", "31.05.1999", 7913678843L);
        System.out.println(rd);
        rd.takeBook(1);
        rd.takeBook(new Book("ava. Эффективное программирование", "Джошуа Блох"));
        rd.returnBook(2);
        rd.returnBook(new Book("изучение JAVA", "Берт Бейтс"),
                new Book("Java в примерах. Справочник", "Дэвид Флэнаган")
                );}
}
