package com.himanshu.model.boardupdates;


import com.himanshu.model.ChessBoardModel;

public interface ChessBoardUpdate {

    void apply(ChessBoardModel boardModel);

    void revert(ChessBoardModel boardModel);
}
