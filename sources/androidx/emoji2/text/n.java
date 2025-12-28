package androidx.emoji2.text;

import O.b;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.q;
import androidx.core.util.g;
import java.nio.ByteBuffer;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final b f5527a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f5528b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5529c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f5530d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f5531a;

        /* renamed from: b  reason: collision with root package name */
        private h f5532b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i4) {
            SparseArray sparseArray = this.f5531a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i4);
        }

        /* access modifiers changed from: package-private */
        public final h b() {
            return this.f5532b;
        }

        /* access modifiers changed from: package-private */
        public void c(h hVar, int i4, int i5) {
            a a4 = a(hVar.b(i4));
            if (a4 == null) {
                a4 = new a();
                this.f5531a.put(hVar.b(i4), a4);
            }
            if (i5 > i4) {
                a4.c(hVar, i4 + 1, i5);
            } else {
                a4.f5532b = hVar;
            }
        }

        a(int i4) {
            this.f5531a = new SparseArray(i4);
        }
    }

    private n(Typeface typeface, b bVar) {
        this.f5530d = typeface;
        this.f5527a = bVar;
        this.f5528b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k4 = bVar.k();
        for (int i4 = 0; i4 < k4; i4++) {
            h hVar = new h(this, i4);
            Character.toChars(hVar.f(), this.f5528b, i4 * 2);
            h(hVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            q.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            q.b();
        }
    }

    public char[] c() {
        return this.f5528b;
    }

    public b d() {
        return this.f5527a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f5527a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f5529c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f5530d;
    }

    /* access modifiers changed from: package-private */
    public void h(h hVar) {
        boolean z3;
        g.h(hVar, "emoji metadata cannot be null");
        if (hVar.c() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        g.b(z3, "invalid metadata codepoint length");
        this.f5529c.c(hVar, 0, hVar.c() - 1);
    }
}
