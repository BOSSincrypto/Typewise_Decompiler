package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.o;

abstract class M {
    public static Set a(Set set) {
        o.e(set, "builder");
        return ((SetBuilder) set).build();
    }

    public static Set b() {
        return new SetBuilder();
    }

    public static Set c(int i4) {
        return new SetBuilder(i4);
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        o.d(singleton, "singleton(...)");
        return singleton;
    }
}
