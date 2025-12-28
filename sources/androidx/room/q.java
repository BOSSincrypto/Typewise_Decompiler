package androidx.room;

import androidx.room.p;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f6859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String[] f6860b;

    public /* synthetic */ q(p pVar, String[] strArr) {
        this.f6859a = pVar;
        this.f6860b = strArr;
    }

    public final void run() {
        p.b.x(this.f6859a, this.f6860b);
    }
}
