package com.ibm.icu.impl;

import com.ibm.icu.impl.d;
import com.ibm.icu.impl.q;
import java.io.IOException;
import java.nio.ByteBuffer;

final class r implements d.b {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f12965a;

    /* renamed from: b  reason: collision with root package name */
    private int f12966b;

    /* renamed from: c  reason: collision with root package name */
    private int f12967c;

    /* renamed from: d  reason: collision with root package name */
    private int f12968d;

    /* renamed from: e  reason: collision with root package name */
    private int f12969e;

    protected r(ByteBuffer byteBuffer) {
        d.s(byteBuffer, 1970168173, this);
        this.f12965a = byteBuffer;
    }

    private q.a c() {
        q.a aVar = new q.a();
        int i4 = this.f12965a.getInt();
        int i5 = this.f12965a.getInt();
        byte b4 = this.f12965a.get();
        byte b5 = this.f12965a.get();
        if (!aVar.e(i4, i5, b4, b5)) {
            return null;
        }
        int i6 = this.f12965a.getChar();
        if (b4 == 1) {
            aVar.c(d.i(this.f12965a, b5, 0));
            i6 -= b5 << 1;
        }
        StringBuilder sb = new StringBuilder();
        byte b6 = this.f12965a.get();
        while (true) {
            char c4 = (char) (b6 & 255);
            if (c4 == 0) {
                break;
            }
            sb.append(c4);
            b6 = this.f12965a.get();
        }
        aVar.f(sb.toString());
        int length = i6 - (sb.length() + 13);
        if (length > 0) {
            byte[] bArr = new byte[length];
            this.f12965a.get(bArr);
            aVar.d(bArr);
        }
        return aVar;
    }

    public boolean a(byte[] bArr) {
        if (bArr[0] == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(q qVar) {
        this.f12966b = this.f12965a.getInt();
        this.f12967c = this.f12965a.getInt();
        this.f12968d = this.f12965a.getInt();
        this.f12969e = this.f12965a.getInt();
        int i4 = 0;
        char[] i5 = d.i(this.f12965a, this.f12965a.getChar(), 0);
        byte[] bArr = new byte[(this.f12967c - this.f12966b)];
        this.f12965a.get(bArr);
        qVar.j(i5, bArr);
        char c4 = this.f12965a.getChar();
        qVar.i(c4, 3);
        char[] i6 = d.i(this.f12965a, c4 * 3, 0);
        byte[] bArr2 = new byte[(this.f12969e - this.f12968d)];
        this.f12965a.get(bArr2);
        qVar.h(i6, bArr2);
        int i7 = this.f12965a.getInt();
        q.a[] aVarArr = new q.a[i7];
        while (i4 < i7) {
            q.a c5 = c();
            if (c5 != null) {
                aVarArr[i4] = c5;
                i4++;
            } else {
                throw new IOException("unames.icu read error: Algorithmic names creation error");
            }
        }
        qVar.g(aVarArr);
    }
}
