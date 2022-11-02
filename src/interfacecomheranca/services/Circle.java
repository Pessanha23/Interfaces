package interfacecomheranca.services;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle() {
    }

    public Circle(java.awt.Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
