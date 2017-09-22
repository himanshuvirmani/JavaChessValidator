package com.himanshu.rules;


import com.himanshu.exceptions.IllegalMoveException;
import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessMovePath;
import com.himanshu.model.boardupdates.ChessBoardUpdate;
import com.himanshu.util.ChessPosition;

import java.util.List;
import java.util.Set;

public interface ChessRules {
    Set<ChessBoardCoord> getReachableDestinations(ChessPosition position, ChessBoardCoord pieceCoords,
                                                  boolean excludeCheckSituations);

    Set<ChessBoardCoord> getAttackingPieces(ChessPosition position, ChessBoardCoord square);

    ChessPosition getInitialPosition();

    Set<ChessMovePath> getAvailableMoves(ChessPosition position);

    List<ChessBoardUpdate> getUpdatesForMove(ChessPosition position, ChessMovePath path) throws IllegalMoveException;
}
