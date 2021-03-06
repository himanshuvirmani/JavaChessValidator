package com.himanshu.model;

public enum ChessSide {

    WHITE("w", "white"), BLACK("b", "black");
    private final String shortName;
    private final String fullName;

    ChessSide(String shortName, String fullName) {
        this.shortName = shortName;
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public ChessSide opposite() {
        return this == WHITE ? BLACK : WHITE;
    }

    public static ChessSide valueOfShortName(String name) {
        ChessSide result = null;

        for (ChessSide side : values()) {
            if (side.getShortName().equals(name)) {
                result = side;
                break;
            }
        }

        return result;
    }
}
