package geometry3d;

import geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public double volume() {

        return this.base.area() * this.height;
    }

    public String toString() {
        String var10000 = this.base.toString();
        String res = "";
        res =  "Cylinder (base: " + var10000 + ", height: " + this.height + ", Volume: " + this.volume() + ")";

        return res;
    }
}
