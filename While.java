public class While {
    static boolean isTurnOnLight = false;
    static int amountMessageSent = 0;

    public static void main(String[] args) {
        handleLight();

        while(isTurnOnLight){
            printSOS();
            handleHelp();
        }

    }

    public static void printSOS(){
        /**
         *Prints SOS in Morse Code
         * And adds to the global var of amount of message sent
         * @author Alejandro AS
         */
        System.out.println("... ___ ...");
        amountMessageSent ++;
    }

    public static void handleHelp(){
       /**
        * Handles the global var amountMessageSent
        * Prints message when helps arrives and close the cicle
        * @author Alejandro AS
        */
        if(amountMessageSent == 10){
           System.out.println("LA AYUDA LLEGO!!! WIII");
           handleLight();
       }
    }

    public static void handleLight(){
        /**
         * Change the value of the Light of SOS
         * @author Alejandro AS
         */
        isTurnOnLight=!isTurnOnLight;
    }

}
