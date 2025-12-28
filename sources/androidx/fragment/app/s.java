package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import java.util.ArrayList;

final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f5894a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList f5895b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList f5896c;

    /* renamed from: d  reason: collision with root package name */
    C0447b[] f5897d;

    /* renamed from: e  reason: collision with root package name */
    int f5898e;

    /* renamed from: f  reason: collision with root package name */
    String f5899f = null;

    /* renamed from: g  reason: collision with root package name */
    ArrayList f5900g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    ArrayList f5901h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    ArrayList f5902i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    ArrayList f5903j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    ArrayList f5904k;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        /* renamed from: b */
        public s[] newArray(int i4) {
            return new s[i4];
        }
    }

    public s() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f5894a);
        parcel.writeStringList(this.f5895b);
        parcel.writeStringList(this.f5896c);
        parcel.writeTypedArray(this.f5897d, i4);
        parcel.writeInt(this.f5898e);
        parcel.writeString(this.f5899f);
        parcel.writeStringList(this.f5900g);
        parcel.writeTypedList(this.f5901h);
        parcel.writeStringList(this.f5902i);
        parcel.writeTypedList(this.f5903j);
        parcel.writeTypedList(this.f5904k);
    }

    public s(Parcel parcel) {
        this.f5894a = parcel.createTypedArrayList(v.CREATOR);
        this.f5895b = parcel.createStringArrayList();
        this.f5896c = parcel.createStringArrayList();
        this.f5897d = (C0447b[]) parcel.createTypedArray(C0447b.CREATOR);
        this.f5898e = parcel.readInt();
        this.f5899f = parcel.readString();
        this.f5900g = parcel.createStringArrayList();
        this.f5901h = parcel.createTypedArrayList(C0448c.CREATOR);
        this.f5902i = parcel.createStringArrayList();
        this.f5903j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f5904k = parcel.createTypedArrayList(q.j.CREATOR);
    }
}
