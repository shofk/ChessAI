package chessAgents;

import gamesystem.BoardState;

public interface Player {
    public void setup(BoardState startState, int turn);
    public BoardState nextMove(BoardState currentState);
}
