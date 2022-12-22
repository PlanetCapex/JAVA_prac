package ru.mirea.lab6.n10;

public interface ShopActions {
    void fillComputerInformation(int n);
    void addComputer();
    void deleteComputer(int id);
    Computer findComputer(int id);
    void showComputers();
}
