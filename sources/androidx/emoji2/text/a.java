package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5451a;

    public /* synthetic */ a(String str) {
        this.f5451a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return c.c(this.f5451a, runnable);
    }
}
