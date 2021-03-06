package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardModel;
import com.himanshu.model.ChessBoardPath;

public class PieceUpdateMove extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;
    private ChessBoardPath path;

    @SuppressWarnings("unused")
    private PieceUpdateMove() {
    }

    public PieceUpdateMove(ChessBoardPath path) {
        assert path != null;
        this.path = path;
    }

    public ChessBoardPath getPath() {
        return path;
    }

    @Override
    public void apply(ChessBoardModel boardModel) {
        assert boardModel.getPiece(path.getSource()) != null;
        assert boardModel.getPiece(path.getDestination()) == null;
        boardModel.setPiece(path.getDestination(), boardModel.getPiece(path.getSource()));
        boardModel.setPiece(path.getSource(), null);
    }

    @Override
    public void revert(ChessBoardModel boardModel) {
        assert boardModel.getPiece(path.getSource()) == null;
        assert boardModel.getPiece(path.getDestination()) != null;
        boardModel.setPiece(path.getSource(), boardModel.getPiece(path.getDestination()));
        boardModel.setPiece(path.getDestination(), null);
    }

    @Override
    public String toString() {
        return "PieceUpdateMove with path " + path;
    }
}
