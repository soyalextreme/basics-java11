public class Challenge {

    public static void presentPerson(String name, String role, int age){
        System.out.println(name + " is my " + role + " and has " + age + " years old");

    }


    public static void main(String[] args) {
        String motherName = "Adriana";
        String fatherName = "Alejandro";
        String brotherName = "Mario";

        presentPerson(motherName, "Mother",43);
        presentPerson(fatherName, "Father", 45);
        presentPerson(brotherName, "Brother" , 19);
        casting();
    }

    public static String toString(int a){
        return "" + a;
    }

    public static void casting(){
        char c = 'z';
        // cabe por que es un dato de menor capacidad
        int c_int = c;

        // 2
        double i = 250;
        // el dato es menor entonces necesitamos ser explictos
        short iShort = (short) i;
        // el dato es mayor asi que si cabe un short dentro de un long
        long iLong = iShort;
        var x = 100;
        var floatNum = (float) x + 5000.66f;
        System.out.println(floatNum);

        // Perdiendo informacion
        int u = 737;

        byte p = (byte) (u * 100);

        System.out.println(p);

        double d = 298.638 / 25;
        long dLong = (long) d;
        // truncando y perdiendo la parte decimal
        System.out.println(dLong);

        int age = 200;
        String ageStringMethod = toString(age);
        System.out.println(ageStringMethod);
    }
}
