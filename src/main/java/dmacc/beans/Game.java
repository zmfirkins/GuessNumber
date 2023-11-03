package dmacc.beans;
import java.util.Random;

public class Game {
    private int secretNumber;
    private int guess;
    private String result;

    public Game() {
        super();
        this.secretNumber = generateSecretNumber();
        this.result = "";
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setGuess(int guess) {
        this.guess = guess;
        determineResult();
    }

    public int getGuess() {
        return guess;
    }

    public String getResult() {
        return result;
    }

    private int generateSecretNumber() {
        return new Random().nextInt(10) + 1;
    }

    private void determineResult() {
        if (guess == secretNumber) {
            result = "Congratulations! You guessed the correct number.";
        } else if (guess < secretNumber) {
            result = "Try a higher number.";
        } else {
            result = "Try a lower number.";
        }
    }
}