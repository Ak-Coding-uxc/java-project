import java.util.Scanner;
import java.util.Random;

/*
class guessTheNumber{
    int number;
    int guessNumber;
}
*/

public class Cwh_43_exercise3_my_attempt {

    static void guessTheNumber(int randomNumber){
        Scanner b = new Scanner(System.in);// scanner class object
        // b is object that used to take input from user.

        int userGuess; // used this variable to take store input number that take by b scanner object.
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
            guessTime = guessTime + 1;// guessTime++
        }while(userGuess != randomNumber);// jabtak user number is not equal to guess number
        // jabtak dono equal nhi ho jate repeat the code
        System.out.println("User guess number in " + guessTime + " time");
    }

    public static void main(String[] args) {
        Random a = new Random();// random class object
//        Scanner b = new Scanner(System.in);// scanner class object

        int randomNumber = a.nextInt(1,101);

        // a ke ander random number aa jayega  1 se 101 se kam yani 1 - 100 ke bich ka number aa jayeaga
//        System.out.println(number);

        guessTheNumber(randomNumber);


/*
        int userGuess;

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
        }while(userGuess == randomNumber);
*/

    }
}
