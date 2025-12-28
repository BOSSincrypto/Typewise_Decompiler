package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.F;

class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f12232c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f12233a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f12234b = new Handler(Looper.getMainLooper(), new C0172a());

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    class C0172a implements Handler.Callback {
        C0172a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            F.a(message.obj);
            aVar.c((c) null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i4) {
        throw null;
    }

    static a b() {
        if (f12232c == null) {
            f12232c = new a();
        }
        return f12232c;
    }

    private boolean d(b bVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f12233a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f12233a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f12233a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
