package androidx.work.impl;

import java.util.List;
import java.util.Set;
import l0.v;

public final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f7183a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f7184b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f7185c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f7186d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f7187e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Set f7188f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f7189g;

    public /* synthetic */ I(WorkDatabase workDatabase, v vVar, v vVar2, List list, String str, Set set, boolean z3) {
        this.f7183a = workDatabase;
        this.f7184b = vVar;
        this.f7185c = vVar2;
        this.f7186d = list;
        this.f7187e = str;
        this.f7188f = set;
        this.f7189g = z3;
    }

    public final void run() {
        WorkerUpdater.g(this.f7183a, this.f7184b, this.f7185c, this.f7186d, this.f7187e, this.f7188f, this.f7189g);
    }
}
