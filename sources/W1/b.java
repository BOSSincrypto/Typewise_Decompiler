package w1;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class b {
    public static int a(Parcel parcel) {
        return f(parcel, 20293);
    }

    public static void b(Parcel parcel, int i4) {
        g(parcel, i4);
    }

    public static void c(Parcel parcel, int i4, int i5) {
        h(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void d(Parcel parcel, int i4, Parcelable parcelable, int i5, boolean z3) {
        if (parcelable != null) {
            int f4 = f(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            g(parcel, f4);
        } else if (z3) {
            h(parcel, i4, 0);
        }
    }

    public static void e(Parcel parcel, int i4, String str, boolean z3) {
        if (str != null) {
            int f4 = f(parcel, i4);
            parcel.writeString(str);
            g(parcel, f4);
        } else if (z3) {
            h(parcel, i4, 0);
        }
    }

    private static int f(Parcel parcel, int i4) {
        parcel.writeInt(i4 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void g(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    private static void h(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }
}
