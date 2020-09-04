import java.nio.charset.Charset;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

       boolean gameOver = false;
       boolean gameWin = false;
       char still = 's';
       int level = 0;
       do{
           System.out.println("You're Playing");
            still = requestGame();

            // playing
            if(still != 's'){
                gameOver = true;
            }else{
                level ++;
            }
            // winning
            if(level == 5){
                gameWin = true;
            }

            // printing response
           if(gameOver){
               System.out.println("GAME OVER");
           }else if(gameWin){
               System.out.println("WINNER");
           }
       }while (!gameOver && !gameWin);
    }


    /**
     * Manage the input of the game with a scanner
     * @return Char that represents that input
     * @exception StringIndexOutOfBoundsException if the string input is empty
     * @author Alejandro AS
     * */
    public static char requestGame(){
        Scanner sc = new Scanner(System.in);
        try{
            return (sc.nextLine().charAt(0));
        }catch (StringIndexOutOfBoundsException e){
            //  manage the empty string problem
            return  ' ';
        }
    }
}
