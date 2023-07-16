package Andreea.JavaBasics3;

public class Rectangle extends GeometricFigure {

    private double h,l;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getArea(){
        return h*l;
    }
}
