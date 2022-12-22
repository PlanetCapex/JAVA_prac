package lab.lab41.zad7;

public class TestPupils {
    public static void main(String[] args) {
        Pupil[] arr = new Pupil[4];
        arr[0] = new Student("Петр");
        arr[1] = new Schooler("Василий");
        arr[2] = new Schooler("Иван");
        arr[3] = new Student("Олег");

        System.out.println("Студенты: ");
        for (int i = 0; i < 4; i++) {
            if(arr[i] instanceof Student) {
                System.out.println(arr[i].getName());
            }
        }
        System.out.println("Школьники: ");
        for (int i = 0; i < 4; i++) {
            if(arr[i] instanceof Schooler) {
                System.out.println(arr[i].getName());
            }
        }
    }
}
