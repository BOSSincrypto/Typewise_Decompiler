package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import y.C0940b;

public class f {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f5455n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f5456o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile f f5457p;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f5458a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set f5459b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f5460c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f5461d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5462e;

    /* renamed from: f  reason: collision with root package name */
    final g f5463f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f5464g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f5465h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f5466i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f5467j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5468k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5469l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final d f5470m;

    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile i f5471b;

        /* renamed from: c  reason: collision with root package name */
        private volatile n f5472c;

        /* renamed from: androidx.emoji2.text.f$a$a  reason: collision with other inner class name */
        class C0090a extends h {
            C0090a() {
            }

            public void a(Throwable th) {
                a.this.f5474a.m(th);
            }

            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f5474a.f5463f.a(new C0090a());
            } catch (Throwable th) {
                this.f5474a.m(th);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i4, int i5, int i6, boolean z3) {
            return this.f5471b.h(charSequence, i4, i5, i6, z3);
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f5472c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f5474a.f5464g);
        }

        /* access modifiers changed from: package-private */
        public void d(n nVar) {
            if (nVar == null) {
                this.f5474a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f5472c = nVar;
            n nVar2 = this.f5472c;
            i iVar = new i();
            d a4 = this.f5474a.f5470m;
            f fVar = this.f5474a;
            this.f5471b = new i(nVar2, iVar, a4, fVar.f5465h, fVar.f5466i);
            this.f5474a.n();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final f f5474a;

        b(f fVar) {
            this.f5474a = fVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract CharSequence b(CharSequence charSequence, int i4, int i5, int i6, boolean z3);

        /* access modifiers changed from: package-private */
        public abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f5475a;

        /* renamed from: b  reason: collision with root package name */
        boolean f5476b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5477c;

        /* renamed from: d  reason: collision with root package name */
        int[] f5478d;

        /* renamed from: e  reason: collision with root package name */
        Set f5479e;

        /* renamed from: f  reason: collision with root package name */
        boolean f5480f;

        /* renamed from: g  reason: collision with root package name */
        int f5481g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f5482h = 0;

        /* renamed from: i  reason: collision with root package name */
        d f5483i = new e();

        protected c(g gVar) {
            androidx.core.util.g.h(gVar, "metadataLoader cannot be null.");
            this.f5475a = gVar;
        }

        /* access modifiers changed from: protected */
        public final g a() {
            return this.f5475a;
        }

        public c b(int i4) {
            this.f5482h = i4;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i4, int i5, int i6);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    private static class C0091f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List f5484a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f5485b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5486c;

        C0091f(e eVar, int i4) {
            this(Arrays.asList(new e[]{(e) androidx.core.util.g.h(eVar, "initCallback cannot be null")}), i4, (Throwable) null);
        }

        public void run() {
            int size = this.f5484a.size();
            int i4 = 0;
            if (this.f5486c != 1) {
                while (i4 < size) {
                    ((e) this.f5484a.get(i4)).a(this.f5485b);
                    i4++;
                }
                return;
            }
            while (i4 < size) {
                ((e) this.f5484a.get(i4)).b();
                i4++;
            }
        }

        C0091f(Collection collection, int i4) {
            this(collection, i4, (Throwable) null);
        }

        C0091f(Collection collection, int i4, Throwable th) {
            androidx.core.util.g.h(collection, "initCallbacks cannot be null");
            this.f5484a = new ArrayList(collection);
            this.f5486c = i4;
            this.f5485b = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    static class i {
        i() {
        }

        /* access modifiers changed from: package-private */
        public j a(h hVar) {
            return new p(hVar);
        }
    }

    private f(c cVar) {
        this.f5464g = cVar.f5476b;
        this.f5465h = cVar.f5477c;
        this.f5466i = cVar.f5478d;
        this.f5467j = cVar.f5480f;
        this.f5468k = cVar.f5481g;
        this.f5463f = cVar.f5475a;
        this.f5469l = cVar.f5482h;
        this.f5470m = cVar.f5483i;
        this.f5461d = new Handler(Looper.getMainLooper());
        C0940b bVar = new C0940b();
        this.f5459b = bVar;
        Set set = cVar.f5479e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f5479e);
        }
        this.f5462e = new a(this);
        l();
    }

    public static f b() {
        f fVar;
        boolean z3;
        synchronized (f5455n) {
            fVar = f5457p;
            if (fVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            androidx.core.util.g.i(z3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i4, int i5, boolean z3) {
        return i.c(inputConnection, editable, i4, i5, z3);
    }

    public static boolean f(Editable editable, int i4, KeyEvent keyEvent) {
        return i.d(editable, i4, keyEvent);
    }

    public static f g(c cVar) {
        f fVar = f5457p;
        if (fVar == null) {
            synchronized (f5455n) {
                try {
                    fVar = f5457p;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f5457p = fVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fVar;
    }

    public static boolean h() {
        if (f5457p != null) {
            return true;
        }
        return false;
    }

    private boolean j() {
        if (d() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private void l() {
        this.f5458a.writeLock().lock();
        try {
            if (this.f5469l == 0) {
                this.f5460c = 0;
            }
            this.f5458a.writeLock().unlock();
            if (d() == 0) {
                this.f5462e.a();
            }
        } catch (Throwable th) {
            this.f5458a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f5468k;
    }

    public int d() {
        this.f5458a.readLock().lock();
        try {
            return this.f5460c;
        } finally {
            this.f5458a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f5467j;
    }

    public void k() {
        boolean z3 = true;
        if (this.f5469l != 1) {
            z3 = false;
        }
        androidx.core.util.g.i(z3, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!j()) {
            this.f5458a.writeLock().lock();
            try {
                if (this.f5460c != 0) {
                    this.f5460c = 0;
                    this.f5458a.writeLock().unlock();
                    this.f5462e.a();
                }
            } finally {
                this.f5458a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5458a.writeLock().lock();
        try {
            this.f5460c = 2;
            arrayList.addAll(this.f5459b);
            this.f5459b.clear();
            this.f5458a.writeLock().unlock();
            this.f5461d.post(new C0091f(arrayList, this.f5460c, th));
        } catch (Throwable th2) {
            this.f5458a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f5458a.writeLock().lock();
        try {
            this.f5460c = 1;
            arrayList.addAll(this.f5459b);
            this.f5459b.clear();
            this.f5458a.writeLock().unlock();
            this.f5461d.post(new C0091f((Collection) arrayList, this.f5460c));
        } catch (Throwable th) {
            this.f5458a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        int i4;
        if (charSequence == null) {
            i4 = 0;
        } else {
            i4 = charSequence.length();
        }
        return p(charSequence, 0, i4);
    }

    public CharSequence p(CharSequence charSequence, int i4, int i5) {
        return q(charSequence, i4, i5, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i4, int i5, int i6) {
        return r(charSequence, i4, i5, i6, 0);
    }

    public CharSequence r(CharSequence charSequence, int i4, int i5, int i6, int i7) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.core.util.g.i(j(), "Not initialized yet");
        androidx.core.util.g.e(i4, "start cannot be negative");
        androidx.core.util.g.e(i5, "end cannot be negative");
        androidx.core.util.g.e(i6, "maxEmojiCount cannot be negative");
        boolean z7 = false;
        if (i4 <= i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        androidx.core.util.g.b(z3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i4 <= charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        androidx.core.util.g.b(z4, "start should be < than charSequence length");
        if (i5 <= charSequence.length()) {
            z5 = true;
        } else {
            z5 = false;
        }
        androidx.core.util.g.b(z5, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i4 == i5) {
            return charSequence;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                z7 = this.f5464g;
            }
            z6 = z7;
        } else {
            z6 = true;
        }
        return this.f5462e.b(charSequence, i4, i5, i6, z6);
    }

    public void s(e eVar) {
        androidx.core.util.g.h(eVar, "initCallback cannot be null");
        this.f5458a.writeLock().lock();
        try {
            if (this.f5460c != 1) {
                if (this.f5460c != 2) {
                    this.f5459b.add(eVar);
                }
            }
            this.f5461d.post(new C0091f(eVar, this.f5460c));
        } finally {
            this.f5458a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        androidx.core.util.g.h(eVar, "initCallback cannot be null");
        this.f5458a.writeLock().lock();
        try {
            this.f5459b.remove(eVar);
        } finally {
            this.f5458a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f5462e.c(editorInfo);
        }
    }
}
