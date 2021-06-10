package Animal;

public class Cricle implements Colorable{
    double radius;
    String color;
    public Cricle(){

    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");

    }
}
