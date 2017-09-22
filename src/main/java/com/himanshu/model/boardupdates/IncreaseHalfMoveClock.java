package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardModel;

public class IncreaseHalfMoveClock extends AbstractBoardUpdate {

    private static final long serialVersionUID = 1;


    public void apply(ChessBoardModel boardModel) {
        boardModel.setHalfMoveClock(boardModel.getHalfMoveClock() + 1);
    }

    public void revert(ChessBoardModel boardModel) {
        boardModel.setHalfMoveClock(boardModel.getHalfMoveClock() - 1);
    }

    @Override
    public String toString() {
        return "Increase half move clock";
    }
}
