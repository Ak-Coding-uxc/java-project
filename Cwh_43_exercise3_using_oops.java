import java.util.Random;
import java.util.Scanner;

class guessTheNumber{

    int userGuessNumber;
    int randomNumber;
    int noOfGuesses;

    public guessTheNumber(){// constructors automatic call when creating object
        Random n = new Random();
      randomNumber =  n.nextInt(1,101);
    }

    public void isNumberCorrect(){
        Scanner b = new Scanner(System.in);// used to take input from user
        int n = 0;
        do{
            System.out.print("Enter your Number:- ");
            userGuessNumber = b.nextInt();
            if(userGuessNumber == randomNumber){
                System.out.println("Guess Number is Correct");
            }
            else if(userGuessNumber > randomNumber) {
                System.out.println(" Guess Number is Greater ");
            }
            else{
                System.out.println("Guess Number is Smaller");
            }
            n++;
        }while(userGuessNumber != randomNumber);
//        System.out.println("User guess number in " + noOfGuesses + " time");
        setNumberOfGuesses(n);
    }

    public void setNumberOfGuesses(int n){
        noOfGuesses = n;
    }

    public int getNumberOfGuesses(){
        return noOfGuesses;
    }
}

public class Cwh_43_exercise3_using_oops {
    public static void main(String[] args) {
        guessTheNumber num = new guessTheNumber();
        num.isNumberCorrect();
        System.out.println("The number of guesses are " + num.getNumberOfGuesses());
    }
}
/*
num object have 3 attributes
num.userGuessNumber;
num.randomNumber;
num.noOfGuesses;
if randomNumber == userGuessNumber then loop is stop and no of guesses are print.
 */
