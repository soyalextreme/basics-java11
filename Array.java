import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int [] numbers = {1, 3, 4, 6};
        int [] n = new int[4];
        List<String> days = new ArrayList<>();
        days.add("Alejandro");
        days.add("Monday");
        days.add("Tuesday");
        System.out.println(days.size());
        String[][] cities = {{"Country", "City"}, {"Mexico", "Mexico City"}};
        String[][][] clock = new String[24][60][60];
        for (int i = 0; i < days.size() ; i++) {
            System.out.println(days.get(i));
        }
        for (String day: days) {
            System.out.println(day);
        }

        byte hola = 1;
        byte i = 'l';
        char x = 33;
        byte l = 22;
        System.out.println(x + l );

        for (String[] pair: cities) {
            for (String item: pair) {

                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
