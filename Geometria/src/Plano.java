public class Plano {
    public static void main(String [] args){
        System.out.println("programa plano cartesiano");
        Punto p1 = new Punto(-1, 0);
        Punto p2 = new Punto(1, 0);
        double d = p1.hallarDistanciaA(p2);
        System.out.println(d);

    }
}
