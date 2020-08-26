import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {
    @Test
    public void hallarArea(){
        Circulo c = new Circulo(1, new Punto(0, 0));
        double area = c.hallarArea();
        assertEquals(Math.PI, area, 0.01);

    }

}