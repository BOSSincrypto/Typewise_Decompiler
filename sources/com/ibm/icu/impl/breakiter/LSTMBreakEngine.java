package com.ibm.icu.impl.breakiter;

import a2.C0359a;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.breakiter.e;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.UResourceBundle;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LSTMBreakEngine extends e {

    /* renamed from: b  reason: collision with root package name */
    private final d f12612b;

    /* renamed from: c  reason: collision with root package name */
    private int f12613c;

    /* renamed from: d  reason: collision with root package name */
    private final e f12614d;

    public enum EmbeddingType {
        UNKNOWN,
        CODE_POINTS,
        GRAPHEME_CLUSTER
    }

    public enum LSTMClass {
        BEGIN,
        INSIDE,
        END,
        SINGLE
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12617a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ibm.icu.impl.breakiter.LSTMBreakEngine$EmbeddingType[] r0 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.EmbeddingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12617a = r0
                com.ibm.icu.impl.breakiter.LSTMBreakEngine$EmbeddingType r1 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.EmbeddingType.CODE_POINTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12617a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.impl.breakiter.LSTMBreakEngine$EmbeddingType r1 = com.ibm.icu.impl.breakiter.LSTMBreakEngine.EmbeddingType.GRAPHEME_CLUSTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.breakiter.LSTMBreakEngine.a.<clinit>():void");
        }
    }

    class b extends e {
        public b(Map map) {
            super(map);
        }

        public void b(CharacterIterator characterIterator, int i4, int i5, List list, List list2) {
            characterIterator.setIndex(i4);
            char current = characterIterator.current();
            while (current != 65535 && characterIterator.getIndex() < i5) {
                list.add(Integer.valueOf(characterIterator.getIndex()));
                list2.add(Integer.valueOf(a(String.valueOf(current))));
                current = characterIterator.next();
            }
        }
    }

    class c extends e {
        public c(Map map) {
            super(map);
        }

        private String c(CharacterIterator characterIterator, int i4, int i5) {
            int index = characterIterator.getIndex();
            characterIterator.setIndex(i4);
            StringBuilder sb = new StringBuilder();
            char current = characterIterator.current();
            while (current != 65535 && characterIterator.getIndex() < i5) {
                sb.append(current);
                current = characterIterator.next();
            }
            characterIterator.setIndex(index);
            return sb.toString();
        }

        public void b(CharacterIterator characterIterator, int i4, int i5, List list, List list2) {
            C0359a g4 = C0359a.g();
            g4.u(characterIterator);
            int p4 = g4.p(i4);
            while (true) {
                int i6 = p4;
                p4 = g4.o();
                if (p4 != -1 && p4 <= i5) {
                    list.add(Integer.valueOf(i6));
                    list2.add(Integer.valueOf(a(c(characterIterator, i6, p4))));
                } else {
                    return;
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public EmbeddingType f12620a = EmbeddingType.UNKNOWN;

        /* renamed from: b  reason: collision with root package name */
        public String f12621b;

        /* renamed from: c  reason: collision with root package name */
        public Map f12622c;

        /* renamed from: d  reason: collision with root package name */
        public float[][] f12623d;

        /* renamed from: e  reason: collision with root package name */
        public float[][] f12624e;

        /* renamed from: f  reason: collision with root package name */
        public float[][] f12625f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f12626g;

        /* renamed from: h  reason: collision with root package name */
        public float[][] f12627h;

        /* renamed from: i  reason: collision with root package name */
        public float[][] f12628i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f12629j;

        /* renamed from: k  reason: collision with root package name */
        public float[][] f12630k;

        /* renamed from: l  reason: collision with root package name */
        public float[] f12631l;

        public d(UResourceBundle uResourceBundle) {
            int i4 = uResourceBundle.c("embeddings").i();
            int i5 = uResourceBundle.c("hunits").i();
            this.f12621b = uResourceBundle.c("model").q();
            String q4 = uResourceBundle.c("type").q();
            if (q4.equals("codepoints")) {
                this.f12620a = EmbeddingType.CODE_POINTS;
            } else if (q4.equals("graphclust")) {
                this.f12620a = EmbeddingType.GRAPHEME_CLUSTER;
            }
            String[] s4 = uResourceBundle.c("dict").s();
            int[] j4 = uResourceBundle.c("data").j();
            int length = j4.length;
            int length2 = s4.length + 1;
            this.f12622c = new HashMap(length2);
            int length3 = s4.length;
            int i6 = 0;
            int i7 = 0;
            while (i6 < length3) {
                this.f12622c.put(s4[i6], Integer.valueOf(i7));
                i6++;
                i7++;
            }
            int i8 = length2 * i4;
            int i9 = i4 * 4 * i5;
            int i10 = i5 * 4;
            int i11 = i10 * i5;
            this.f12623d = LSTMBreakEngine.p(j4, 0, length2, i4);
            this.f12624e = LSTMBreakEngine.p(j4, i8, i4, i10);
            int i12 = i8 + i9;
            this.f12625f = LSTMBreakEngine.p(j4, i12, i5, i10);
            int i13 = i12 + i11;
            this.f12626g = LSTMBreakEngine.o(j4, i13, i10);
            int i14 = i13 + i10;
            this.f12627h = LSTMBreakEngine.p(j4, i14, i4, i10);
            int i15 = i14 + i9;
            this.f12628i = LSTMBreakEngine.p(j4, i15, i5, i10);
            int i16 = i15 + i11;
            this.f12629j = LSTMBreakEngine.o(j4, i16, i10);
            int i17 = i16 + i10;
            this.f12630k = LSTMBreakEngine.p(j4, i17, i5 * 2, 4);
            this.f12631l = LSTMBreakEngine.o(j4, i17 + (i5 * 8), 4);
        }
    }

    abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private Map f12632a;

        public e(Map map) {
            this.f12632a = map;
        }

        /* access modifiers changed from: protected */
        public int a(String str) {
            Integer num = (Integer) this.f12632a.get(str);
            if (num == null) {
                return this.f12632a.size();
            }
            return num.intValue();
        }

        public abstract void b(CharacterIterator characterIterator, int i4, int i5, List list, List list2);
    }

    public LSTMBreakEngine(int i4, UnicodeSet unicodeSet, d dVar) {
        d(unicodeSet);
        this.f12613c = i4;
        this.f12612b = dVar;
        this.f12614d = q(dVar);
    }

    private static void g(float[] fArr, float[][] fArr2, float[] fArr3) {
        for (int i4 = 0; i4 < fArr3.length; i4++) {
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr3[i4] = fArr3[i4] + (fArr[i5] * fArr2[i5][i4]);
            }
        }
    }

    private static void h(float[] fArr, float[] fArr2, float[] fArr3) {
        for (int i4 = 0; i4 < fArr3.length; i4++) {
            fArr3[i4] = fArr3[i4] + (fArr[i4] * fArr2[i4]);
        }
    }

    private float[] i(float[][] fArr, float[][] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6) {
        float[] copyOf = Arrays.copyOf(fArr3, fArr3.length);
        g(fArr4, fArr, copyOf);
        float[] fArr7 = new float[fArr3.length];
        g(fArr5, fArr2, copyOf);
        int length = fArr3.length / 4;
        s(copyOf, 0, length);
        s(copyOf, length, length);
        int i4 = length * 2;
        t(copyOf, i4, length);
        int i5 = length * 3;
        s(copyOf, i5, length);
        n(Arrays.copyOfRange(copyOf, length, i4), fArr6);
        h(Arrays.copyOf(copyOf, length), Arrays.copyOfRange(copyOf, i4, i5), fArr6);
        float[] copyOf2 = Arrays.copyOf(fArr6, fArr6.length);
        t(copyOf2, 0, copyOf2.length);
        n(Arrays.copyOfRange(copyOf, i5, length * 4), copyOf2);
        return copyOf2;
    }

    public static LSTMBreakEngine j(int i4, d dVar) {
        UnicodeSet unicodeSet = new UnicodeSet();
        unicodeSet.A("[[:" + UScript.c(i4) + ":]&[:LineBreak=SA:]]");
        unicodeSet.K();
        return new LSTMBreakEngine(i4, unicodeSet, dVar);
    }

    public static d k(int i4) {
        if (i4 != 23 && i4 != 24 && i4 != 28 && i4 != 38) {
            return null;
        }
        String m4 = m(i4);
        return l(UResourceBundle.g("com/ibm/icu/impl/data/icudt71b/brkitr", m4.substring(0, m4.indexOf(".")), ICUResourceBundle.f12538e));
    }

    public static d l(UResourceBundle uResourceBundle) {
        return new d(uResourceBundle);
    }

    private static String m(int i4) {
        return ((ICUResourceBundle) UResourceBundle.e("com/ibm/icu/impl/data/icudt71b/brkitr")).p0("lstm/" + UScript.c(i4));
    }

    private static void n(float[] fArr, float[] fArr2) {
        for (int i4 = 0; i4 < fArr2.length; i4++) {
            fArr2[i4] = fArr2[i4] * fArr[i4];
        }
    }

    /* access modifiers changed from: private */
    public static float[] o(int[] iArr, int i4, int i5) {
        float[] fArr = new float[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i4 + 1;
            int i8 = iArr[i4];
            fArr[i6] = ByteBuffer.wrap(new byte[]{(byte) (i8 >> 24), (byte) (i8 >> 16), (byte) (i8 >> 8), (byte) i8}).order(ByteOrder.BIG_ENDIAN).getFloat();
            i6++;
            i4 = i7;
        }
        return fArr;
    }

    /* access modifiers changed from: private */
    public static float[][] p(int[] iArr, int i4, int i5, int i6) {
        int[] iArr2 = new int[2];
        iArr2[1] = i6;
        iArr2[0] = i5;
        float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, iArr2);
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = 0;
            while (i8 < i6) {
                int i9 = i4 + 1;
                int i10 = iArr[i4];
                fArr[i7][i8] = ByteBuffer.wrap(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}).order(ByteOrder.BIG_ENDIAN).getFloat();
                i8++;
                i4 = i9;
            }
        }
        return fArr;
    }

    private e q(d dVar) {
        int i4 = a.f12617a[dVar.f12620a.ordinal()];
        if (i4 == 1) {
            return new b(dVar.f12622c);
        }
        if (i4 != 2) {
            return null;
        }
        return new c(dVar.f12622c);
    }

    private static int r(float[] fArr) {
        int i4 = 0;
        float f4 = fArr[0];
        for (int i5 = 1; i5 < fArr.length; i5++) {
            float f5 = fArr[i5];
            if (f5 > f4) {
                i4 = i5;
                f4 = f5;
            }
        }
        return i4;
    }

    private static void s(float[] fArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            fArr[i6] = (float) (1.0d / (Math.exp((double) (-fArr[i6])) + 1.0d));
        }
    }

    private static void t(float[] fArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            fArr[i6] = (float) Math.tanh((double) fArr[i6]);
        }
    }

    public boolean b(int i4) {
        if (this.f12613c == Z1.c.h(i4, 4106)) {
            return true;
        }
        return false;
    }

    public int c(CharacterIterator characterIterator, int i4, int i5, e.a aVar, boolean z3) {
        int n4 = aVar.n();
        int i6 = i5 - i4;
        if (i6 < 4) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(i6);
        ArrayList arrayList2 = new ArrayList(i6);
        this.f12614d.b(characterIterator, i4, i5, arrayList, arrayList2);
        int size = arrayList2.size();
        int length = this.f12612b.f12625f.length;
        float[] fArr = new float[length];
        int[] iArr = new int[2];
        iArr[1] = length;
        iArr[0] = size;
        float[][] fArr2 = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i7 = size - 1;
        int i8 = i7;
        while (i8 >= 0) {
            if (i8 != i7) {
                fArr2[i8] = Arrays.copyOf(fArr2[i8 + 1], length);
            }
            d dVar = this.f12612b;
            int i9 = i8;
            fArr2[i9] = i(dVar.f12627h, dVar.f12628i, dVar.f12629j, dVar.f12623d[((Integer) arrayList2.get(i8)).intValue()], fArr2[i8], fArr);
            i8 = i9 - 1;
            i7 = i7;
        }
        float[] fArr3 = new float[length];
        float[] fArr4 = new float[(length * 2)];
        float[] fArr5 = new float[length];
        int i10 = 0;
        while (i10 < size) {
            d dVar2 = this.f12612b;
            float[][] fArr6 = dVar2.f12624e;
            float[][] fArr7 = dVar2.f12625f;
            float[] fArr8 = dVar2.f12626g;
            float[] fArr9 = dVar2.f12623d[((Integer) arrayList2.get(i10)).intValue()];
            ArrayList arrayList3 = arrayList2;
            float[] fArr10 = fArr4;
            fArr5 = i(fArr6, fArr7, fArr8, fArr9, fArr5, fArr3);
            System.arraycopy(fArr5, 0, fArr10, 0, length);
            int i11 = i10;
            System.arraycopy(fArr2[i11], 0, fArr10, length, length);
            float[] fArr11 = this.f12612b.f12631l;
            float[] copyOf = Arrays.copyOf(fArr11, fArr11.length);
            g(fArr10, this.f12612b.f12630k, copyOf);
            int r4 = r(copyOf);
            if ((r4 == LSTMClass.BEGIN.ordinal() || r4 == LSTMClass.SINGLE.ordinal()) && i11 != 0) {
                aVar.k(((Integer) arrayList.get(i11)).intValue());
            } else {
                e.a aVar2 = aVar;
            }
            i10 = i11 + 1;
            fArr4 = fArr10;
            arrayList2 = arrayList3;
        }
        e.a aVar3 = aVar;
        return aVar.n() - n4;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
