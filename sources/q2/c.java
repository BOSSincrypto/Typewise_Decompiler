package Q2;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1345b;

    public /* synthetic */ c(String str, boolean z3) {
        this.f1344a = str;
        this.f1345b = z3;
    }

    public final Thread newThread(Runnable runnable) {
        return d.N(this.f1344a, this.f1345b, runnable);
    }
}
