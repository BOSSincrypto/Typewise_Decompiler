package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import D0.m0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import v2.C0925a;

public abstract class e implements Iterable, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8754a;

    /* renamed from: b  reason: collision with root package name */
    private int f8755b;

    public e(String str) {
        o.e(str, "path");
        this.f8754a = str;
    }

    public abstract m0 b(String str);

    public abstract Object c(c cVar);

    public abstract List d();

    public final void e(String str, m0 m0Var) {
        o.e(str, "sentence");
        o.e(m0Var, "description");
        g(str);
        h(str, m0Var);
    }

    public final int f() {
        return this.f8755b;
    }

    public final void g(String str) {
        o.e(str, "sent");
        if (str.length() > this.f8755b) {
            this.f8755b = str.length();
        }
    }

    public abstract void h(String str, m0 m0Var);

    /* access modifiers changed from: protected */
    public final String i() {
        return this.f8754a;
    }

    public Iterator iterator() {
        return C0718m.J0(j(), d()).iterator();
    }

    public abstract List j();

    public abstract Map k();
}
