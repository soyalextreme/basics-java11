public class IfStatement {



    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSend = 0;

        if (isBluetoothEnable){
            System.out.println("Sending the file");
            fileSend++;
        }else if (fileSend == 0){
            System.out.println("No has mandado ningun archivo primero tienes que encender el BT");
        }else {
            System.out.println("The bluetooth is not enable. Sorry you now this problem before");
        }
        var age = 3;

        switch (age){
            case 3:
            case 10:
                System.out.println("Eres un nino aun");
                break;
            case 18:
                System.out.println("Eres un adulto en Mexico");
                break;
            case 21:
                System.out.println("Eres un adulto en Estados unidos");
                break;
            default:
                System.out.println("Tu edad es aburrida");
                break;

        }
    }




}
