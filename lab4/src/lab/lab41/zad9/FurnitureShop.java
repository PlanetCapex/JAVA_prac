package lab.lab41.zad9;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture t1 = new Table("дерво", 1000, 5);
        Furniture t2 = new Table("пластик", 100, 5);
        Furniture s1 = new Sofa("пух", 1000, 1);
        Furniture s2 = new Sofa("шерсть", 3500, 4);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
