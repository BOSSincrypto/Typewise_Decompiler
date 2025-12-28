package androidx.work.impl;

import androidx.work.m;
import kotlin.jvm.internal.o;

public abstract class B {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f7160a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7161b = {"-journal", "-shm", "-wal"};

    static {
        String i4 = m.i("WrkDbPathHelper");
        o.d(i4, "tagWithPrefix(\"WrkDbPathHelper\")");
        f7160a = i4;
    }
}
