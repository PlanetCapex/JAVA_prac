package zad7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class BookShelf {
        private int amount;
        ArrayList<Book> shelf = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public BookShelf(int _amount) {
            this.amount = _amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public void fillShelf() {
            for (int i = 0; i < amount; i++) {
                System.out.print("\nID Книги: " + (i + 1));
                System.out.print("\nВведите название: ");
                String _n = sc.next();
                System.out.print("Введите автора: ");
                String _a = sc.next();
                System.out.print("Введите год издания: ");
                int _y = sc.nextInt();
                Book bk = new Book(_n, _a, (i + 1), _y);
                shelf.add(bk);
            }
        }

        public void getOldestBooks() {

            int oldestYear = shelf.get(0).getYear();

            for (Book bk : shelf) {
                if (bk.getYear() < oldestYear) { oldestYear = bk.getYear(); }
            }

            System.out.print("\nКниги с самым ранним сроком издания\n");
            for (Book bk : shelf) {
                if (bk.getYear() == oldestYear) {
                    System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
                }
            }
        }

        public void getLatestBooks() {
            int latestYear = shelf.get(0).getYear();

            for (Book bk : shelf) {
                if (bk.getYear() > latestYear) { latestYear = bk.getYear(); }
            }

            System.out.print("\nКниги с самым поздним сроком издания\n");
            for (Book bk : shelf) {
                if (bk.getYear() == latestYear) {
                    System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
                }
            }
        }

        public void outputShelf() {
            System.out.print("\nВсе книги на полке\n");
            for(Book bk : shelf) {
                System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
            }
        }


        public void sortByDate(){
            Collections.sort(shelf, new Comparator<Book>(){

                public int compare(Book b1, Book b2){
                    int y1 = b1.getYear();
                    double y2 = b2.getYear();
                    if (y1 > y2){
                        return 1;
                    }
                    else if (y1 < y2) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            });
        }

}

