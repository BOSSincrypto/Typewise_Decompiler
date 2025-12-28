package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

final class StaticLayoutBuilderCompat {

    /* renamed from: n  reason: collision with root package name */
    static final int f12056n = 1;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f12057a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f12058b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12059c;

    /* renamed from: d  reason: collision with root package name */
    private int f12060d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f12061e;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f12062f;

    /* renamed from: g  reason: collision with root package name */
    private int f12063g;

    /* renamed from: h  reason: collision with root package name */
    private float f12064h;

    /* renamed from: i  reason: collision with root package name */
    private float f12065i;

    /* renamed from: j  reason: collision with root package name */
    private int f12066j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12067k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12068l;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f12069m;

    static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f12057a = charSequence;
        this.f12058b = textPaint;
        this.f12059c = i4;
        this.f12061e = charSequence.length();
        this.f12062f = Layout.Alignment.ALIGN_NORMAL;
        this.f12063g = Integer.MAX_VALUE;
        this.f12064h = 0.0f;
        this.f12065i = 1.0f;
        this.f12066j = f12056n;
        this.f12067k = true;
        this.f12069m = null;
    }

    public static StaticLayoutBuilderCompat b(CharSequence charSequence, TextPaint textPaint, int i4) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i4);
    }

    public StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f12057a == null) {
            this.f12057a = "";
        }
        int max = Math.max(0, this.f12059c);
        CharSequence charSequence = this.f12057a;
        if (this.f12063g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f12058b, (float) max, this.f12069m);
        }
        int min = Math.min(charSequence.length(), this.f12061e);
        this.f12061e = min;
        if (this.f12068l && this.f12063g == 1) {
            this.f12062f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f12060d, min, this.f12058b, max);
        obtain.setAlignment(this.f12062f);
        obtain.setIncludePad(this.f12067k);
        if (this.f12068l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f12069m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f12063g);
        float f4 = this.f12064h;
        if (!(f4 == 0.0f && this.f12065i == 1.0f)) {
            obtain.setLineSpacing(f4, this.f12065i);
        }
        if (this.f12063g > 1) {
            obtain.setHyphenationFrequency(this.f12066j);
        }
        return obtain.build();
    }

    public StaticLayoutBuilderCompat c(Layout.Alignment alignment) {
        this.f12062f = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat d(TextUtils.TruncateAt truncateAt) {
        this.f12069m = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat e(int i4) {
        this.f12066j = i4;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z3) {
        this.f12067k = z3;
        return this;
    }

    public StaticLayoutBuilderCompat g(boolean z3) {
        this.f12068l = z3;
        return this;
    }

    public StaticLayoutBuilderCompat h(float f4, float f5) {
        this.f12064h = f4;
        this.f12065i = f5;
        return this;
    }

    public StaticLayoutBuilderCompat i(int i4) {
        this.f12063g = i4;
        return this;
    }

    public StaticLayoutBuilderCompat j(g gVar) {
        return this;
    }
}
