import org.junit.Test;

import static org.junit.Assert.*;

public class PuntoTest {
    @Test
    public void hallarDistancia(){
        Punto p1 = new Punto(-1, 0);
        Punto p2 = new Punto(1, 0);
        double d = p1.hallarDistanciaA(p2);
        assertEquals(2, d, 0);
    }
    public void DeterminarPunto(){
        Circulo c=new Circulo(7, new Punto(1,1));
        Punto p= new Punto(7,1);
        int d =p.DeterminarPunto(c,p);
        assertEquals(1, d,0);
    }
}