package n4_1;

public class MinMax<T extends Number>{
    private T[] data;

    public MinMax(T[] array) {
        this.data = array;
    }

    public T getMax() {
        T max = data[0];
        for (T elem : this.data) {
            if (elem.floatValue() > max.floatValue()) {
                max = elem;
            }
        }
        return max;
    }

    public T getMin() {
        T min = data[0];
        for (T elem : this.data) {
            if (elem.floatValue() < min.floatValue()) {
                min = elem;
            }
        }
        return min;
    }
}
