package lab.lab4.zad3;

public enum Catalog {
    ManClothes(4, new Product[] {
            new Product("Футболка", "Желтый" ,1000, 1),
            new Product("Шорты", "Черный", 1000, 2),
            new Product("Джинсы", "Белый", 2500, 3),
            new Product("Галстук", "Красный", 2500, 4),
    }),
    WomanClothes(4, new Product[] {
            new Product("Юбка", "Белый" ,2000, 5),
            new Product("Платье", "Белый", 2000, 6),
            new Product("Шляпа", "Белый", 6000, 7),
            new Product("Футболка", "Белый", 7500, 8)
    }),
    Shoes(7, new Product[] {
            new Product("Nike", "Черный", 5000, 9),
            new Product("New Balance", "Черный", 10000, 10),
            new Product("Ralph Lauren", "Синий", 25000, 11),
            new Product("Louis Vuitton", "Белый", 52000, 12),

    }),
    Accessorises(5, new Product[] {
            new Product("Рюкзак", "Красный", 2500, 13),
            new Product("Очки", "Черный", 1000, 14),
            new Product("Часы", "Желтый", 5000, 15),
            new Product("Шарф", "Серый", 10000, 16),
    }),;

    private int amount;
    public Product[] goods = new Product[amount];

    Catalog(int amount,Product[] goods) {
        this.amount = amount;
        this.goods = goods;
    }

    public void showCatalog() {
        for (Product prods : goods) {
            System.out.print("\n" + prods.toString());
        }
    }

}
