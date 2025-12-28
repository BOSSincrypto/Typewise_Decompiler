package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

abstract class n {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f6138a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f6139b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        f.h(inputStream);
        int j4 = f.j(inputStream);
        if (j4 != 6 && j4 != 7) {
            while (j4 > 0) {
                f.j(inputStream);
                for (int j5 = f.j(inputStream); j5 > 0; j5--) {
                    f.h(inputStream);
                }
                j4--;
            }
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, e[] eVarArr) {
        if (Arrays.equals(bArr, p.f6150a)) {
            N(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6151b)) {
            M(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6153d)) {
            K(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6152c)) {
            L(outputStream, eVarArr);
            return true;
        } else if (!Arrays.equals(bArr, p.f6154e)) {
            return false;
        } else {
            J(outputStream, eVarArr);
            return true;
        }
    }

    private static void C(OutputStream outputStream, e eVar) {
        int[] iArr = eVar.f6126h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            f.p(outputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
    }

    private static q D(e[] eVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f.p(byteArrayOutputStream, eVarArr.length);
            int i4 = 2;
            for (e eVar : eVarArr) {
                f.q(byteArrayOutputStream, eVar.f6121c);
                f.q(byteArrayOutputStream, eVar.f6122d);
                f.q(byteArrayOutputStream, (long) eVar.f6125g);
                String j4 = j(eVar.f6119a, eVar.f6120b, p.f6150a);
                int k4 = f.k(j4);
                f.p(byteArrayOutputStream, k4);
                i4 = i4 + 14 + k4;
                f.n(byteArrayOutputStream, j4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                q qVar = new q(FileSectionType.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw f.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f6138a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, e eVar) {
        I(outputStream, eVar);
        C(outputStream, eVar);
        H(outputStream, eVar);
    }

    private static void G(OutputStream outputStream, e eVar, String str) {
        f.p(outputStream, f.k(str));
        f.p(outputStream, eVar.f6123e);
        f.q(outputStream, (long) eVar.f6124f);
        f.q(outputStream, eVar.f6121c);
        f.q(outputStream, (long) eVar.f6125g);
        f.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, e eVar) {
        byte[] bArr = new byte[k(eVar.f6125g)];
        for (Map.Entry entry : eVar.f6127i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, eVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, e eVar) {
        int i4 = 0;
        for (Map.Entry entry : eVar.f6127i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                f.p(outputStream, intValue - i4);
                f.p(outputStream, 0);
                i4 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, e[] eVarArr) {
        f.p(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String j4 = j(eVar.f6119a, eVar.f6120b, p.f6154e);
            f.p(outputStream, f.k(j4));
            f.p(outputStream, eVar.f6127i.size());
            f.p(outputStream, eVar.f6126h.length);
            f.q(outputStream, eVar.f6121c);
            f.n(outputStream, j4);
            for (Integer intValue : eVar.f6127i.keySet()) {
                f.p(outputStream, intValue.intValue());
            }
            for (int p4 : eVar.f6126h) {
                f.p(outputStream, p4);
            }
        }
    }

    private static void K(OutputStream outputStream, e[] eVarArr) {
        f.r(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String j4 = j(eVar.f6119a, eVar.f6120b, p.f6153d);
            f.p(outputStream, f.k(j4));
            f.p(outputStream, eVar.f6126h.length);
            f.q(outputStream, (long) (eVar.f6127i.size() * 4));
            f.q(outputStream, eVar.f6121c);
            f.n(outputStream, j4);
            for (Integer intValue : eVar.f6127i.keySet()) {
                f.p(outputStream, intValue.intValue());
                f.p(outputStream, 0);
            }
            for (int p4 : eVar.f6126h) {
                f.p(outputStream, p4);
            }
        }
    }

    private static void L(OutputStream outputStream, e[] eVarArr) {
        byte[] b4 = b(eVarArr, p.f6152c);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, b4);
    }

    private static void M(OutputStream outputStream, e[] eVarArr) {
        byte[] b4 = b(eVarArr, p.f6151b);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, b4);
    }

    private static void N(OutputStream outputStream, e[] eVarArr) {
        O(outputStream, eVarArr);
    }

    private static void O(OutputStream outputStream, e[] eVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(eVarArr));
        arrayList.add(c(eVarArr));
        arrayList.add(d(eVarArr));
        long length2 = ((long) p.f6150a.length) + ((long) f6138a.length) + 4 + ((long) (arrayList.size() * 16));
        f.q(outputStream, (long) arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            q qVar = (q) arrayList.get(i4);
            f.q(outputStream, qVar.f6157a.getValue());
            f.q(outputStream, length2);
            if (qVar.f6160d) {
                byte[] bArr = qVar.f6159c;
                byte[] b4 = f.b(bArr);
                arrayList2.add(b4);
                f.q(outputStream, (long) b4.length);
                f.q(outputStream, (long) bArr.length);
                length = b4.length;
            } else {
                arrayList2.add(qVar.f6159c);
                f.q(outputStream, (long) qVar.f6159c.length);
                f.q(outputStream, 0);
                length = qVar.f6159c.length;
            }
            length2 += (long) length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    private static int a(e eVar) {
        int i4 = 0;
        for (Map.Entry value : eVar.f6127i.entrySet()) {
            i4 |= ((Integer) value.getValue()).intValue();
        }
        return i4;
    }

    private static byte[] b(e[] eVarArr, byte[] bArr) {
        int i4 = 0;
        int i5 = 0;
        for (e eVar : eVarArr) {
            i5 += f.k(j(eVar.f6119a, eVar.f6120b, bArr)) + 16 + (eVar.f6123e * 2) + eVar.f6124f + k(eVar.f6125g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, p.f6152c)) {
            int length = eVarArr.length;
            while (i4 < length) {
                e eVar2 = eVarArr[i4];
                G(byteArrayOutputStream, eVar2, j(eVar2.f6119a, eVar2.f6120b, bArr));
                F(byteArrayOutputStream, eVar2);
                i4++;
            }
        } else {
            for (e eVar3 : eVarArr) {
                G(byteArrayOutputStream, eVar3, j(eVar3.f6119a, eVar3.f6120b, bArr));
            }
            int length2 = eVarArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, eVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw f.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    private static q c(e[] eVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        int i5 = 0;
        while (i4 < eVarArr.length) {
            try {
                e eVar = eVarArr[i4];
                f.p(byteArrayOutputStream, i4);
                f.p(byteArrayOutputStream, eVar.f6123e);
                i5 = i5 + 4 + (eVar.f6123e * 2);
                C(byteArrayOutputStream, eVar);
                i4++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            q qVar = new q(FileSectionType.CLASSES, i5, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw f.c("Expected size " + i5 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static q d(e[] eVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        int i5 = 0;
        while (i4 < eVarArr.length) {
            try {
                e eVar = eVarArr[i4];
                int a4 = a(eVar);
                byte[] e4 = e(eVar);
                byte[] f4 = f(eVar);
                f.p(byteArrayOutputStream, i4);
                int length = e4.length + 2 + f4.length;
                f.q(byteArrayOutputStream, (long) length);
                f.p(byteArrayOutputStream, a4);
                byteArrayOutputStream.write(e4);
                byteArrayOutputStream.write(f4);
                i5 = i5 + 6 + length;
                i4++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            q qVar = new q(FileSectionType.METHODS, i5, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw f.c("Expected size " + i5 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static byte[] e(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static byte[] f(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    private static e i(e[] eVarArr, String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        String h4 = h(str);
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            if (eVarArr[i4].f6120b.equals(h4)) {
                return eVarArr[i4];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a4 = p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a4);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a4);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + p.a(bArr) + str2;
    }

    private static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    private static int l(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw f.c("HOT methods are not stored in the bitmap");
        } else if (i4 == 2) {
            return i5;
        } else {
            if (i4 == 4) {
                return i5 + i6;
            }
            throw f.c("Unexpected flag: " + i4);
        }
    }

    private static int[] m(InputStream inputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += f.h(inputStream);
            iArr[i6] = i5;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i4, int i5) {
        int i6 = 2;
        if (!bitSet.get(l(2, i4, i5))) {
            i6 = 0;
        }
        if (bitSet.get(l(4, i4, i5))) {
            return i6 | 4;
        }
        return i6;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, f.d(inputStream, bArr.length))) {
            return f.d(inputStream, p.f6151b.length);
        }
        throw f.c("Invalid magic");
    }

    private static void p(InputStream inputStream, e eVar) {
        int available = inputStream.available() - eVar.f6124f;
        int i4 = 0;
        while (inputStream.available() > available) {
            i4 += f.h(inputStream);
            eVar.f6127i.put(Integer.valueOf(i4), 1);
            for (int h4 = f.h(inputStream); h4 > 0; h4--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw f.c("Read too much data during profile line parse");
        }
    }

    static e[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, e[] eVarArr) {
        if (Arrays.equals(bArr, p.f6155f)) {
            if (!Arrays.equals(p.f6150a, bArr2)) {
                return r(inputStream, bArr, eVarArr);
            }
            throw f.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, p.f6156g)) {
            return t(inputStream, bArr2, eVarArr);
        } else {
            throw f.c("Unsupported meta version");
        }
    }

    static e[] r(InputStream inputStream, byte[] bArr, e[] eVarArr) {
        if (Arrays.equals(bArr, p.f6155f)) {
            int j4 = f.j(inputStream);
            byte[] e4 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    e[] s4 = s(byteArrayInputStream, j4, eVarArr);
                    byteArrayInputStream.close();
                    return s4;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw f.c("Content found after the end of file");
            }
        } else {
            throw f.c("Unsupported meta version");
        }
        throw th;
    }

    private static e[] s(InputStream inputStream, int i4, e[] eVarArr) {
        int i5 = 0;
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i4 == eVarArr.length) {
            String[] strArr = new String[i4];
            int[] iArr = new int[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                int h4 = f.h(inputStream);
                iArr[i6] = f.h(inputStream);
                strArr[i6] = f.f(inputStream, h4);
            }
            while (i5 < i4) {
                e eVar = eVarArr[i5];
                if (eVar.f6120b.equals(strArr[i5])) {
                    int i7 = iArr[i5];
                    eVar.f6123e = i7;
                    eVar.f6126h = m(inputStream, i7);
                    i5++;
                } else {
                    throw f.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw f.c("Mismatched number of dex files found in metadata");
    }

    static e[] t(InputStream inputStream, byte[] bArr, e[] eVarArr) {
        int h4 = f.h(inputStream);
        byte[] e4 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
            try {
                e[] u3 = u(byteArrayInputStream, bArr, h4, eVarArr);
                byteArrayInputStream.close();
                return u3;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw f.c("Content found after the end of file");
        }
        throw th;
    }

    private static e[] u(InputStream inputStream, byte[] bArr, int i4, e[] eVarArr) {
        int i5 = 0;
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i4 == eVarArr.length) {
            while (i5 < i4) {
                f.h(inputStream);
                String f4 = f.f(inputStream, f.h(inputStream));
                long i6 = f.i(inputStream);
                int h4 = f.h(inputStream);
                e i7 = i(eVarArr, f4);
                if (i7 != null) {
                    i7.f6122d = i6;
                    int[] m4 = m(inputStream, h4);
                    if (Arrays.equals(bArr, p.f6154e)) {
                        i7.f6123e = h4;
                        i7.f6126h = m4;
                    }
                    i5++;
                } else {
                    throw f.c("Missing profile key: " + f4);
                }
            }
            return eVarArr;
        }
        throw f.c("Mismatched number of dex files found in metadata");
    }

    private static void v(InputStream inputStream, e eVar) {
        BitSet valueOf = BitSet.valueOf(f.d(inputStream, f.a(eVar.f6125g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = eVar.f6125g;
            if (i4 < i5) {
                int n4 = n(valueOf, i4, i5);
                if (n4 != 0) {
                    Integer num = (Integer) eVar.f6127i.get(Integer.valueOf(i4));
                    if (num == null) {
                        num = 0;
                    }
                    eVar.f6127i.put(Integer.valueOf(i4), Integer.valueOf(n4 | num.intValue()));
                }
                i4++;
            } else {
                return;
            }
        }
    }

    static e[] w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, p.f6151b)) {
            int j4 = f.j(inputStream);
            byte[] e4 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    e[] x3 = x(byteArrayInputStream, str, j4);
                    byteArrayInputStream.close();
                    return x3;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw f.c("Content found after the end of file");
            }
        } else {
            throw f.c("Unsupported version");
        }
        throw th;
    }

    private static e[] x(InputStream inputStream, String str, int i4) {
        InputStream inputStream2 = inputStream;
        int i5 = i4;
        if (inputStream.available() == 0) {
            return new e[0];
        }
        e[] eVarArr = new e[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int h4 = f.h(inputStream);
            int h5 = f.h(inputStream);
            String str2 = str;
            int[] iArr = new int[h5];
            eVarArr[i6] = new e(str2, f.f(inputStream2, h4), f.i(inputStream), 0, h5, (int) f.i(inputStream), (int) f.i(inputStream), iArr, new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            e eVar = eVarArr[i7];
            p(inputStream2, eVar);
            eVar.f6126h = m(inputStream2, eVar.f6123e);
            v(inputStream2, eVar);
        }
        return eVarArr;
    }

    private static int y(int i4) {
        return (i4 + 7) & -8;
    }

    private static void z(byte[] bArr, int i4, int i5, e eVar) {
        int l4 = l(i4, i5, eVar.f6125g);
        int i6 = l4 / 8;
        bArr[i6] = (byte) ((1 << (l4 % 8)) | bArr[i6]);
    }
}
