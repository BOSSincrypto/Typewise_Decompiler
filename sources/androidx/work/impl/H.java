package androidx.work.impl;

import androidx.work.u;
import u2.C0906a;

public final /* synthetic */ class H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F f7178a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7179b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f7180c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0906a f7181d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u f7182e;

    public /* synthetic */ H(F f4, String str, o oVar, C0906a aVar, u uVar) {
        this.f7178a = f4;
        this.f7179b = str;
        this.f7180c = oVar;
        this.f7181d = aVar;
        this.f7182e = uVar;
    }

    public final void run() {
        WorkerUpdater.d(this.f7178a, this.f7179b, this.f7180c, this.f7181d, this.f7182e);
    }
}
