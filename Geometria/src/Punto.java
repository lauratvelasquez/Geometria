// TDD(test driven development)

public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double hallarDistanciaA(Punto otro){
        double distancia;
        distancia = Math.sqrt(Math.pow(this.x - otro.x, 2 ) + Math.pow(this.y - otro.y, 2 ));
        return distancia;
    }


}
