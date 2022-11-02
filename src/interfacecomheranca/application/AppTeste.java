package interfacecomheranca.application;

import interfacecomheranca.services.AbstractShape;
import interfacecomheranca.services.Circle;
import interfacecomheranca.services.Rectangle;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class AppTeste {

    @Test
    public void teste_1(){
        AbstractShape s1 = new Circle(Color.BLACK,15.0);
        AbstractShape s2 = new Rectangle(Color.RED,5.0,8.0);

        String resultado = String.valueOf(s1.area());
        String expectativa = """
                706.8583470577034""";

        Assert.assertEquals(expectativa,resultado);
    }
    @Test
    public void teste_2(){
        AbstractShape s1 = new Circle(Color.BLACK,15.0);
        AbstractShape s2 = new Rectangle(Color.RED,5.0,8.0);

        String resultado = String.valueOf(s2.area());
        String expectativa = """
                40.0""";

        Assert.assertEquals(expectativa,resultado);
    }
}
