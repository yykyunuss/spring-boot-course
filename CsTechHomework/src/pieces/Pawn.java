package pieces;

import utils.Color;
import utils.Location;
import utils.NeighbourSquares;

import java.util.List;

public class Pawn extends Piece {
    NeighbourSquares neighbourSquares;
    public Pawn(Color pieceColor, Location location) {
        super(pieceColor, location, 1);
        neighbourSquares = new NeighbourSquares();
    }

    @Override
    public double calculateThreats(Piece p, List<Piece> boardList, Piece[][] board) {
        //pieces.Pawn pawn = (pieces.Pawn)p;
        /*System.out.println("pawn method");
        double threatPoint=0;
        for(Piece pieceElement: boardList){
            if(p.getColor()==Color.WHITE){
                if(neighbourSquares.northWest(p).equals(pieceElement.getLocation())
                || neighbourSquares.northEast(p).equals(pieceElement.getLocation())){
                    threatPoint+= pieceElement.getPoint()/2;
                }
            }
            else if(p.getColor()==Color.BLACK){
                if(neighbourSquares.southWest(p).equals(pieceElement.getLocation())
                        || neighbourSquares.southEast(p).equals(pieceElement.getLocation())){
                    threatPoint+=pieceElement.getPoint()/2;
                }
            }
        }
        //if(p.getLocation().getX()-1)
        return threatPoint;*/
        return 0;
    }
}
