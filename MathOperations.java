import java.util.SortedMap;

public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // Methodo ceil redondeo hacia arriba
        System.out.println(Math.ceil(x));
        // Methodo ceil redondeo hacia abajo
        System.out.println(Math.floor(x));
        // Metodo de potencia
        // 1 numero 2 potencia
        System.out.println(Math.pow(x, 2));
        // el numero maximo
        System.out.println(Math.max(x, y));
        // Raiz cuadrada
        System.out.println(Math.sqrt(y));
        // Area de una esfera
        System.out.println(4 * (Math.PI * Math.pow(y, 2)));
    }
}
