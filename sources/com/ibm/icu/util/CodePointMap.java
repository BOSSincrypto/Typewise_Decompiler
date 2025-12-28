package com.ibm.icu.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class CodePointMap implements Iterable {

    public enum RangeOption {
        NORMAL,
        FIXED_LEAD_SURROGATES,
        FIXED_ALL_SURROGATES
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f13154a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f13155b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f13156c = 0;

        public int f() {
            return this.f13155b;
        }

        public int g() {
            return this.f13156c;
        }

        public void h(int i4, int i5, int i6) {
            this.f13154a = i4;
            this.f13155b = i5;
            this.f13156c = i6;
        }
    }

    private final class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private b f13157a;

        private c() {
            this.f13157a = new b();
        }

        /* renamed from: a */
        public b next() {
            if (CodePointMap.this.c(this.f13157a.f13155b + 1, (d) null, this.f13157a)) {
                return this.f13157a;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (-1 > this.f13157a.f13155b || this.f13157a.f13155b >= 1114111) {
                return false;
            }
            return true;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface d {
        int a(int i4);
    }

    protected CodePointMap() {
    }

    public boolean b(int i4, RangeOption rangeOption, int i5, d dVar, b bVar) {
        int i6;
        if (!c(i4, dVar, bVar)) {
            return false;
        }
        if (rangeOption == RangeOption.NORMAL) {
            return true;
        }
        if (rangeOption == RangeOption.FIXED_ALL_SURROGATES) {
            i6 = 57343;
        } else {
            i6 = 56319;
        }
        int a4 = bVar.f13155b;
        if (a4 >= 55295 && i4 <= i6) {
            if (bVar.f13156c == i5) {
                if (a4 >= i6) {
                    return true;
                }
            } else if (i4 <= 55295) {
                int unused = bVar.f13155b = 55295;
                return true;
            } else {
                int unused2 = bVar.f13156c = i5;
                if (a4 > i6) {
                    int unused3 = bVar.f13155b = i6;
                    return true;
                }
            }
            if (!c(i6 + 1, dVar, bVar) || bVar.f13156c != i5) {
                int unused4 = bVar.f13154a = i4;
                int unused5 = bVar.f13155b = i6;
                int unused6 = bVar.f13156c = i5;
            } else {
                int unused7 = bVar.f13154a = i4;
                return true;
            }
        }
        return true;
    }

    public abstract boolean c(int i4, d dVar, b bVar);

    public Iterator iterator() {
        return new c();
    }
}
