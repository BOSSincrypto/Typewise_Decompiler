package a2;

import Y1.e;
import Y1.p;
import java.text.CharacterIterator;

public abstract class i implements Cloneable {
    protected i() {
    }

    public static final i c(String str) {
        return new p(str);
    }

    public static final i d(CharacterIterator characterIterator) {
        return new e(characterIterator);
    }

    public abstract int b();

    public Object clone() {
        return super.clone();
    }

    public abstract int g();

    public int i(int i4) {
        if (i4 > 0) {
            while (i4 > 0 && k() != -1) {
                i4--;
            }
        } else {
            while (i4 < 0 && n() != -1) {
                i4++;
            }
        }
        if (i4 == 0) {
            return b();
        }
        throw new IndexOutOfBoundsException();
    }

    public abstract int j();

    public int k() {
        int j4 = j();
        if (j.g(j4)) {
            int j5 = j();
            if (j.i(j5)) {
                return Character.toCodePoint((char) j4, (char) j5);
            }
            if (j5 != -1) {
                l();
            }
        }
        return j4;
    }

    public abstract int l();

    public int n() {
        int l4 = l();
        if (j.i(l4)) {
            int l5 = l();
            if (j.g(l5)) {
                return Character.toCodePoint((char) l5, (char) l4);
            }
            if (l5 != -1) {
                j();
            }
        }
        return l4;
    }

    public abstract void o(int i4);
}
