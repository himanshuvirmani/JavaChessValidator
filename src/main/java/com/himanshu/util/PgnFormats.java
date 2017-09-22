package com.himanshu.util;

/**
 * Formatting expressions related to PGN notation.
 *
 * @author Yannick Kirschhoffer <alcibiade@alcibiade.org>
 */
public class PgnFormats {

    public static final String PATTERN_PGN = "([RNBQKP]?)([a-h]?)([1-8]?)([x-]?)([a-h][1-8])\\+?=?([RNBQ])?([\\+#])?";
    public static final String PGN_CASTLE_K = "O-O";
    public static final String PGN_CASTLE_Q = "O-O-O";
}
