package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class v {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11056a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11057b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((s) message.obj).d();
            return true;
        }
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(s sVar, boolean z3) {
        try {
            if (!this.f11056a) {
                if (!z3) {
                    this.f11056a = true;
                    sVar.d();
                    this.f11056a = false;
                }
            }
            this.f11057b.obtainMessage(1, sVar).sendToTarget();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
