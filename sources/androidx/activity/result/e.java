package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final c f2413e = new c((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f2414a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f2415b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2416c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2417d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f2418a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f2419b;

        /* renamed from: c  reason: collision with root package name */
        private int f2420c;

        /* renamed from: d  reason: collision with root package name */
        private int f2421d;

        public a(IntentSender intentSender) {
            o.e(intentSender, "intentSender");
            this.f2418a = intentSender;
        }

        public final e a() {
            return new e(this.f2418a, this.f2419b, this.f2420c, this.f2421d);
        }

        public final a b(Intent intent) {
            this.f2419b = intent;
            return this;
        }

        public final a c(int i4, int i5) {
            this.f2421d = i4;
            this.f2420c = i5;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            o.e(parcel, "inParcel");
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i4) {
            return new e[i4];
        }
    }

    public static final class c {
        public /* synthetic */ c(i iVar) {
            this();
        }

        private c() {
        }
    }

    public e(IntentSender intentSender, Intent intent, int i4, int i5) {
        o.e(intentSender, "intentSender");
        this.f2414a = intentSender;
        this.f2415b = intent;
        this.f2416c = i4;
        this.f2417d = i5;
    }

    public int describeContents() {
        return 0;
    }

    public final Intent t() {
        return this.f2415b;
    }

    public final int u() {
        return this.f2416c;
    }

    public final int v() {
        return this.f2417d;
    }

    public final IntentSender w() {
        return this.f2414a;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        o.e(parcel, "dest");
        parcel.writeParcelable(this.f2414a, i4);
        parcel.writeParcelable(this.f2415b, i4);
        parcel.writeInt(this.f2416c);
        parcel.writeInt(this.f2417d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.o.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.e.<init>(android.os.Parcel):void");
    }
}
