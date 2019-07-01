package package_name;

public class GameObject {
    public double x, y;
    public ArrayList<Graphics> g;

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
        this.smooth = smooth;
    }
    
    public GameObject(){
    }

    void draw() {
        for(var piece: g) g.draw(x, y);
    }
}
