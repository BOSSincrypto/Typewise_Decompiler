package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Parcelable a(Parcel parcel, int i4, Parcelable.Creator creator) {
        int g4 = g(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g4 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g4);
        return parcelable;
    }

    public static String b(Parcel parcel, int i4) {
        int g4 = g(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g4);
        return readString;
    }

    public static void c(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new ParseException("Overread allowed size end=" + i4, parcel);
        }
    }

    public static int d(int i4) {
        return (char) i4;
    }

    public static int e(Parcel parcel) {
        return parcel.readInt();
    }

    public static int f(Parcel parcel, int i4) {
        j(parcel, i4, 4);
        return parcel.readInt();
    }

    public static int g(Parcel parcel, int i4) {
        if ((i4 & -65536) != -65536) {
            return (char) (i4 >> 16);
        }
        return parcel.readInt();
    }

    public static void h(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + g(parcel, i4));
    }

    public static int i(Parcel parcel) {
        int e4 = e(parcel);
        int g4 = g(parcel, e4);
        int dataPosition = parcel.dataPosition();
        if (d(e4) == 20293) {
            int i4 = g4 + dataPosition;
            if (i4 >= dataPosition && i4 <= parcel.dataSize()) {
                return i4;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i4, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(e4))), parcel);
    }

    private static void j(Parcel parcel, int i4, int i5) {
        int g4 = g(parcel, i4);
        if (g4 != i5) {
            String hexString = Integer.toHexString(g4);
            throw new ParseException("Expected size " + i5 + " got " + g4 + " (0x" + hexString + ")", parcel);
        }
    }
}
