package gamesystem;

import chessAgents.*;

public class Master extends ChessVariables {
    public static Player[] players = new Player[] {new ChessAgentA(), new ChessAgentA()};
    
    public static void main(String[] args) {
        boolean gameSet = false;
        BoardState state = new BoardState(new int[] {4,6,8,12,10,8,6,4,
                                                     2,2,2,2,2,2,2,2,
                                                     0,0,0,0,0,0,0,0,
                                                     0,0,0,0,0,0,0,0,
                                                     0,0,0,0,0,0,0,0,
                                                     0,0,0,0,0,0,0,0,
                                                     3,3,3,3,3,3,3,3,
                                                     5,7,9,13,11,9,7,5}, WHITE);
        players[BLACK].setup(state, BLACK);
        players[WHITE].setup(state, WHITE);
        
        while (!gameSet) {
            long start = System.nanoTime();
            state = players[state.getTurn()].nextMove(state);
            System.out.println(state);
            System.out.println("Time took for player " + (1 + state.getTurn()) + ": " + (System.nanoTime() - start));
            gameSet = state.isOver();
        }
        
        System.out.println("Winner: " + ((state.getTurn() == 1) ? "Player 2" : "Player 1"));
        System.out.println(state);
    }

}
