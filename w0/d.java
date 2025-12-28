package W0;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.uuid.Uuid;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f1673a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f1674b;

    /* renamed from: c  reason: collision with root package name */
    private c f1675c;

    /* renamed from: d  reason: collision with root package name */
    private int f1676d = 0;

    private boolean b() {
        if (this.f1675c.f1661b != 0) {
            return true;
        }
        return false;
    }

    private int d() {
        try {
            return this.f1674b.get() & 255;
        } catch (Exception unused) {
            this.f1675c.f1661b = 1;
            return 0;
        }
    }

    private void e() {
        boolean z3;
        this.f1675c.f1663d.f1649a = n();
        this.f1675c.f1663d.f1650b = n();
        this.f1675c.f1663d.f1651c = n();
        this.f1675c.f1663d.f1652d = n();
        int d4 = d();
        boolean z4 = false;
        if ((d4 & Uuid.SIZE_BITS) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((d4 & 7) + 1));
        b bVar = this.f1675c.f1663d;
        if ((d4 & 64) != 0) {
            z4 = true;
        }
        bVar.f1653e = z4;
        if (z3) {
            bVar.f1659k = g(pow);
        } else {
            bVar.f1659k = null;
        }
        this.f1675c.f1663d.f1658j = this.f1674b.position();
        r();
        if (!b()) {
            c cVar = this.f1675c;
            cVar.f1662c++;
            cVar.f1664e.add(cVar.f1663d);
        }
    }

    private void f() {
        int d4 = d();
        this.f1676d = d4;
        if (d4 > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                try {
                    int i6 = this.f1676d;
                    if (i4 < i6) {
                        i5 = i6 - i4;
                        this.f1674b.get(this.f1673a, i4, i5);
                        i4 += i5;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i4);
                        sb.append(" count: ");
                        sb.append(i5);
                        sb.append(" blockSize: ");
                        sb.append(this.f1676d);
                    }
                    this.f1675c.f1661b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i4) {
        byte[] bArr = new byte[(i4 * 3)];
        int[] iArr = null;
        try {
            this.f1674b.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int i7 = i6 + 2;
                i6 += 3;
                int i8 = i5 + 1;
                iArr[i5] = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | -16777216 | (bArr[i7] & 255);
                i5 = i8;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f1675c.f1661b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i4) {
        boolean z3 = false;
        while (!z3 && !b() && this.f1675c.f1662c <= i4) {
            int d4 = d();
            if (d4 == 33) {
                int d5 = d();
                if (d5 == 1) {
                    q();
                } else if (d5 == 249) {
                    this.f1675c.f1663d = new b();
                    j();
                } else if (d5 == 254) {
                    q();
                } else if (d5 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < 11; i5++) {
                        sb.append((char) this.f1673a[i5]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d4 == 44) {
                c cVar = this.f1675c;
                if (cVar.f1663d == null) {
                    cVar.f1663d = new b();
                }
                e();
            } else if (d4 != 59) {
                this.f1675c.f1661b = 1;
            } else {
                z3 = true;
            }
        }
    }

    private void j() {
        d();
        int d4 = d();
        b bVar = this.f1675c.f1663d;
        int i4 = (d4 & 28) >> 2;
        bVar.f1655g = i4;
        boolean z3 = true;
        if (i4 == 0) {
            bVar.f1655g = 1;
        }
        if ((d4 & 1) == 0) {
            z3 = false;
        }
        bVar.f1654f = z3;
        int n4 = n();
        if (n4 < 2) {
            n4 = 10;
        }
        b bVar2 = this.f1675c.f1663d;
        bVar2.f1657i = n4 * 10;
        bVar2.f1656h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 6; i4++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f1675c.f1661b = 1;
            return;
        }
        l();
        if (this.f1675c.f1667h && !b()) {
            c cVar = this.f1675c;
            cVar.f1660a = g(cVar.f1668i);
            c cVar2 = this.f1675c;
            cVar2.f1671l = cVar2.f1660a[cVar2.f1669j];
        }
    }

    private void l() {
        boolean z3;
        this.f1675c.f1665f = n();
        this.f1675c.f1666g = n();
        int d4 = d();
        c cVar = this.f1675c;
        if ((d4 & Uuid.SIZE_BITS) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        cVar.f1667h = z3;
        cVar.f1668i = (int) Math.pow(2.0d, (double) ((d4 & 7) + 1));
        this.f1675c.f1669j = d();
        this.f1675c.f1670k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.f1673a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            W0.c r2 = r3.f1675c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f1672m = r0
        L_0x001b:
            int r0 = r3.f1676d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.d.m():void");
    }

    private int n() {
        return this.f1674b.getShort();
    }

    private void o() {
        this.f1674b = null;
        Arrays.fill(this.f1673a, (byte) 0);
        this.f1675c = new c();
        this.f1676d = 0;
    }

    private void q() {
        int d4;
        do {
            d4 = d();
            this.f1674b.position(Math.min(this.f1674b.position() + d4, this.f1674b.limit()));
        } while (d4 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f1674b = null;
        this.f1675c = null;
    }

    public c c() {
        if (this.f1674b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.f1675c;
        } else {
            k();
            if (!b()) {
                h();
                c cVar = this.f1675c;
                if (cVar.f1662c < 0) {
                    cVar.f1661b = 1;
                }
            }
            return this.f1675c;
        }
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f1674b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f1674b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
