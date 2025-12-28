package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.y;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
final class C0447b implements Parcelable {
    public static final Parcelable.Creator<C0447b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f5732a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f5733b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f5734c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f5735d;

    /* renamed from: e  reason: collision with root package name */
    final int f5736e;

    /* renamed from: f  reason: collision with root package name */
    final String f5737f;

    /* renamed from: g  reason: collision with root package name */
    final int f5738g;

    /* renamed from: h  reason: collision with root package name */
    final int f5739h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f5740i;

    /* renamed from: j  reason: collision with root package name */
    final int f5741j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f5742k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList f5743l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList f5744m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f5745n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C0447b createFromParcel(Parcel parcel) {
            return new C0447b(parcel);
        }

        /* renamed from: b */
        public C0447b[] newArray(int i4) {
            return new C0447b[i4];
        }
    }

    C0447b(C0446a aVar) {
        int size = aVar.f5947c.size();
        this.f5732a = new int[(size * 6)];
        if (aVar.f5953i) {
            this.f5733b = new ArrayList(size);
            this.f5734c = new int[size];
            this.f5735d = new int[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                y.a aVar2 = (y.a) aVar.f5947c.get(i5);
                int i6 = i4 + 1;
                this.f5732a[i4] = aVar2.f5964a;
                ArrayList arrayList = this.f5733b;
                Fragment fragment = aVar2.f5965b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f5732a;
                iArr[i6] = aVar2.f5966c;
                iArr[i4 + 2] = aVar2.f5967d;
                iArr[i4 + 3] = aVar2.f5968e;
                int i7 = i4 + 5;
                iArr[i4 + 4] = aVar2.f5969f;
                i4 += 6;
                iArr[i7] = aVar2.f5970g;
                this.f5734c[i5] = aVar2.f5971h.ordinal();
                this.f5735d[i5] = aVar2.f5972i.ordinal();
            }
            this.f5736e = aVar.f5952h;
            this.f5737f = aVar.f5955k;
            this.f5738g = aVar.f5730v;
            this.f5739h = aVar.f5956l;
            this.f5740i = aVar.f5957m;
            this.f5741j = aVar.f5958n;
            this.f5742k = aVar.f5959o;
            this.f5743l = aVar.f5960p;
            this.f5744m = aVar.f5961q;
            this.f5745n = aVar.f5962r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void t(C0446a aVar) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 < this.f5732a.length) {
                y.a aVar2 = new y.a();
                int i6 = i4 + 1;
                aVar2.f5964a = this.f5732a[i4];
                if (q.D0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instantiate ");
                    sb.append(aVar);
                    sb.append(" op #");
                    sb.append(i5);
                    sb.append(" base fragment #");
                    sb.append(this.f5732a[i6]);
                }
                aVar2.f5971h = Lifecycle.State.values()[this.f5734c[i5]];
                aVar2.f5972i = Lifecycle.State.values()[this.f5735d[i5]];
                int[] iArr = this.f5732a;
                int i7 = i4 + 2;
                if (iArr[i6] == 0) {
                    z3 = false;
                }
                aVar2.f5966c = z3;
                int i8 = iArr[i7];
                aVar2.f5967d = i8;
                int i9 = iArr[i4 + 3];
                aVar2.f5968e = i9;
                int i10 = i4 + 5;
                int i11 = iArr[i4 + 4];
                aVar2.f5969f = i11;
                i4 += 6;
                int i12 = iArr[i10];
                aVar2.f5970g = i12;
                aVar.f5948d = i8;
                aVar.f5949e = i9;
                aVar.f5950f = i11;
                aVar.f5951g = i12;
                aVar.e(aVar2);
                i5++;
            } else {
                aVar.f5952h = this.f5736e;
                aVar.f5955k = this.f5737f;
                aVar.f5953i = true;
                aVar.f5956l = this.f5739h;
                aVar.f5957m = this.f5740i;
                aVar.f5958n = this.f5741j;
                aVar.f5959o = this.f5742k;
                aVar.f5960p = this.f5743l;
                aVar.f5961q = this.f5744m;
                aVar.f5962r = this.f5745n;
                return;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public C0446a u(q qVar) {
        C0446a aVar = new C0446a(qVar);
        t(aVar);
        aVar.f5730v = this.f5738g;
        for (int i4 = 0; i4 < this.f5733b.size(); i4++) {
            String str = (String) this.f5733b.get(i4);
            if (str != null) {
                ((y.a) aVar.f5947c.get(i4)).f5965b = qVar.b0(str);
            }
        }
        aVar.p(1);
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f5732a);
        parcel.writeStringList(this.f5733b);
        parcel.writeIntArray(this.f5734c);
        parcel.writeIntArray(this.f5735d);
        parcel.writeInt(this.f5736e);
        parcel.writeString(this.f5737f);
        parcel.writeInt(this.f5738g);
        parcel.writeInt(this.f5739h);
        TextUtils.writeToParcel(this.f5740i, parcel, 0);
        parcel.writeInt(this.f5741j);
        TextUtils.writeToParcel(this.f5742k, parcel, 0);
        parcel.writeStringList(this.f5743l);
        parcel.writeStringList(this.f5744m);
        parcel.writeInt(this.f5745n ? 1 : 0);
    }

    C0447b(Parcel parcel) {
        this.f5732a = parcel.createIntArray();
        this.f5733b = parcel.createStringArrayList();
        this.f5734c = parcel.createIntArray();
        this.f5735d = parcel.createIntArray();
        this.f5736e = parcel.readInt();
        this.f5737f = parcel.readString();
        this.f5738g = parcel.readInt();
        this.f5739h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5740i = (CharSequence) creator.createFromParcel(parcel);
        this.f5741j = parcel.readInt();
        this.f5742k = (CharSequence) creator.createFromParcel(parcel);
        this.f5743l = parcel.createStringArrayList();
        this.f5744m = parcel.createStringArrayList();
        this.f5745n = parcel.readInt() != 0;
    }
}
