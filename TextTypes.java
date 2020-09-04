import java.util.NoSuchElementException;

public class TextTypes {
    public static void main(String[] args) {
        // 2 bytes
        char firstLetter = 'a';
        // boolean
        // 2 bytes
        boolean isOnGamplay = false;

        // declaracion inferida
        var posible_var = "Alejandro Andrade";
        // integer
        var salary = 1000;
        // float
        var pension = salary * 0.03f;
        var totalSalary = salary - pension;
        System.out.println(pension);
        System.out.println(totalSalary);
        var myName = "Alejandro Andrade";
        System.out.println(myName + " Dice Hola y su sueldo es de " + totalSalary);

        var num = 12;
        System.out.println(num % 2);
        System.out.println(num++);
        System.out.println(++num);



    }
}
