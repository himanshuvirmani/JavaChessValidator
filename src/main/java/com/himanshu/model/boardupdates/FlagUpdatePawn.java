package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessBoardModel;

public class FlagUpdatePawn extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;
    private ChessBoardCoord pawnCoord;
    private ChessBoardCoord backup;

    @SuppressWarnings("unused")
    private FlagUpdatePawn() {
    }

    public FlagUpdatePawn(ChessBoardCoord coord) {
        this.pawnCoord = coord;
        this.backup = null;
    }

    @Override
    public void apply(ChessBoardModel boardModel) {
        backup = boardModel.getLastPawnDMove();
        boardModel.setLastPawnDMove(pawnCoord);
    }

    @Override
    public void revert(ChessBoardModel boardModel) {
        boardModel.setLastPawnDMove(backup);
    }

    @Override
    public String toString() {
        return "FlagUpdatePawn " + (pawnCoord == null ? "null" : pawnCoord.getPgnCoordinates());
    }
}
