package package_name;

public class GameObject {
    private double x;
    private double y;
    private boolean smooth;

    public GameObject(double x, double y, boolean smooth) {
        this.x = x;
        this.y = y;
        this.smooth = smooth;
    }

    void draw() {
        // ...
    }

    void next() {
        // ...
    }

    boolean isSmooth() {
        return this.smooth;
    }

    double damage(double x, double y) {
        // ...
        return -1.0;
    }
}
