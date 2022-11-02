package interfacecomheranca.services;

import java.awt.*;

public abstract class AbstractShape implements Shape {

    private java.awt.Color Color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        Color = color;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }
}
