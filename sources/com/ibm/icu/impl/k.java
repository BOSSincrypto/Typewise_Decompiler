package com.ibm.icu.impl;

import a2.C0365g;
import com.ibm.icu.impl.d;
import com.ibm.icu.util.CodePointTrie;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class k {

    /* renamed from: g  reason: collision with root package name */
    private static final b f12774g = new b();

    /* renamed from: a  reason: collision with root package name */
    public c f12775a;

    /* renamed from: b  reason: collision with root package name */
    public d f12776b;

    /* renamed from: c  reason: collision with root package name */
    public d f12777c;

    /* renamed from: d  reason: collision with root package name */
    public CodePointTrie f12778d;

    /* renamed from: e  reason: collision with root package name */
    public String f12779e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f12780f;

    private static final class b implements d.b {
        private b() {
        }

        public boolean a(byte[] bArr) {
            if ((bArr[0] << 24) + (bArr[1] << 16) + (bArr[2] << 8) + bArr[3] == 100663296) {
                return true;
            }
            return false;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        int f12781a = 0;

        /* renamed from: b  reason: collision with root package name */
        byte[] f12782b = new byte[4];

        /* renamed from: c  reason: collision with root package name */
        int f12783c;

        /* renamed from: d  reason: collision with root package name */
        public int f12784d;

        /* renamed from: e  reason: collision with root package name */
        int f12785e;

        /* renamed from: f  reason: collision with root package name */
        int f12786f;

        /* renamed from: g  reason: collision with root package name */
        int f12787g;

        /* renamed from: h  reason: collision with root package name */
        int f12788h;

        /* renamed from: i  reason: collision with root package name */
        int f12789i;

        /* renamed from: j  reason: collision with root package name */
        int f12790j;

        /* renamed from: k  reason: collision with root package name */
        int f12791k;

        /* renamed from: l  reason: collision with root package name */
        int f12792l;

        /* renamed from: m  reason: collision with root package name */
        int f12793m;

        /* renamed from: n  reason: collision with root package name */
        int f12794n;
    }

    public static class d {

        /* renamed from: g  reason: collision with root package name */
        public static int f12795g = 20;

        /* renamed from: a  reason: collision with root package name */
        public int f12796a;

        /* renamed from: b  reason: collision with root package name */
        public int f12797b;

        /* renamed from: c  reason: collision with root package name */
        public int f12798c;

        /* renamed from: d  reason: collision with root package name */
        public int f12799d;

        /* renamed from: e  reason: collision with root package name */
        public int f12800e;

        /* renamed from: f  reason: collision with root package name */
        public char[] f12801f;

        static d a(ByteBuffer byteBuffer, int i4) {
            if (i4 == 0) {
                return null;
            }
            if (i4 >= f12795g) {
                d dVar = new d();
                dVar.f12796a = byteBuffer.getInt();
                dVar.f12797b = byteBuffer.getInt();
                dVar.f12798c = byteBuffer.getInt();
                dVar.f12799d = byteBuffer.getInt();
                int i5 = byteBuffer.getInt();
                dVar.f12800e = i5;
                int i6 = i4 - f12795g;
                if ((i5 & 4) == 4) {
                    dVar.f12801f = new char[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        dVar.f12801f[i7] = (char) (byteBuffer.get() & 255);
                    }
                    d.u(byteBuffer, i6 & 1);
                } else {
                    dVar.f12801f = d.i(byteBuffer, i6 / 2, i6 & 1);
                }
                return dVar;
            }
            throw new IOException("Invalid RBBI state table length.");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f12796a == dVar.f12796a && this.f12797b == dVar.f12797b && this.f12798c == dVar.f12798c && this.f12799d == dVar.f12799d && this.f12800e == dVar.f12800e) {
                return Arrays.equals(this.f12801f, dVar.f12801f);
            }
            return false;
        }
    }

    k() {
    }

    private void b(PrintStream printStream) {
        int j4;
        int i4 = this.f12775a.f12784d + 1;
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 <= this.f12775a.f12784d; i5++) {
            strArr[i5] = "";
        }
        printStream.println("\nCharacter Categories");
        printStream.println("--------------------");
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i7 > 1114111) {
                break;
            }
            j4 = this.f12778d.j(i7);
            if (j4 < 0 || j4 > this.f12775a.f12784d) {
                printStream.println("Error, bad category " + Integer.toHexString(j4) + " for char " + Integer.toHexString(i7));
            } else {
                if (j4 != i6) {
                    if (i6 >= 0) {
                        if (strArr[i6].length() > iArr[i6] + 70) {
                            iArr[i6] = strArr[i6].length() + 10;
                            strArr[i6] = strArr[i6] + "\n       ";
                        }
                        strArr[i6] = strArr[i6] + " " + Integer.toHexString(i8);
                        if (i9 != i8) {
                            strArr[i6] = strArr[i6] + "-" + Integer.toHexString(i9);
                        }
                    }
                    i8 = i7;
                    i6 = j4;
                }
                i9 = i7;
                i7++;
            }
        }
        printStream.println("Error, bad category " + Integer.toHexString(j4) + " for char " + Integer.toHexString(i7));
        strArr[i6] = strArr[i6] + " " + Integer.toHexString(i8);
        if (i9 != i8) {
            strArr[i6] = strArr[i6] + "-" + Integer.toHexString(i9);
        }
        for (int i10 = 0; i10 <= this.f12775a.f12784d; i10++) {
            printStream.println(h(i10, 5) + "  " + strArr[i10]);
        }
        printStream.println();
    }

    private void c(PrintStream printStream, d dVar, char c4) {
        StringBuilder sb = new StringBuilder((this.f12775a.f12784d * 5) + 20);
        sb.append(h(c4, 4));
        int f4 = f(c4);
        char c5 = dVar.f12801f[f4];
        if (c5 != 0) {
            sb.append(h(c5, 5));
        } else {
            sb.append("     ");
        }
        char c6 = dVar.f12801f[f4 + 1];
        if (c6 != 0) {
            sb.append(h(c6, 5));
        } else {
            sb.append("     ");
        }
        sb.append(h(dVar.f12801f[f4 + 2], 5));
        for (int i4 = 0; i4 < this.f12775a.f12784d; i4++) {
            sb.append(h(dVar.f12801f[f4 + 3 + i4], 5));
        }
        printStream.println(sb);
    }

    private void d(PrintStream printStream, d dVar) {
        if (dVar == null || dVar.f12801f.length == 0) {
            printStream.println("  -- null -- ");
            return;
        }
        StringBuilder sb = new StringBuilder(" Row  Acc Look  Tag");
        for (char c4 = 0; c4 < this.f12775a.f12784d; c4 = (char) (c4 + 1)) {
            sb.append(h(c4, 5));
        }
        printStream.println(sb.toString());
        for (char c5 = 0; c5 < sb.length(); c5 = (char) (c5 + 1)) {
            printStream.print("-");
        }
        printStream.println();
        for (char c6 = 0; c6 < dVar.f12796a; c6 = (char) (c6 + 1)) {
            c(printStream, dVar, c6);
        }
        printStream.println();
    }

    public static k e(ByteBuffer byteBuffer) {
        k kVar = new k();
        b bVar = f12774g;
        d.s(byteBuffer, 1114794784, bVar);
        c cVar = new c();
        kVar.f12775a = cVar;
        cVar.f12781a = byteBuffer.getInt();
        kVar.f12775a.f12782b[0] = byteBuffer.get();
        kVar.f12775a.f12782b[1] = byteBuffer.get();
        kVar.f12775a.f12782b[2] = byteBuffer.get();
        kVar.f12775a.f12782b[3] = byteBuffer.get();
        kVar.f12775a.f12783c = byteBuffer.getInt();
        kVar.f12775a.f12784d = byteBuffer.getInt();
        kVar.f12775a.f12785e = byteBuffer.getInt();
        kVar.f12775a.f12786f = byteBuffer.getInt();
        kVar.f12775a.f12787g = byteBuffer.getInt();
        kVar.f12775a.f12788h = byteBuffer.getInt();
        kVar.f12775a.f12789i = byteBuffer.getInt();
        kVar.f12775a.f12790j = byteBuffer.getInt();
        kVar.f12775a.f12791k = byteBuffer.getInt();
        kVar.f12775a.f12792l = byteBuffer.getInt();
        kVar.f12775a.f12793m = byteBuffer.getInt();
        kVar.f12775a.f12794n = byteBuffer.getInt();
        d.u(byteBuffer, 24);
        c cVar2 = kVar.f12775a;
        if (cVar2.f12781a != 45472 || !bVar.a(cVar2.f12782b)) {
            throw new IOException("Break Iterator Rule Data Magic Number Incorrect, or unsupported data version.");
        }
        c cVar3 = kVar.f12775a;
        int i4 = cVar3.f12785e;
        if (i4 < 80 || i4 > cVar3.f12783c) {
            throw new IOException("Break iterator Rule data corrupt");
        }
        d.u(byteBuffer, i4 - 80);
        c cVar4 = kVar.f12775a;
        int i5 = cVar4.f12785e;
        kVar.f12776b = d.a(byteBuffer, cVar4.f12786f);
        c cVar5 = kVar.f12775a;
        d.u(byteBuffer, cVar5.f12787g - (i5 + cVar5.f12786f));
        c cVar6 = kVar.f12775a;
        int i6 = cVar6.f12787g;
        kVar.f12777c = d.a(byteBuffer, cVar6.f12788h);
        c cVar7 = kVar.f12775a;
        d.u(byteBuffer, cVar7.f12789i - (i6 + cVar7.f12788h));
        int i7 = kVar.f12775a.f12789i;
        byteBuffer.mark();
        kVar.f12778d = CodePointTrie.i(CodePointTrie.Type.FAST, (CodePointTrie.ValueWidth) null, byteBuffer);
        byteBuffer.reset();
        int i8 = kVar.f12775a.f12793m;
        if (i7 <= i8) {
            d.u(byteBuffer, i8 - i7);
            c cVar8 = kVar.f12775a;
            int i9 = cVar8.f12793m;
            int i10 = cVar8.f12794n;
            kVar.f12780f = d.n(byteBuffer, i10 / 4, i10 & 3);
            c cVar9 = kVar.f12775a;
            int i11 = i9 + cVar9.f12794n;
            int i12 = cVar9.f12791k;
            if (i11 <= i12) {
                d.u(byteBuffer, i12 - i11);
                c cVar10 = kVar.f12775a;
                int i13 = cVar10.f12791k;
                kVar.f12779e = new String(d.h(byteBuffer, cVar10.f12792l, 0), StandardCharsets.UTF_8);
                String str = C0365g.f2287x;
                if (str != null && str.indexOf("data") >= 0) {
                    kVar.a(System.out);
                }
                return kVar;
            }
            throw new IOException("Break iterator Rule data corrupt");
        }
        throw new IOException("Break iterator Rule data corrupt");
    }

    public static String g(int i4, int i5) {
        StringBuilder sb = new StringBuilder(i5);
        sb.append(Integer.toHexString(i4));
        while (sb.length() < i5) {
            sb.insert(0, ' ');
        }
        return sb.toString();
    }

    public static String h(int i4, int i5) {
        StringBuilder sb = new StringBuilder(i5);
        sb.append(i4);
        while (sb.length() < i5) {
            sb.insert(0, ' ');
        }
        return sb.toString();
    }

    public void a(PrintStream printStream) {
        this.f12776b.getClass();
        printStream.println("RBBI Data Wrapper dump ...");
        printStream.println();
        printStream.println("Forward State Table");
        d(printStream, this.f12776b);
        printStream.println("Reverse State Table");
        d(printStream, this.f12777c);
        b(printStream);
        printStream.println("Source Rules: " + this.f12779e);
    }

    public int f(int i4) {
        return i4 * (this.f12775a.f12784d + 3);
    }
}
