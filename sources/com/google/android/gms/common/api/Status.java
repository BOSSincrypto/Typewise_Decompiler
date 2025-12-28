package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t1.C0899a;
import v1.C0922a;
import w1.C0929a;
import w1.b;

public final class Status extends C0929a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final Status f11515f = new Status(-1);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f11516g = new Status(0);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f11517h = new Status(14);

    /* renamed from: i  reason: collision with root package name */
    public static final Status f11518i = new Status(8);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f11519j = new Status(15);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f11520k = new Status(16);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f11521l = new Status(18);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f11522m = new Status(17);

    /* renamed from: a  reason: collision with root package name */
    final int f11523a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11524b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11525c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f11526d;

    /* renamed from: e  reason: collision with root package name */
    private final C0899a f11527e;

    Status(int i4, int i5, String str, PendingIntent pendingIntent, C0899a aVar) {
        this.f11523a = i4;
        this.f11524b = i5;
        this.f11525c = str;
        this.f11526d = pendingIntent;
        this.f11527e = aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f11523a != status.f11523a || this.f11524b != status.f11524b || !C0922a.a(this.f11525c, status.f11525c) || !C0922a.a(this.f11526d, status.f11526d) || !C0922a.a(this.f11527e, status.f11527e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0922a.b(Integer.valueOf(this.f11523a), Integer.valueOf(this.f11524b), this.f11525c, this.f11526d, this.f11527e);
    }

    public C0899a t() {
        return this.f11527e;
    }

    public String toString() {
        C0922a.C0246a c4 = C0922a.c(this);
        c4.a("statusCode", w());
        c4.a("resolution", this.f11526d);
        return c4.toString();
    }

    public int u() {
        return this.f11524b;
    }

    public String v() {
        return this.f11525c;
    }

    public final String w() {
        String str = this.f11525c;
        if (str != null) {
            return str;
        }
        return a.a(this.f11524b);
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = b.a(parcel);
        b.c(parcel, 1, u());
        b.e(parcel, 2, v(), false);
        b.d(parcel, 3, this.f11526d, i4, false);
        b.d(parcel, 4, t(), i4, false);
        b.c(parcel, 1000, this.f11523a);
        b.b(parcel, a4);
    }

    public Status(int i4) {
        this(i4, (String) null);
    }

    public Status(int i4, String str) {
        this(1, i4, str, (PendingIntent) null, (C0899a) null);
    }
}
