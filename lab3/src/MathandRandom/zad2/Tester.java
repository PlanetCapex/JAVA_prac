package MathandRandom.zad2;

import java.util.*;

public class Tester {
    private ArrayList<Circle> circles = new ArrayList<>();
    private int circles_num;

    public Circle find_max(){
        double max = 0;
        Circle max_circle = null;
        for(Circle circle:this.circles){
            double temp = find_square(circle);
            if (temp > max){
                max = temp;
                max_circle = circle;
            }
        }
        return max_circle;
    }
    public Circle find_min(){
        double min = 100000000;
        Circle min_circle = null;
        for(Circle circle:this.circles){
            double temp = find_square(circle);
            if (temp > min){
                min = temp;
                min_circle = circle;
            }
        }
        return min_circle;
    }

    public double find_square(Circle circle){
        return Math.pow(circle.getRadius(),2)*Math.PI;
    }
    public void add_circle(Circle circle){
        this.circles.add(circle);
    }

    public void sort_circle(){
        Collections.sort(circles, new Comparator<Circle>(){

            public int compare(Circle c1, Circle c2){
                double s1 = find_square(c1);
                double s2 = find_square(c2);
                if (s1 > s2){
                    return 1;
                }
                else if (s1 < s2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }

    public void all_circles(){
        circles.forEach((cir) -> System.out.println(cir.toString()));
    }
    public Tester(){
        System.out.println("Введите количество окружностей: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i < n; i++){
            System.out.println("Задайте точку для окружности");
            Circle circle = new Circle();
            System.out.println("x = ");
            int x = scanner.nextInt();
            System.out.println("y = ");
            int y = scanner.nextInt();
            circle.add_point(x,y);
            this.add_circle(circle);
        }
    }


}
