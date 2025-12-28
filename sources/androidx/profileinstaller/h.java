package androidx.profileinstaller;

import androidx.profileinstaller.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.c f6128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6129b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6130c;

    public /* synthetic */ h(i.c cVar, int i4, Object obj) {
        this.f6128a = cVar;
        this.f6129b = i4;
        this.f6130c = obj;
    }

    public final void run() {
        this.f6128a.b(this.f6129b, this.f6130c);
    }
}
