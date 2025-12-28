package com.ibm.icu.text;

public enum DisplayContext {
    STANDARD_NAMES(r1, 0),
    DIALECT_NAMES(r1, 1),
    CAPITALIZATION_NONE(r4, 0),
    CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE(r4, 1),
    CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE(r4, 2),
    CAPITALIZATION_FOR_UI_LIST_OR_MENU(r4, 3),
    CAPITALIZATION_FOR_STANDALONE(r4, 4),
    LENGTH_FULL(r14, 0),
    LENGTH_SHORT(r14, 1),
    SUBSTITUTE(r14, 0),
    NO_SUBSTITUTE(r14, 1);
    
    private final Type type;
    private final int value;

    public enum Type {
        DIALECT_HANDLING,
        CAPITALIZATION,
        DISPLAY_LENGTH,
        SUBSTITUTE_HANDLING
    }

    private DisplayContext(Type type2, int i4) {
        this.type = type2;
        this.value = i4;
    }

    public Type type() {
        return this.type;
    }

    public int value() {
        return this.value;
    }
}
