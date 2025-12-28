package M;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f887b = new C0007a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f888a;

    /* renamed from: M.a$a  reason: collision with other inner class name */
    class C0007a extends a {
        C0007a() {
            super((C0007a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f887b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    /* synthetic */ a(C0007a aVar) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    public final Parcelable t() {
        return this.f888a;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f888a, i4);
    }

    private a() {
        this.f888a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f888a = parcelable == f887b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f888a = readParcelable == null ? f887b : readParcelable;
    }
}
