package lab.lab4.zad4;

public enum Brands {
    HP (3, new Computer[]{
        new Computer(
                new Processor("Intel I4", 4, 1800),
                new Memory(8, "DDR4"),
                new Monitor("640X320", "Full HD")
        ),
        new Computer(
                new Processor("AMD Ryzen 3", 4, 3200),
                new Memory(8, "DDR4"),
                new Monitor("1920X1880", "Full HD")
        ),
    }),

    ACER(2, new Computer[] {
        new Computer(
                new Processor("Intel i5", 4, 1800),
                new Memory(16, "DDR4"),
                new Monitor("1920X1080", "Full HD")
        ),
        new Computer(
                new Processor("Intel i9", 8, 3200),
                new Memory(16, "DDR5"),
                new Monitor("1920X1080", "Full HD")
        )    
    }),


    MSI(2, new Computer[] {
        new Computer(
                new Processor("AMD FX 8300", 4, 3600),
                new Memory(16, "DDR5"),
                new Monitor("1920X1080", "Full HD")
        ),
        new Computer(
                new Processor("AMD FX 8300", 4, 3600),
                new Memory(16, "DDR6"),
                new Monitor("1920X1080", "Full HD")
        )
    });

    private int amount;

    public Computer[] computers = new Computer[amount];

    Brands(int amountOfCompsInBrand, Computer[] comps) {
        this.amount = amountOfCompsInBrand;
        this.computers = comps;
    }
}
