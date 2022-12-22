package n4_1;

public class MinMaxTest {
    public static void main(String[] args) {
        MinMax<Integer> mInt = new MinMax<>(new Integer[] {3, 4, 5, 6, 4, 1, 3});
        System.out.println(mInt.getMax());
        System.out.println(mInt.getMin());

        MinMax<Float> mFloat = new MinMax<>(new Float[] {1.2F, 4.5F, 3.5435F, 6345.13F, 0.34254F});
        System.out.println(mFloat.getMax());
        System.out.println(mFloat.getMin());

        MinMax<Long> mLong = new MinMax<>(new Long[] { 42341253464539857L, 890534254358289L,
                                                                859819876621387L, 6652364734845285476L});
        System.out.println(mLong.getMax());
        System.out.println(mLong.getMin());
    }
}
