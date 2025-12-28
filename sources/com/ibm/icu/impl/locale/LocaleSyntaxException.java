package com.ibm.icu.impl.locale;

public class LocaleSyntaxException extends Exception {
    private static final long serialVersionUID = 1;
    private int _index;

    public LocaleSyntaxException(String str) {
        this(str, 0);
    }

    public int getErrorIndex() {
        return this._index;
    }

    public LocaleSyntaxException(String str, int i4) {
        super(str);
        this._index = i4;
    }
}
