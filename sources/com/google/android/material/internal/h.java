package com.google.android.material.internal;

import N1.d;
import N1.f;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f12153a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final f f12154b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f12155c;

    /* renamed from: d  reason: collision with root package name */
    private float f12156d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f12157e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f12158f = new WeakReference((Object) null);

    /* renamed from: g  reason: collision with root package name */
    private d f12159g;

    class a extends f {
        a() {
        }

        public void a(int i4) {
            boolean unused = h.this.f12157e = true;
            b bVar = (b) h.this.f12158f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z3) {
            if (!z3) {
                boolean unused = h.this.f12157e = true;
                b bVar = (b) h.this.f12158f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f12153a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f12153a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.f12155c = d(str);
        this.f12156d = c(str);
        this.f12157e = false;
    }

    public d e() {
        return this.f12159g;
    }

    public TextPaint f() {
        return this.f12153a;
    }

    public float g(String str) {
        if (!this.f12157e) {
            return this.f12155c;
        }
        h(str);
        return this.f12155c;
    }

    public void i(b bVar) {
        this.f12158f = new WeakReference(bVar);
    }

    public void j(d dVar, Context context) {
        if (this.f12159g != dVar) {
            this.f12159g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f12153a, this.f12154b);
                b bVar = (b) this.f12158f.get();
                if (bVar != null) {
                    this.f12153a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f12153a, this.f12154b);
                this.f12157e = true;
            }
            b bVar2 = (b) this.f12158f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z3) {
        this.f12157e = z3;
    }

    public void l(Context context) {
        this.f12159g.n(context, this.f12153a, this.f12154b);
    }
}
