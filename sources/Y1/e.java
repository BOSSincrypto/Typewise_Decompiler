package Y1;

import a2.i;
import java.text.CharacterIterator;

public class e extends i {

    /* renamed from: a  reason: collision with root package name */
    private CharacterIterator f1999a;

    public e(CharacterIterator characterIterator) {
        if (characterIterator != null) {
            this.f1999a = characterIterator;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.f1999a.getIndex();
    }

    public Object clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f1999a = (CharacterIterator) this.f1999a.clone();
            return eVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int g() {
        return this.f1999a.getEndIndex() - this.f1999a.getBeginIndex();
    }

    public int j() {
        char current = this.f1999a.current();
        this.f1999a.next();
        if (current == 65535) {
            return -1;
        }
        return current;
    }

    public int l() {
        char previous = this.f1999a.previous();
        if (previous == 65535) {
            return -1;
        }
        return previous;
    }

    public void o(int i4) {
        try {
            this.f1999a.setIndex(i4);
        } catch (IllegalArgumentException unused) {
            throw new IndexOutOfBoundsException();
        }
    }
}
