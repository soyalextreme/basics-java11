public class Casting {
    public static void main(String[] args) {
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs);

        // Estimacion
        int eMonthDogs = (int) monthlyDogs;
        System.out.println(eMonthDogs);
         int a = 30;
         int b = 12;

        System.out.println(a % b);
        System.out.println((double) a / b);
        double c = (double) a/b;
        char n = '1';
        int n1 = n;
        System.out.println(n1);

        // un dato de mayor capacidad no cabe en una de menor
        // pero un dato de menor capacidad si cabe en uno de menor
        short nS = (short) n;
        System.out.println(nS);

        System.out.println(c);
    }
}
