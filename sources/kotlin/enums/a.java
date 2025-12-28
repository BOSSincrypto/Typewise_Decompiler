package kotlin.enums;

import kotlin.jvm.internal.o;
import o2.C0840a;

public abstract class a {
    public static final C0840a a(Enum[] enumArr) {
        o.e(enumArr, "entries");
        return new EnumEntriesList(enumArr);
    }
}
