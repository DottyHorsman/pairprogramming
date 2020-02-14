import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest
{
    /*
    (1 point)-A, E, I, O, U, L, N, S, T, R
    (2 points)-D, G
    (3 points)-B, C, M, P
    (4 points)-F, H, V, W, Y
    (5 points)-K
    (8 points)- J, X
    (10 points)-Q, Z

    Impedimenta = 1 + 3 + 3 + 1 + 2 + 1 + 3 + 1 + 1 + 1 + 1 = 18
    The = 1 + 4 + 1 = 6
    A = 1
    Sugar-Free = 1 + 1 + 2 + 1 + 1 + 0 + 4 + 1 + 1 + 1 = 13
    */

    @Test
    void calcScrabbleWordLong()
    {
        Scrabble longWord = new Scrabble("Impedimenta");
        assertEquals(18, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordShort()
    {
        Scrabble longWord = new Scrabble("The");
        assertEquals(6, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordSingleLetter()
    {
        Scrabble longWord = new Scrabble("A");
        assertEquals(1, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordHyphen() //idk why this would allowed in scrabble but whatever
    {
        Scrabble longWord = new Scrabble("Sugar-free");
        assertEquals(13, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordSpace() //idk why this would allowed in scrabble but whatever
    {
        Scrabble longWord = new Scrabble("Sugar free");
        assertEquals(13, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordUpperCase()
    {
        Scrabble longWord = new Scrabble("IMPEDIMENTA");
        assertEquals(18, longWord.calcScrabbleWord());
    }

    @Test
    void calcScrabbleWordLowerCase()
    {
        Scrabble longWord = new Scrabble("impedimenta");
        assertEquals(18, longWord.calcScrabbleWord());
    }
}