import java.util.*;
class Guesser{
    int randomNo;
    public int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println(":: The number guessed by Guesser ::");
        randomNo = scan.nextInt();
        return randomNo;
    }
}
class Player{
    int playerChoice;
    public int guessNum(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Player kindly guess the number :");
        playerChoice =scan.nextInt();
        return playerChoice;
    }
}
class Umpire{
    int guessNum;
    int playerChoice1;
    int playerChoice2;
    int playerChoice3;
    void NumFromGuesser(){
        Guesser guess= new Guesser();
        guessNum=guess.guessNum();
    }
    void NumFromPlayer(){
        Player p1= new Player();
        Player p2= new Player();
        Player p3= new Player();
        playerChoice1=p1.guessNum();
        playerChoice2=p2.guessNum();
        playerChoice3=p3.guessNum();

    }
    void Compare(){
        if(guessNum==playerChoice1) {
            if (guessNum == playerChoice2 && guessNum == playerChoice3) {
                System.out.println("::All player guessed the same number so all players are winner or match tied::");
            } else if (guessNum == playerChoice2) {
                System.out.println("---::Player 1st and 2nd guessed right so, winner is both player one and two ::---");
            } else if (guessNum == playerChoice3) {
                System.out.println("---::Player 1st and 3rd  guessed right number so winner is player both player 1 and 3::---");
            } else {
                System.out.println("Only player 1st guessed right, So winner is :: Player-1::");
            }
        }
        else if(guessNum==playerChoice2){
            if(guessNum==playerChoice3){
                System.out.println("::Player 2nd and 3rd guessed right so winner is 2 and 3::");
            }else{
                System.out.println("Only player 2nd guessed right so winner is Player 2 ");
            }
        }
        else if(guessNum==playerChoice3){
            System.out.println("::Only player 3rd guessed right number so, winner is player 3::");
        }


    else {
        System.out.println(":: End of Game ! no player guessed right number ::");
         }
    }
    }

public class guesserGame {
    public static void main(String[] args) {
        System.out.println("---:: Welcome to Guesser Game ::---");
        Umpire u= new Umpire();
        u.NumFromGuesser();
        u.NumFromPlayer();
        u.Compare();
        System.out.println("End of Game");
    }

}
