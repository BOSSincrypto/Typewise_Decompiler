package Y1;

import a2.j;
import java.text.CharacterIterator;

public abstract class d {
    public static int a(CharacterIterator characterIterator) {
        char current = characterIterator.current();
        if (current < 55296) {
            return current;
        }
        if (j.g(current)) {
            char next = characterIterator.next();
            characterIterator.previous();
            if (j.i(next)) {
                return 65536 + ((current - 55296) << 10) + (next - 56320);
            }
            return current;
        } else if (current != 65535 || characterIterator.getIndex() < characterIterator.getEndIndex()) {
            return current;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static int b(CharacterIterator characterIterator) {
        char next;
        char current = characterIterator.current();
        if (current >= 55296 && current <= 56319 && ((next = characterIterator.next()) < 56320 || next > 57343)) {
            characterIterator.previous();
        }
        int next2 = characterIterator.next();
        if (next2 >= 55296) {
            next2 = c(characterIterator, next2);
        }
        if (next2 >= 65536 && next2 != Integer.MAX_VALUE) {
            characterIterator.previous();
        }
        return next2;
    }

    public static int c(CharacterIterator characterIterator, int i4) {
        if (i4 == 65535 && characterIterator.getIndex() >= characterIterator.getEndIndex()) {
            return Integer.MAX_VALUE;
        }
        if (i4 > 56319) {
            return i4;
        }
        char next = characterIterator.next();
        if (j.i(next)) {
            return 65536 + ((i4 - 55296) << 10) + (next - 56320);
        }
        characterIterator.previous();
        return i4;
    }

    public static int d(CharacterIterator characterIterator) {
        if (characterIterator.getIndex() <= characterIterator.getBeginIndex()) {
            return Integer.MAX_VALUE;
        }
        char previous = characterIterator.previous();
        if (!j.i(previous) || characterIterator.getIndex() <= characterIterator.getBeginIndex()) {
            return previous;
        }
        char previous2 = characterIterator.previous();
        if (j.g(previous2)) {
            return 65536 + ((previous2 - 55296) << 10) + (previous - 56320);
        }
        characterIterator.next();
        return previous;
    }
}
