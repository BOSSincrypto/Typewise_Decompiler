package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f7341a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f7342b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7343c;

    public /* synthetic */ p(r rVar, ArrayList arrayList, String str) {
        this.f7341a = rVar;
        this.f7342b = arrayList;
        this.f7343c = str;
    }

    public final Object call() {
        return this.f7341a.m(this.f7342b, this.f7343c);
    }
}
