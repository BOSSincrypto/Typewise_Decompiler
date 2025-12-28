package ch.icoaching.typewise;

import android.content.Context;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import ch.icoaching.typewise.word_lists.b;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import u2.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7855a;

    /* renamed from: b  reason: collision with root package name */
    private final D f7856b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f7857c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f7858d;

    public a(Context context, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        o.e(context, "applicationContext");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "ioDispatcher");
        this.f7855a = context;
        this.f7856b = d4;
        this.f7857c = coroutineDispatcher;
        this.f7858d = coroutineDispatcher2;
    }

    public final Context a() {
        return this.f7855a;
    }

    public abstract ConfigHolder b();

    public final D c() {
        return this.f7856b;
    }

    public final CoroutineDispatcher d() {
        return this.f7858d;
    }

    public final CoroutineDispatcher e() {
        return this.f7857c;
    }

    public abstract Object f(List list, b bVar, b bVar2, l lVar, c cVar);
}
