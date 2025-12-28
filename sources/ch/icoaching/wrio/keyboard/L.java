package ch.icoaching.wrio.keyboard;

import kotlin.jvm.internal.o;

public abstract class L {
    public static final KeyboardLayoutType a(String str) {
        o.e(str, "<this>");
        KeyboardLayoutType keyboardLayoutType = KeyboardLayoutType.RECTANGLE;
        if (o.a(str, keyboardLayoutType.getValue())) {
            return keyboardLayoutType;
        }
        KeyboardLayoutType keyboardLayoutType2 = KeyboardLayoutType.HEXAGON;
        if (o.a(str, keyboardLayoutType2.getValue())) {
            return keyboardLayoutType2;
        }
        KeyboardLayoutType keyboardLayoutType3 = KeyboardLayoutType.HEXAGON_LEGACY;
        if (o.a(str, keyboardLayoutType3.getValue())) {
            return keyboardLayoutType3;
        }
        return keyboardLayoutType2;
    }
}
