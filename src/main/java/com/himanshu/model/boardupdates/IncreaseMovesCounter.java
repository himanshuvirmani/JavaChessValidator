package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardModel;

public class IncreaseMovesCounter extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;


    public void apply(ChessBoardModel boardModel) {
        boardModel.setMoveNumber(boardModel.getMoveNumber() + 1);
    }

    public void revert(ChessBoardModel boardModel) {
        boardModel.setMoveNumber(boardModel.getMoveNumber() - 1);
    }

    @Override
    public String toString() {
        return "Increase move counter";
    }
}
