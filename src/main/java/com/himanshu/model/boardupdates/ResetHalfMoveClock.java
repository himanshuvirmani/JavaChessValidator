package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardModel;

public class ResetHalfMoveClock extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;
    private int halfMoveClockBackup;


    public void apply(ChessBoardModel boardModel) {
        halfMoveClockBackup = boardModel.getHalfMoveClock();
        boardModel.setHalfMoveClock(0);
    }

    public void revert(ChessBoardModel boardModel) {
        boardModel.setHalfMoveClock(halfMoveClockBackup);
    }

    @Override
    public String toString() {
        return "Reset half move clock";
    }
}
