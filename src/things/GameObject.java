package things;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

import ui.StdDraw;

public abstract class GameObject {
    private double x, y;
    private boolean visible, uses_physics;
    private Consumer<GameObject> draw;

    public void setDraw(Consumer<GameObject> draw) {
        this.draw = draw;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public boolean isVisible() {
        return visible;
    }

    public double getGravAcel() {
        if (this.uses_physics) return 9.8; // :D
        else return 0;
    }

    public ArrayList<Graphics> g; // не понял

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.visible = true;

    }

    public GameObject() {
        this.x = 0;
        this.y = 0;
        this.visible = false;
    }

    void draw() {
        if (isVisible()) {
            this.draw.accept(this);
        }
    }
}
