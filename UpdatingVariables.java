public class UpdatingVariables {
    public static void main(String[] args){
        int $salary = 1000;
        // bono de 200
        $salary += 200;
        // Pagos de obligaciones
        $salary -= 50;
        System.out.println($salary);
        // 2 horas extra 30c/u
        // Comida costo de ella 45
        int $extraHourPrice = 30;
        $salary += ($extraHourPrice * 2) - 45;
        System.out.println($salary);

        // Actualizando cadenas de texto
        String $employeeName = "Alejandro Andrade";

        System.out.println($employeeName);
         $employeeName += " Soriano";
        System.out.println("Tu nombre es: " + $employeeName);
    }
}
