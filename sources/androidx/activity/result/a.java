package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0049a();

    /* renamed from: a  reason: collision with root package name */
    private final int f2411a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f2412b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    class C0049a implements Parcelable.Creator {
        C0049a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public a(int i4, Intent intent) {
        this.f2411a = i4;
        this.f2412b = intent;
    }

    public static String v(int i4) {
        if (i4 == -1) {
            return "RESULT_OK";
        }
        if (i4 != 0) {
            return String.valueOf(i4);
        }
        return "RESULT_CANCELED";
    }

    public int describeContents() {
        return 0;
    }

    public Intent t() {
        return this.f2412b;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + v(this.f2411a) + ", data=" + this.f2412b + '}';
    }

    public int u() {
        return this.f2411a;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int i5;
        parcel.writeInt(this.f2411a);
        if (this.f2412b == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        parcel.writeInt(i5);
        Intent intent = this.f2412b;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    a(Parcel parcel) {
        this.f2411a = parcel.readInt();
        this.f2412b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
