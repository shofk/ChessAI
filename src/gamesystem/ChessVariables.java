package gamesystem;

import java.util.*;

public class ChessVariables {
    public static HashMap<Character, Integer> PIECE_INT = new HashMap<Character, Integer>() {
        {
            put('p', 2);
            put('P', 3);
            put('r', 4);
            put('R', 5);
            put('n', 6);
            put('N', 7);
            put('b', 8);
            put('B', 9);
            put('q', 10);
            put('Q', 11);
            put('k', 12);
            put('K', 13);
            put('-', 0);
        }
    };
    
    public static HashMap<Integer, Character> INT_PIECE = new HashMap<Integer, Character>() {
        {
            put(2, 'p');
            put(3, 'P');
            put(4, 'r');
            put(5, 'R');
            put(6, 'n');
            put(7, 'N');
            put(8, 'b');
            put(9, 'B');
            put(10, 'q');
            put(11, 'Q');
            put(12, 'k');
            put(13, 'K');
            put(0, '-');
        }
    };
    
    public static final int WHITE = 1;
    public static final int BLACK = 0;
}
