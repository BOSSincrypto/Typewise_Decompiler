package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import j.C0682a;
import j.C0683b;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3740a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C0683b f3741b;

    /* renamed from: c  reason: collision with root package name */
    private final C0682a f3742c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f3743d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f3744e;

    f(C0683b bVar, C0682a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f3741b = bVar;
        this.f3742c = aVar;
        this.f3743d = componentName;
        this.f3744e = pendingIntent;
    }

    /* access modifiers changed from: package-private */
    public IBinder a() {
        return this.f3742c.asBinder();
    }

    /* access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f3743d;
    }

    /* access modifiers changed from: package-private */
    public PendingIntent c() {
        return this.f3744e;
    }
}
