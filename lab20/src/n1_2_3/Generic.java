package n1_2_3;
import java.io.Serializable;

public class Generic<T extends Comparable, V extends Serializable, K> {
    private T tContent;
    private V vContent;
    private K kContent;

    public Generic(T tCont, V vCont, K kCont) {
        this.tContent = tCont;
        this.vContent = vCont;
        this.kContent = kCont;
    }

    public T getT() { return this.tContent; }
    public V getV() { return this.vContent; }
    public K getK() { return this.kContent; }

    public void showT() { System.out.println("tContent: " + this.getT() + " " + this.tContent.getClass()); }
    public void showV() { System.out.println("vContent: " + this.getV() + " " + this.vContent.getClass()); }
    public void showK() { System.out.println("kContent: " + this.getK() + " " + this.kContent.getClass()); }
}
