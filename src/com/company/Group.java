package com.company;

public enum Group {
    FAMILY ("Rodina"), WORK ("Práce"), OTHER ("Ostatní");

    private final String description;

    Group(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


