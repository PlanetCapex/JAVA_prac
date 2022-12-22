package lab.lab4.zad4;

public class Monitor {
    private String resolution;
    private String definition;

    public Monitor(String resolution, String definition) {
        this.resolution = resolution;
        this.definition = definition;
    }

    @Override
    public String toString() {
        return " разрешение монитора " + this.resolution + " " + this.definition;
    }
}
