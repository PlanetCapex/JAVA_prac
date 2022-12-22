package n1_2_3;
import java.io.Serializable;

public class GenericTest {
    public static void main(String[] args) {
        Animal testAnimalObj = new Animal();
        Generic<Comparable<String>, Serializable, Integer> generic = new Generic<>("abc", testAnimalObj, 1);
        generic.showT();
        generic.showV();
        generic.showK();
    }
}
