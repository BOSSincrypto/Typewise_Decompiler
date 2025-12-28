package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0170a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final m f11934a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m f11935b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f11936c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public m f11937d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f11938e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11939f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11940g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    class C0170a implements Parcelable.Creator {
        C0170a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<m> cls = m.class;
            return new a((m) parcel.readParcelable(cls.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (C0170a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        static final long f11941f = y.a(m.u(1900, 0).f12008f);

        /* renamed from: g  reason: collision with root package name */
        static final long f11942g = y.a(m.u(2100, 11).f12008f);

        /* renamed from: a  reason: collision with root package name */
        private long f11943a = f11941f;

        /* renamed from: b  reason: collision with root package name */
        private long f11944b = f11942g;

        /* renamed from: c  reason: collision with root package name */
        private Long f11945c;

        /* renamed from: d  reason: collision with root package name */
        private int f11946d;

        /* renamed from: e  reason: collision with root package name */
        private c f11947e = g.t(Long.MIN_VALUE);

        b(a aVar) {
            this.f11943a = aVar.f11934a.f12008f;
            this.f11944b = aVar.f11935b.f12008f;
            this.f11945c = Long.valueOf(aVar.f11937d.f12008f);
            this.f11946d = aVar.f11938e;
            this.f11947e = aVar.f11936c;
        }

        public a a() {
            m v3;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f11947e);
            m v4 = m.v(this.f11943a);
            m v5 = m.v(this.f11944b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l4 = this.f11945c;
            if (l4 == null) {
                v3 = null;
            } else {
                v3 = m.v(l4.longValue());
            }
            return new a(v4, v5, cVar, v3, this.f11946d, (C0170a) null);
        }

        public b b(long j4) {
            this.f11945c = Long.valueOf(j4);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean d(long j4);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i4, C0170a aVar) {
        this(mVar, mVar2, cVar, mVar3, i4);
    }

    /* access modifiers changed from: package-private */
    public int A() {
        return this.f11938e;
    }

    /* access modifiers changed from: package-private */
    public int B() {
        return this.f11940g;
    }

    /* access modifiers changed from: package-private */
    public m C() {
        return this.f11937d;
    }

    /* access modifiers changed from: package-private */
    public m D() {
        return this.f11934a;
    }

    /* access modifiers changed from: package-private */
    public int E() {
        return this.f11939f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f11934a.equals(aVar.f11934a) || !this.f11935b.equals(aVar.f11935b) || !androidx.core.util.c.a(this.f11937d, aVar.f11937d) || this.f11938e != aVar.f11938e || !this.f11936c.equals(aVar.f11936c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11934a, this.f11935b, this.f11937d, Integer.valueOf(this.f11938e), this.f11936c});
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f11934a, 0);
        parcel.writeParcelable(this.f11935b, 0);
        parcel.writeParcelable(this.f11937d, 0);
        parcel.writeParcelable(this.f11936c, 0);
        parcel.writeInt(this.f11938e);
    }

    public c y() {
        return this.f11936c;
    }

    /* access modifiers changed from: package-private */
    public m z() {
        return this.f11935b;
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i4) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f11934a = mVar;
        this.f11935b = mVar2;
        this.f11937d = mVar3;
        this.f11938e = i4;
        this.f11936c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i4 < 0 || i4 > y.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f11940g = mVar.D(mVar2) + 1;
            this.f11939f = (mVar2.f12005c - mVar.f12005c) + 1;
        }
    }
}
