package i1;

import W0.a;
import Z0.d;
import android.graphics.Bitmap;

public final class b implements a.C0031a {

    /* renamed from: a  reason: collision with root package name */
    private final d f13680a;

    /* renamed from: b  reason: collision with root package name */
    private final Z0.b f13681b;

    public b(d dVar, Z0.b bVar) {
        this.f13680a = dVar;
        this.f13681b = bVar;
    }

    public Bitmap a(int i4, int i5, Bitmap.Config config) {
        return this.f13680a.e(i4, i5, config);
    }

    public void b(byte[] bArr) {
        Z0.b bVar = this.f13681b;
        if (bVar != null) {
            bVar.d(bArr);
        }
    }

    public byte[] c(int i4) {
        Z0.b bVar = this.f13681b;
        if (bVar == null) {
            return new byte[i4];
        }
        return (byte[]) bVar.e(i4, byte[].class);
    }

    public void d(int[] iArr) {
        Z0.b bVar = this.f13681b;
        if (bVar != null) {
            bVar.d(iArr);
        }
    }

    public int[] e(int i4) {
        Z0.b bVar = this.f13681b;
        if (bVar == null) {
            return new int[i4];
        }
        return (int[]) bVar.e(i4, int[].class);
    }

    public void f(Bitmap bitmap) {
        this.f13680a.d(bitmap);
    }
}
