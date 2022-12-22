package lab.lab41.zad5;

public class Viewer {
    private String full_name;
    private int id;
    private String faculty;
    private String birthDate;
    private long tel_num;

    public Viewer(String full_name, int id, String faculty, String birthDate, long tel_num) {
        this.full_name = full_name;
        this.id = id;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.tel_num = tel_num;
    }

    public void takeBook(int num) {
        System.out.println(this.full_name + " взял = " + num + " книг");
    }

    public void takeBook(Book ... books) {
        System.out.println(this.full_name + " взял следующие книги: ");
        for (Book bk : books) {
            System.out.print(bk + " \n");
        }
    }

    public void returnBook(int num) {
        System.out.println(this.full_name + " вернул =  " + num + " книг");
    }

    public void returnBook(Book ... books) {
        System.out.print(this.full_name + " вернул следующие книги: \n");
        for (Book bk : books) {
            System.out.print(bk + " \n");
        }
    }

    @Override
    public String toString() {
        return this.full_name + "; " + this.id + "; " + this.faculty + "; "
                + this.birthDate + "; " + this.tel_num;
    }
}
