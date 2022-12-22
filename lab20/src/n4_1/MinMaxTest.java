package n4_1;

public class MinMaxTest {
    public static void main(String[] args) {
        MinMax<Integer> mInt = new MinMax<>(new Integer[] {2, 3, 3, 4, 4, 1, 3});
        System.out.println(mInt.getMax());
        System.out.println(mInt.getMin());

        MinMax<Float> mFloat = new MinMax<>(new Float[] {2.2F, 3.5F, 4.5435F, 6345.13F, 0.34254F});
        System.out.println(mFloat.getMax());
        System.out.println(mFloat.getMin());

        MinMax<Long> mLong = new MinMax<>(new Long[] { 42341253464L, 890534358289L,
                                                                85981987661387L, 5652364845285476L});
        System.out.println(mLong.getMax());
        System.out.println(mLong.getMin());
    }
}
