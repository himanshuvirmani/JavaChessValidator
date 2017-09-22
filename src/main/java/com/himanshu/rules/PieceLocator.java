package com.himanshu.rules;


import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessPiece;
import com.himanshu.model.ChessSide;
import com.himanshu.util.ChessPosition;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Optimized piece location helper.
 */
public class PieceLocator {
    private static final ChessBoardCoord[] BOARD_COORDINATES;

    static {
        BOARD_COORDINATES = ChessBoardCoord.getAllBoardCoords().toArray(new ChessBoardCoord[64]);
    }

    private ChessPosition position;

    public PieceLocator(ChessPosition position) {
        this.position = position;
    }

    /**
     * Locate a piece on the board. Since we often have several similar pieces
     * on the board, the result is a set of coordinates.
     *
     * @param piece a piece that should be located on the board
     * @return the position of every piece occurrence. May be empty if the
     * piece is no longer present on the board.
     */
    public Collection<ChessBoardCoord> locatePiece(ChessPiece piece) {
        Collection<ChessBoardCoord> coords = new ArrayList<>(4);

        for (ChessBoardCoord coord : BOARD_COORDINATES) {
            ChessPiece localPiece = position.getPiece(coord);
            if (piece.equals(localPiece)) {
                coords.add(coord);
            }
        }

        return coords;
    }

    /**
     * Locate coordinates of all pieces of a given playing side.
     *
     * @param side the side whose pieces should be located on the board
     * @return the position of every piece occurrence. Should never be empty
     * if the game position is valid.
     */
    public Collection<ChessBoardCoord> locatePieces(ChessSide side) {
        Collection<ChessBoardCoord> coords = new ArrayList<>(18);

        for (ChessBoardCoord coord : BOARD_COORDINATES) {
            ChessPiece localPiece = position.getPiece(coord);
            if (localPiece != null && localPiece.getSide() == side) {
                coords.add(coord);
            }
        }

        return coords;
    }
}
