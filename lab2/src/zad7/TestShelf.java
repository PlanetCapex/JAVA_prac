package zad7;
import java.util.Scanner;

public class TestShelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количесвто книг на полке:\n");
        int n = sc.nextInt();
        BookShelf shelf = new BookShelf(n);
        System.out.print("Введите информацию о книгах. Количесвто книг: " + n);
        shelf.fillShelf();
        System.out.print("\nВсе книги на полке\n");
        shelf.outputShelf();
        System.out.println();
        shelf.getOldestBooks();
        shelf.getLatestBooks();
        shelf.sortByDate();
        System.out.print("\nВсе книги, отсортированные по дате\n");
        shelf.outputShelf();

    }
}