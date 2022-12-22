package ru.mirea.lab6.n10;
import java.util.Scanner;
import java.util.ArrayList;

public class ComputerShop implements ShopActions {
    Scanner sc = new Scanner(System.in);
    ArrayList<Computer> comps = new ArrayList<>();

    ComputerShop() {}

    @Override
    public void fillComputerInformation(int n) {
        String br;
        String procName;
        int memoryAmount;
        String monitorResolution;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите марку (ASUS, DELL, HP, MSI):");
            br = sc.next();
            Brands brand =  Brands.valueOf(br);
            System.out.println("Введите название процессора:");
            procName = sc.next();
            Processor proc = new Processor(procName);
            System.out.println("Введите количество памяти:");
            memoryAmount = sc.nextInt();
            Memory mem = new Memory(memoryAmount);
            System.out.println("Введите разрешение монитора:");
            monitorResolution = sc.next();
            Monitor mon = new Monitor(monitorResolution);
            comps.add(new Computer(i + 1, proc, mem, mon, brand));
            System.out.println(comps.get(comps.size()-1).toString() + " добавлен");
        }
    }

    @Override
    public void addComputer() {
        String br;
        String procName;
        int memoryAmount;
        String monitorResolution;
        System.out.println("Введите марку (ASUS, DELL, Hp, MSI):");
        br = sc.nextLine();
        Brands brand =  Brands.valueOf(br);
        System.out.println("Введите название процессора:");
        procName = sc.nextLine();
        Processor proc = new Processor(procName);
        System.out.println("Введите количество памяти:");
        memoryAmount = sc.nextInt();
        Memory mem = new Memory(memoryAmount);
        System.out.println("Введите разрешение монитора:");
        monitorResolution = sc.nextLine();
        Monitor mon = new Monitor(monitorResolution);
        comps.add(new Computer(comps.size() + 1, proc, mem, mon, brand));
        System.out.println(comps.get(comps.size()-1).toString() + " добавлен");
    }

    @Override
    public void deleteComputer(int id) {
        for (Computer cp : comps) {
            if (cp.getID() == id) {
                comps.remove(cp);
                System.out.println("Компьютер удален");
                return;
            }
        }
        System.out.println("Компьютер не найден");
    }

    @Override
    public Computer findComputer(int id) {
        for (Computer cp : comps) {
            if (cp.getID() == id) { return cp; }
        }
        return null;
    }

    @Override
    public void showComputers(){
        for(Computer comp : comps) {
            System.out.println(comp.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComputerShop shop = new ComputerShop();
        System.out.println("Введите количество компьютеров:");
        int num = sc.nextInt();
        shop.fillComputerInformation(num);
        System.out.println(shop.findComputer(2));
        shop.deleteComputer(1);
        shop.showComputers();
    }
}
