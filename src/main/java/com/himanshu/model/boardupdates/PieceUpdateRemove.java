package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessBoardModel;
import com.himanshu.model.ChessPiece;

public class PieceUpdateRemove extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;
    private ChessBoardCoord coordinates;
    private ChessPiece removedPiece;

    @SuppressWarnings("unused")
    private PieceUpdateRemove() {
    }

    public PieceUpdateRemove(ChessBoardCoord coordinates) {
        assert coordinates != null;
        this.coordinates = coordinates;
    }

    public ChessBoardCoord getCoordinates() {
        return coordinates;
    }

    @Override
    public void apply(ChessBoardModel boardModel) {
        removedPiece = boardModel.getPiece(coordinates);
        assert removedPiece != null;
        boardModel.setPiece(coordinates, null);
    }

    @Override
    public void revert(ChessBoardModel boardModel) {
        assert boardModel.getPiece(coordinates) == null;
        assert removedPiece != null;
        boardModel.setPiece(coordinates, removedPiece);
    }

    @Override
    public String toString() {
        return "PieceUpdateRemove at " + coordinates;
    }
}
