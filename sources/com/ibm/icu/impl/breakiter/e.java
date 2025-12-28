package com.ibm.icu.impl.breakiter;

import Y1.d;
import com.ibm.icu.text.UnicodeSet;
import java.text.CharacterIterator;

public abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    UnicodeSet f12646a = new UnicodeSet();

    public static class a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private int[] f12647a = new int[50];

        /* renamed from: b  reason: collision with root package name */
        private int f12648b = 4;

        /* renamed from: c  reason: collision with root package name */
        private int f12649c = 4;

        private void c() {
            int[] iArr = this.f12647a;
            int[] iArr2 = new int[(iArr.length * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f12647a = iArr2;
        }

        public int b(int i4) {
            return this.f12647a[this.f12648b + i4];
        }

        public Object clone() {
            a aVar = (a) super.clone();
            aVar.f12647a = (int[]) this.f12647a.clone();
            return aVar;
        }

        public boolean d() {
            if (n() == 0) {
                return true;
            }
            return false;
        }

        public void g(int i4) {
            int[] iArr = this.f12647a;
            int i5 = this.f12648b - 1;
            this.f12648b = i5;
            iArr[i5] = i4;
        }

        public int i() {
            return this.f12647a[this.f12649c - 1];
        }

        public int j() {
            int[] iArr = this.f12647a;
            int i4 = this.f12649c - 1;
            this.f12649c = i4;
            return iArr[i4];
        }

        public void k(int i4) {
            if (this.f12649c >= this.f12647a.length) {
                c();
            }
            int[] iArr = this.f12647a;
            int i5 = this.f12649c;
            this.f12649c = i5 + 1;
            iArr[i5] = i4;
        }

        public void l() {
            this.f12649c = 4;
            this.f12648b = 4;
        }

        public int n() {
            return this.f12649c - this.f12648b;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private int[] f12650a = new int[20];

        /* renamed from: b  reason: collision with root package name */
        private int[] f12651b = new int[1];

        /* renamed from: c  reason: collision with root package name */
        private int f12652c;

        /* renamed from: d  reason: collision with root package name */
        private int f12653d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f12654e;

        /* renamed from: f  reason: collision with root package name */
        private int f12655f;

        public int a(CharacterIterator characterIterator) {
            characterIterator.setIndex(this.f12653d + this.f12650a[this.f12654e]);
            return this.f12650a[this.f12654e];
        }

        public boolean b(CharacterIterator characterIterator) {
            int i4 = this.f12655f;
            if (i4 <= 0) {
                return false;
            }
            int i5 = this.f12653d;
            int[] iArr = this.f12650a;
            int i6 = i4 - 1;
            this.f12655f = i6;
            characterIterator.setIndex(i5 + iArr[i6]);
            return true;
        }

        public int c(CharacterIterator characterIterator, g gVar, int i4) {
            int index = characterIterator.getIndex();
            if (index != this.f12653d) {
                this.f12653d = index;
                int[] iArr = this.f12650a;
                this.f12652c = gVar.a(characterIterator, i4 - index, iArr, this.f12651b, iArr.length);
                if (this.f12651b[0] <= 0) {
                    characterIterator.setIndex(index);
                }
            }
            int i5 = this.f12651b[0];
            if (i5 > 0) {
                characterIterator.setIndex(index + this.f12650a[i5 - 1]);
            }
            int i6 = this.f12651b[0];
            int i7 = i6 - 1;
            this.f12655f = i7;
            this.f12654e = i7;
            return i6;
        }

        public int d() {
            return this.f12652c;
        }

        public void e() {
            this.f12654e = this.f12655f;
        }
    }

    public int a(CharacterIterator characterIterator, int i4, int i5, a aVar, boolean z3) {
        int index;
        int index2 = characterIterator.getIndex();
        int a4 = d.a(characterIterator);
        while (true) {
            index = characterIterator.getIndex();
            if (index >= i5 || !this.f12646a.S(a4)) {
                int c4 = c(characterIterator, index2, index, aVar, z3);
                characterIterator.setIndex(index);
            } else {
                d.b(characterIterator);
                a4 = d.a(characterIterator);
            }
        }
        int c42 = c(characterIterator, index2, index, aVar, z3);
        characterIterator.setIndex(index);
        return c42;
    }

    public boolean b(int i4) {
        return this.f12646a.S(i4);
    }

    /* access modifiers changed from: package-private */
    public abstract int c(CharacterIterator characterIterator, int i4, int i5, a aVar, boolean z3);

    /* access modifiers changed from: package-private */
    public void d(UnicodeSet unicodeSet) {
        UnicodeSet unicodeSet2 = new UnicodeSet(unicodeSet);
        this.f12646a = unicodeSet2;
        unicodeSet2.K();
    }
}
