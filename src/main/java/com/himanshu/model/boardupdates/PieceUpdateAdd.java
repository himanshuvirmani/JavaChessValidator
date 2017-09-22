package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessBoardModel;
import com.himanshu.model.ChessPiece;

public class PieceUpdateAdd extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;
    private ChessBoardCoord coordinates;
    private ChessPiece piece;

    @SuppressWarnings("unused")
    private PieceUpdateAdd() {
    }

    public PieceUpdateAdd(ChessBoardCoord coordinates, ChessPiece piece) {
        assert coordinates != null;
        assert piece != null;
        this.coordinates = coordinates;
        this.piece = piece;
    }

    public ChessBoardCoord getCoordinates() {
        return coordinates;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    @Override
    public void apply(ChessBoardModel boardModel) {
        assert boardModel.getPiece(coordinates) == null;
        boardModel.setPiece(coordinates, piece);
    }

    @Override
    public void revert(ChessBoardModel boardModel) {
        assert boardModel.getPiece(coordinates) == piece;
        boardModel.setPiece(coordinates, null);
    }

    @Override
    public String toString() {
        return "PieceUpdateAdd " + piece + " at " + coordinates;
    }
}
