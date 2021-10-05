package pieces;

import utils.Color;
import utils.Location;

import java.util.List;

public class Bishop extends Piece {

    public Bishop(Color pieceColor, Location location) {
        super(pieceColor, location,3);
    }

    @Override
    public double calculateThreats(Piece p, List<Piece> boardList, Piece[][] board) {
        return 0;
    }
}