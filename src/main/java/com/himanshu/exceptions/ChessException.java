package com.himanshu.exceptions;

/**
 * Ancestor exception for all concrete model-related exception.
 *
 * @author Yannick Kirschhoffer <alcibiade@alcibiade.org>
 */
public abstract class ChessException extends RuntimeException {

    public ChessException(String message) {
        super(message);
    }

    public ChessException(String message, Throwable cause) {
        super(message, cause);
    }
}
