import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a word for scrabble calculation (Note: Symbols and spaces cost 0 points)");
        String userInput = input.nextLine();

        Scrabble newWord = new Scrabble(userInput);
        newWord.calcScrabbleWord();
        newWord.printScore();

    }
}
