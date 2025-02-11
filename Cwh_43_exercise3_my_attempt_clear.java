import java.util.Scanner;
import java.util.Random;

public class Cwh_43_exercise3_my_attempt_clear  {

    static void guessTheNumber(int randomNumber){
        Scanner b = new Scanner(System.in);

        int userGuess;
        int guessTime = 0;
        do{
            System.out.print("Enter your Number:- ");
            userGuess = b.nextInt();
            if(userGuess == randomNumber){
                System.out.println("Guess Number is Correct");
            }
            else if(userGuess > randomNumber) {
                System.out.println(" Guess Number is Greater ");
            }
            else{
                System.out.println("Guess Number is Smaller");
            }
            guessTime++;
        }while(userGuess != randomNumber);
        System.out.println("User guess number in " + guessTime + " time");
    }

    public static void main(String[] args) {
        Random a = new Random();

        int randomNumber = a.nextInt(1,101);

        guessTheNumber(randomNumber);

    }
}

