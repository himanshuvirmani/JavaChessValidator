package com.himanshu.controller;

import com.himanshu.model.ChessMovePath;
import com.himanshu.rules.ChessHelper;
import com.himanshu.rules.ChessRules;
import com.himanshu.rules.ChessRulesImpl;
import com.himanshu.util.*;
import org.junit.Before;
import org.junit.Test;

public class TestGameController {

    private static final String BOARD_START = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";

    private FenChessPosition fenChessPosition;

    @Before
    public void setUpBoard() {
        fenChessPosition = new FenChessPosition(BOARD_START);
    }

    @Test
    public void testMove() {
//        String[] history = {"f3", "e5", "g4", "Qh4"};
        String[] history = {"e4","c5"};
        ChessRules chessRules = new ChessRulesImpl();
        ChessPosition position = chessRules.getInitialPosition();
        AnMoveInterpreter interpreter = new AnMoveInterpreterImpl(chessRules);
        for (String pgnMove : history) {
            ChessMovePath path = interpreter.convertAnToMove(position, pgnMove);
            position = ChessHelper.applyMoveAndSwitch(chessRules, position, path);
        }
        BoardInterpreter boardInterpreter = new FenInterpreterImpl();
        System.out.println(boardInterpreter.convertPositionToString(position));

    }

}
