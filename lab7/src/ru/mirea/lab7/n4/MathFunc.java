package ru.mirea.lab7.n4;

public class MathFunc implements MathCalculate{
    MathFunc() {}
    @Override
    public double pow(double num, int grad) {
        if (grad == 0) { return 1; }
        if (grad == 1) { return num; }
        for (int i = 0; i < grad; i++) { num = num  * grad; }
        return num;
    }

    @Override
    public double abs(double num) {
        if (num > 0 ) return num;
        else return num *= -1;
    }

    @Override
    public double PI() {
        return 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825;
    }
}
