package gamesystem;

import java.awt.Point;

public class BoardState extends ChessVariables {
    private final int[] board;
    
    private final int turn;
    
    private Point[] move;
    
    public BoardState(int[] board, int turn) {
        if (board.length != 64) {
            throw new IllegalArgumentException();
        }
        this.board = board;
        this.turn = turn;
        this.move = new Point[]{new Point(-1, -1), new Point(-1, -1)};
    }
    
    public int getPiece(int row, int col) {
        return board[row * 8 + col];
    }
    
    public int getPiece(int linIdx) {
        return board[linIdx];
    }
    
    public void setMove(Point from, Point to) {
        this.move[0] = from;
        this.move[1] = to;
    }
    
    public Point[] getMove() {
        return this.move;
    }
    
    public int getTurn() {
        return this.turn;
    }
    
    public int[] getBoard() {
        return this.board.clone();
    }
    
    public boolean isOver() {
        int kingCount = 0;
        for (int loc = 0; loc < 64; loc++) {
            int piece = this.getPiece(loc);
            if (piece == 12 || piece == 13) kingCount++;
        }
        return kingCount == 2 ? false : true;
    }
    
    public String toString() {
        String boardRep = "";
        for (int row = 0; row < 8; row++) {
            String newRow = "|";
            for (int col = 0; col < 8; col++) {
                newRow += INT_PIECE.get(this.getPiece(row, col)) + "|";
            }
            boardRep += newRow + "\n";
        }
        return boardRep;
    }
}
