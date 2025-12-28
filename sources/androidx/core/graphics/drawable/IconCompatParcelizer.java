package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4959a = aVar.p(iconCompat.f4959a, 1);
        iconCompat.f4961c = aVar.j(iconCompat.f4961c, 2);
        iconCompat.f4962d = aVar.r(iconCompat.f4962d, 3);
        iconCompat.f4963e = aVar.p(iconCompat.f4963e, 4);
        iconCompat.f4964f = aVar.p(iconCompat.f4964f, 5);
        iconCompat.f4965g = (ColorStateList) aVar.r(iconCompat.f4965g, 6);
        iconCompat.f4967i = aVar.t(iconCompat.f4967i, 7);
        iconCompat.f4968j = aVar.t(iconCompat.f4968j, 8);
        iconCompat.i();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.j(aVar.f());
        int i4 = iconCompat.f4959a;
        if (-1 != i4) {
            aVar.F(i4, 1);
        }
        byte[] bArr = iconCompat.f4961c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4962d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i5 = iconCompat.f4963e;
        if (i5 != 0) {
            aVar.F(i5, 4);
        }
        int i6 = iconCompat.f4964f;
        if (i6 != 0) {
            aVar.F(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f4965g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f4967i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f4968j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
