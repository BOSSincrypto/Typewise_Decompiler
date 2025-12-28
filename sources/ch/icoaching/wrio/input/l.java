package ch.icoaching.wrio.input;

import java.util.List;
import kotlin.jvm.internal.o;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f9805a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9806b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9807c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9808d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9809e;

    /* renamed from: f  reason: collision with root package name */
    private final OnContentChangeEventFlags f9810f;

    public l(String str, String str2, List list, int i4, String str3, OnContentChangeEventFlags onContentChangeEventFlags) {
        o.e(str, "contentOld");
        o.e(str2, "contentNew");
        o.e(list, "touchPointsNew");
        o.e(str3, "change");
        o.e(onContentChangeEventFlags, "onContentChangeEventFlags");
        this.f9805a = str;
        this.f9806b = str2;
        this.f9807c = list;
        this.f9808d = i4;
        this.f9809e = str3;
        this.f9810f = onContentChangeEventFlags;
    }

    public static /* synthetic */ l a(l lVar, String str, String str2, List list, int i4, String str3, OnContentChangeEventFlags onContentChangeEventFlags, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = lVar.f9805a;
        }
        if ((i5 & 2) != 0) {
            str2 = lVar.f9806b;
        }
        String str4 = str2;
        if ((i5 & 4) != 0) {
            list = lVar.f9807c;
        }
        List list2 = list;
        if ((i5 & 8) != 0) {
            i4 = lVar.f9808d;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            str3 = lVar.f9809e;
        }
        String str5 = str3;
        if ((i5 & 32) != 0) {
            onContentChangeEventFlags = lVar.f9810f;
        }
        return lVar.b(str, str4, list2, i6, str5, onContentChangeEventFlags);
    }

    public final l b(String str, String str2, List list, int i4, String str3, OnContentChangeEventFlags onContentChangeEventFlags) {
        o.e(str, "contentOld");
        o.e(str2, "contentNew");
        o.e(list, "touchPointsNew");
        o.e(str3, "change");
        o.e(onContentChangeEventFlags, "onContentChangeEventFlags");
        return new l(str, str2, list, i4, str3, onContentChangeEventFlags);
    }

    public final String c() {
        return this.f9809e;
    }

    public final String d() {
        return this.f9806b;
    }

    public final String e() {
        return this.f9805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return o.a(this.f9805a, lVar.f9805a) && o.a(this.f9806b, lVar.f9806b) && o.a(this.f9807c, lVar.f9807c) && this.f9808d == lVar.f9808d && o.a(this.f9809e, lVar.f9809e) && o.a(this.f9810f, lVar.f9810f);
    }

    public final int f() {
        return this.f9808d;
    }

    public final OnContentChangeEventFlags g() {
        return this.f9810f;
    }

    public final List h() {
        return this.f9807c;
    }

    public int hashCode() {
        return (((((((((this.f9805a.hashCode() * 31) + this.f9806b.hashCode()) * 31) + this.f9807c.hashCode()) * 31) + this.f9808d) * 31) + this.f9809e.hashCode()) * 31) + this.f9810f.hashCode();
    }

    public String toString() {
        return "OnContentChangeEvent(contentOld=" + this.f9805a + ", contentNew=" + this.f9806b + ", touchPointsNew=" + this.f9807c + ", cursorPosition=" + this.f9808d + ", change=" + this.f9809e + ", onContentChangeEventFlags=" + this.f9810f + ')';
    }
}
