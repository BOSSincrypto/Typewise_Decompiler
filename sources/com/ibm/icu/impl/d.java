package com.ibm.icu.impl;

import Y1.g;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.uuid.Uuid;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final List f12675a;

    public interface b {
        boolean a(byte[] bArr);
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private static final a f12676a = new a();

        private static final class a implements b {
            private a() {
            }

            public boolean a(byte[] bArr) {
                if (bArr[0] == 1) {
                    return true;
                }
                return false;
            }
        }

        static boolean a(ByteBuffer byteBuffer, int i4, String str, String str2, StringBuilder sb, Set set) {
            int f4 = f(byteBuffer, i4) + 9;
            if (str.length() != 0) {
                int i5 = 0;
                while (i5 < str.length()) {
                    if (byteBuffer.get(f4) != str.charAt(i5)) {
                        return false;
                    }
                    i5++;
                    f4++;
                }
                int i6 = f4 + 1;
                if (byteBuffer.get(f4) != 47) {
                    return false;
                }
                f4 = i6;
            }
            sb.setLength(0);
            while (true) {
                int i7 = f4 + 1;
                byte b4 = byteBuffer.get(f4);
                if (b4 != 0) {
                    char c4 = (char) b4;
                    if (c4 == '/') {
                        return true;
                    }
                    sb.append(c4);
                    f4 = i7;
                } else {
                    int length = sb.length() - str2.length();
                    if (sb.lastIndexOf(str2, length) >= 0) {
                        set.add(sb.substring(0, length));
                    }
                    return true;
                }
            }
        }

        static void b(ByteBuffer byteBuffer, String str, String str2, Set set) {
            int c4 = c(byteBuffer, str);
            if (c4 < 0) {
                c4 = ~c4;
            }
            int i4 = byteBuffer.getInt(byteBuffer.position());
            StringBuilder sb = new StringBuilder();
            while (c4 < i4 && a(byteBuffer, c4, str, str2, sb, set)) {
                c4++;
            }
        }

        private static int c(ByteBuffer byteBuffer, CharSequence charSequence) {
            int i4 = byteBuffer.getInt(byteBuffer.position());
            int i5 = 0;
            while (i5 < i4) {
                int i6 = (i5 + i4) >>> 1;
                int e4 = d.e(charSequence, byteBuffer, f(byteBuffer, i6) + 9);
                if (e4 < 0) {
                    i4 = i6;
                } else if (e4 <= 0) {
                    return i6;
                } else {
                    i5 = i6 + 1;
                }
            }
            return ~i5;
        }

        static ByteBuffer d(ByteBuffer byteBuffer, CharSequence charSequence) {
            int c4 = c(byteBuffer, charSequence);
            if (c4 < 0) {
                return null;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(e(byteBuffer, c4));
            duplicate.limit(e(byteBuffer, c4 + 1));
            return d.v(duplicate);
        }

        private static int e(ByteBuffer byteBuffer, int i4) {
            int position = byteBuffer.position();
            if (i4 == byteBuffer.getInt(position)) {
                return byteBuffer.capacity();
            }
            return position + byteBuffer.getInt(position + 8 + (i4 * 8));
        }

        private static int f(ByteBuffer byteBuffer, int i4) {
            int position = byteBuffer.position();
            return position + byteBuffer.getInt(position + 4 + (i4 * 8));
        }

        private static boolean g(ByteBuffer byteBuffer, int i4) {
            for (int i5 = 0; i5 < 7; i5++) {
                if (byteBuffer.get(i4 + i5) != "icudt71b".charAt(i5)) {
                    return false;
                }
            }
            byte b4 = byteBuffer.get(i4 + 7);
            if ((b4 == 98 || b4 == 108) && byteBuffer.get(i4 + 8) == 47) {
                return true;
            }
            return false;
        }

        static boolean h(ByteBuffer byteBuffer) {
            try {
                d.s(byteBuffer, 1131245124, f12676a);
                int i4 = byteBuffer.getInt(byteBuffer.position());
                if (i4 > 0 && byteBuffer.position() + 4 + (i4 * 24) <= byteBuffer.capacity() && g(byteBuffer, f(byteBuffer, 0)) && g(byteBuffer, f(byteBuffer, i4 - 1))) {
                    return true;
                }
                return false;
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.ibm.icu.impl.d$d  reason: collision with other inner class name */
    private static abstract class C0174d {

        /* renamed from: a  reason: collision with root package name */
        protected final String f12677a;

        C0174d(String str) {
            this.f12677a = str;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(String str, String str2, Set set);

        /* access modifiers changed from: package-private */
        public abstract ByteBuffer b(String str);

        public String toString() {
            return this.f12677a;
        }
    }

    private static final class e extends C0174d {

        /* renamed from: b  reason: collision with root package name */
        private final ByteBuffer f12678b;

        e(String str, ByteBuffer byteBuffer) {
            super(str);
            this.f12678b = byteBuffer;
        }

        /* access modifiers changed from: package-private */
        public void a(String str, String str2, Set set) {
            c.b(this.f12678b, str, str2, set);
        }

        /* access modifiers changed from: package-private */
        public ByteBuffer b(String str) {
            return c.d(this.f12678b, str);
        }
    }

    private static final class f extends C0174d {

        /* renamed from: b  reason: collision with root package name */
        private final File f12679b;

        f(String str, File file) {
            super(str);
            this.f12679b = file;
        }

        /* access modifiers changed from: package-private */
        public void a(String str, String str2, Set set) {
            if (this.f12677a.length() > str.length() + str2.length() && this.f12677a.startsWith(str) && this.f12677a.endsWith(str2) && this.f12677a.charAt(str.length()) == '/' && this.f12677a.indexOf(47, str.length() + 1) < 0) {
                set.add(this.f12677a.substring(str.length() + 1, this.f12677a.length() - str2.length()));
            }
        }

        /* access modifiers changed from: package-private */
        public ByteBuffer b(String str) {
            if (str.equals(this.f12677a)) {
                return d.r(this.f12679b);
            }
            return null;
        }

        public String toString() {
            return this.f12679b.toString();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f12675a = arrayList;
        String a4 = g.a(d.class.getName() + ".dataPath");
        if (a4 != null) {
            d(a4, arrayList);
        }
    }

    public static void b(String str, String str2, Set set) {
        for (C0174d a4 : f12675a) {
            a4.a(str, str2, set);
        }
    }

    private static void c(File file, StringBuilder sb, List list) {
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int length = sb.length();
            if (length > 0) {
                sb.append('/');
                length++;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!name.endsWith(".txt")) {
                    sb.append(name);
                    if (file2.isDirectory()) {
                        c(file2, sb, list);
                    } else if (name.endsWith(".dat")) {
                        ByteBuffer r4 = r(file2);
                        if (r4 != null && c.h(r4)) {
                            list.add(new e(sb.toString(), r4));
                        }
                    } else {
                        list.add(new f(sb.toString(), file2));
                    }
                    sb.setLength(length);
                }
            }
        }
    }

    private static void d(String str, List list) {
        int i4;
        int i5 = 0;
        while (i5 < str.length()) {
            int indexOf = str.indexOf(File.pathSeparatorChar, i5);
            if (indexOf >= 0) {
                i4 = indexOf;
            } else {
                i4 = str.length();
            }
            String trim = str.substring(i5, i4).trim();
            if (trim.endsWith(File.separator)) {
                trim = trim.substring(0, trim.length() - 1);
            }
            if (trim.length() != 0) {
                c(new File(trim), new StringBuilder(), f12675a);
            }
            if (indexOf >= 0) {
                i5 = indexOf + 1;
            } else {
                return;
            }
        }
    }

    static int e(CharSequence charSequence, ByteBuffer byteBuffer, int i4) {
        int i5 = 0;
        while (true) {
            byte b4 = byteBuffer.get(i4);
            if (b4 == 0) {
                if (i5 == charSequence.length()) {
                    return 0;
                }
                return 1;
            } else if (i5 == charSequence.length()) {
                return -1;
            } else {
                int charAt = charSequence.charAt(i5) - b4;
                if (charAt != 0) {
                    return charAt;
                }
                i5++;
                i4++;
            }
        }
    }

    static int f(CharSequence charSequence, byte[] bArr, int i4) {
        int i5 = 0;
        while (true) {
            byte b4 = bArr[i4];
            if (b4 == 0) {
                if (i5 == charSequence.length()) {
                    return 0;
                }
                return 1;
            } else if (i5 == charSequence.length()) {
                return -1;
            } else {
                int charAt = charSequence.charAt(i5) - b4;
                if (charAt != 0) {
                    return charAt;
                }
                i5++;
                i4++;
            }
        }
    }

    public static ByteBuffer g(InputStream inputStream) {
        byte[] bArr;
        try {
            int available = inputStream.available();
            if (available > 32) {
                bArr = new byte[available];
            } else {
                bArr = new byte[Uuid.SIZE_BITS];
            }
            int i4 = 0;
            while (true) {
                if (i4 < bArr.length) {
                    int read = inputStream.read(bArr, i4, bArr.length - i4);
                    if (read < 0) {
                        break;
                    }
                    i4 += read;
                } else {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        break;
                    }
                    int length = bArr.length;
                    int i5 = length * 2;
                    if (i5 < 128) {
                        i5 = 128;
                    } else if (i5 < 16384) {
                        i5 = length * 4;
                    }
                    bArr = Arrays.copyOf(bArr, i5);
                    int i6 = i4 + 1;
                    bArr[i4] = (byte) read2;
                    i4 = i6;
                }
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i4);
            inputStream.close();
            return wrap;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static byte[] h(ByteBuffer byteBuffer, int i4, int i5) {
        byte[] bArr = new byte[i4];
        byteBuffer.get(bArr);
        if (i5 > 0) {
            u(byteBuffer, i5);
        }
        return bArr;
    }

    public static char[] i(ByteBuffer byteBuffer, int i4, int i5) {
        char[] cArr = new char[i4];
        byteBuffer.asCharBuffer().get(cArr);
        u(byteBuffer, (i4 * 2) + i5);
        return cArr;
    }

    public static ByteBuffer j(ClassLoader classLoader, String str, String str2) {
        return k(classLoader, str, str2, false);
    }

    private static ByteBuffer k(ClassLoader classLoader, String str, String str2, boolean z3) {
        ByteBuffer m4 = m(str2);
        if (m4 != null) {
            return m4;
        }
        if (classLoader == null) {
            classLoader = Y1.f.c(e.class);
        }
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt71b/" + str2;
        }
        try {
            InputStream d4 = e.d(classLoader, str, z3);
            if (d4 == null) {
                return null;
            }
            return g(d4);
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    public static ByteBuffer l(String str) {
        return k((ClassLoader) null, (String) null, str, false);
    }

    private static ByteBuffer m(String str) {
        for (C0174d b4 : f12675a) {
            ByteBuffer b5 = b4.b(str);
            if (b5 != null) {
                return b5;
            }
        }
        return null;
    }

    public static int[] n(ByteBuffer byteBuffer, int i4, int i5) {
        int[] iArr = new int[i4];
        byteBuffer.asIntBuffer().get(iArr);
        u(byteBuffer, (i4 * 4) + i5);
        return iArr;
    }

    public static ByteBuffer o(String str) {
        return k((ClassLoader) null, (String) null, str, true);
    }

    public static String p(ByteBuffer byteBuffer, int i4, int i5) {
        String charSequence = byteBuffer.asCharBuffer().subSequence(0, i4).toString();
        u(byteBuffer, (i4 * 2) + i5);
        return charSequence;
    }

    public static h q(int i4) {
        return h.c(i4 >>> 24, (i4 >> 16) & 255, (i4 >> 8) & 255, i4 & 255);
    }

    /* access modifiers changed from: private */
    public static ByteBuffer r(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (FileNotFoundException e4) {
            System.err.println(e4);
            return null;
        } catch (IOException e5) {
            System.err.println(e5);
            return null;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static int s(ByteBuffer byteBuffer, int i4, b bVar) {
        ByteOrder byteOrder;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i5 = i4;
        b bVar2 = bVar;
        byte b4 = byteBuffer2.get(2);
        byte b5 = byteBuffer2.get(3);
        if (b4 == -38 && b5 == 39) {
            byte b6 = byteBuffer2.get(8);
            byte b7 = byteBuffer2.get(9);
            byte b8 = byteBuffer2.get(10);
            if (b6 < 0 || 1 < b6 || b7 != 0 || b8 != 2) {
                throw new IOException("ICU data file error: Header authentication failed, please check if you have a valid ICU data file");
            }
            if (b6 != 0) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer2.order(byteOrder);
            char c4 = byteBuffer2.getChar(0);
            char c5 = byteBuffer2.getChar(4);
            if (c5 < 20 || c4 < c5 + 4) {
                throw new IOException("Internal Error: Header size error");
            }
            byte[] bArr = {byteBuffer2.get(16), byteBuffer2.get(17), byteBuffer2.get(18), byteBuffer2.get(19)};
            if (byteBuffer2.get(12) == ((byte) (i5 >> 24)) && byteBuffer2.get(13) == ((byte) (i5 >> 16)) && byteBuffer2.get(14) == ((byte) (i5 >> 8)) && byteBuffer2.get(15) == ((byte) i5) && (bVar2 == null || bVar2.a(bArr))) {
                byteBuffer2.position(c4);
                return (byteBuffer2.get(23) & 255) | (byteBuffer2.get(20) << 24) | ((byteBuffer2.get(21) & 255) << 16) | ((byteBuffer2.get(22) & 255) << 8);
            }
            throw new IOException("ICU data file error: Header authentication failed, please check if you have a valid ICU data file" + String.format("; data format %02x%02x%02x%02x, format version %d.%d.%d.%d", new Object[]{Byte.valueOf(byteBuffer2.get(12)), Byte.valueOf(byteBuffer2.get(13)), Byte.valueOf(byteBuffer2.get(14)), Byte.valueOf(byteBuffer2.get(15)), Integer.valueOf(bArr[0] & 255), Integer.valueOf(bArr[1] & 255), Integer.valueOf(bArr[2] & 255), Integer.valueOf(bArr[3] & 255)}));
        }
        throw new IOException("ICU data file error: Not an ICU data file");
    }

    public static h t(ByteBuffer byteBuffer, int i4, b bVar) {
        return q(s(byteBuffer, i4, bVar));
    }

    public static void u(ByteBuffer byteBuffer, int i4) {
        if (i4 > 0) {
            byteBuffer.position(byteBuffer.position() + i4);
        }
    }

    public static ByteBuffer v(ByteBuffer byteBuffer) {
        return byteBuffer.slice().order(byteBuffer.order());
    }
}
