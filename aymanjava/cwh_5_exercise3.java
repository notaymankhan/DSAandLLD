package dsalld.aymanjava;
import java.util.*;

class Game {
    private int noOfGuesses;
    private int computerGeneratedNumber;
    private int userGuessedNumber;

    public Game() {
        noOfGuesses = 0;
        computerGeneratedNumber = (int)(Math.random() * 100);
    }

    public int getComputerGeneratedNumber() {
        return computerGeneratedNumber;
    }

    public int getUserGuessedNumber() {
        return userGuessedNumber;
    }

    public void printUserGeneratedNumber() {
        System.out.println("Your number is " + userGuessedNumber);
    }

    public void guessesIncrementor() {
        noOfGuesses++;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setUserGeneratedNumber(int n) {
        userGuessedNumber = n;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you guessed: ");
        userGuessedNumber = sc.nextInt();
    }
}

public class cwh_5_exercise3 {
    public static void main(String[] args) {
        Game g = new Game();
        g.takeUserInput();
        g.printUserGeneratedNumber();

        while (g.getUserGuessedNumber() != g.getComputerGeneratedNumber()) {
            g.guessesIncrementor();
            if (g.getUserGuessedNumber() > g.getComputerGeneratedNumber()) {
                System.out.println("Lower number please!");
            } else {
                System.out.println("Higher number please!");
            }
            g.takeUserInput();
        }

        System.out.println("Congratulations! You have guessed the number");
        System.out.println("You took " + g.getNoOfGuesses() + " guesses.");
        System.out.println("Play again?");
    }
}