package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
class C0448c implements Parcelable {
    public static final Parcelable.Creator<C0448c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final List f5746a;

    /* renamed from: b  reason: collision with root package name */
    final List f5747b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C0448c createFromParcel(Parcel parcel) {
            return new C0448c(parcel);
        }

        /* renamed from: b */
        public C0448c[] newArray(int i4) {
            return new C0448c[i4];
        }
    }

    C0448c(Parcel parcel) {
        this.f5746a = parcel.createStringArrayList();
        this.f5747b = parcel.createTypedArrayList(C0447b.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f5746a);
        parcel.writeTypedList(this.f5747b);
    }
}
