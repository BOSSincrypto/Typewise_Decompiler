package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.q;
import androidx.emoji2.text.f;
import androidx.lifecycle.C0453c;
import androidx.lifecycle.C0454d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.m;
import b0.C0479a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements C0479a {

    static class a extends f.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5447a;

        class a extends f.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.h f5448a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f5449b;

            a(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f5448a = hVar;
                this.f5449b = threadPoolExecutor;
            }

            public void a(Throwable th) {
                try {
                    this.f5448a.a(th);
                } finally {
                    this.f5449b.shutdown();
                }
            }

            public void b(n nVar) {
                try {
                    this.f5448a.b(nVar);
                } finally {
                    this.f5449b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f5447a = context.getApplicationContext();
        }

        public void a(f.h hVar) {
            ThreadPoolExecutor b4 = c.b("EmojiCompatInitializer");
            b4.execute(new g(this, hVar, b4));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a4 = d.a(this.f5447a);
                if (a4 != null) {
                    a4.c(threadPoolExecutor);
                    a4.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                q.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.h()) {
                    f.b().k();
                }
            } finally {
                q.b();
            }
        }
    }

    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        f.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        final Lifecycle lifecycle = ((m) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new C0454d() {
            public void a(m mVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }

            public /* synthetic */ void b(m mVar) {
                C0453c.a(this, mVar);
            }

            public /* synthetic */ void d(m mVar) {
                C0453c.c(this, mVar);
            }

            public /* synthetic */ void onDestroy(m mVar) {
                C0453c.b(this, mVar);
            }

            public /* synthetic */ void onStart(m mVar) {
                C0453c.d(this, mVar);
            }

            public /* synthetic */ void onStop(m mVar) {
                C0453c.e(this, mVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c.d().postDelayed(new c(), 500);
    }
}
