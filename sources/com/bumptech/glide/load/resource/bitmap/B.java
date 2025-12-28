package com.bumptech.glide.load.resource.bitmap;

import X0.d;
import X0.e;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.s;

public final class B implements e {

    /* renamed from: a  reason: collision with root package name */
    private final s f11069a;

    public B(s sVar) {
        this.f11069a = sVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public s a(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, d dVar) {
        return this.f11069a.d(parcelFileDescriptor, i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, d dVar) {
        if (!e(parcelFileDescriptor) || !this.f11069a.o(parcelFileDescriptor)) {
            return false;
        }
        return true;
    }
}
