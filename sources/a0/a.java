package A0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.C0721a;
import kotlin.text.CharCategory;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0000a f4a = new C0000a((i) null);

    /* renamed from: A0.a$a  reason: collision with other inner class name */
    public static final class C0000a {
        private C0000a() {
        }

        public final int a(CharSequence charSequence, int i4, int i5) {
            char charAt;
            o.e(charSequence, "cs");
            int i6 = 0;
            if (i4 < 0) {
                return 0;
            }
            if ((i5 & 4096) != 0) {
                i6 = 4096;
            }
            if ((i5 & 24576) == 0) {
                return i6;
            }
            while (i4 > 0 && ((r3 = charSequence.charAt(i4 - 1)) == '\"' || r3 == '\'' || C0721a.c(r3) == CharCategory.START_PUNCTUATION)) {
                i4--;
            }
            int i7 = i4;
            while (i7 > 0) {
                char charAt2 = charSequence.charAt(i7 - 1);
                if (charAt2 != ' ' && charAt2 != 9) {
                    break;
                }
                i7--;
            }
            if (i7 == 0 || charSequence.charAt(i7 - 1) == 10) {
                return i6 | 8192;
            }
            if ((i5 & 16384) == 0) {
                if (i4 != i7) {
                    return i6 | 8192;
                }
                return i6;
            } else if (i4 == i7) {
                return i6;
            } else {
                while (i7 > 0) {
                    char charAt3 = charSequence.charAt(i7 - 1);
                    if (charAt3 != '\"' && charAt3 != '\'' && C0721a.c(charAt3) != CharCategory.END_PUNCTUATION) {
                        break;
                    }
                    i7--;
                }
                if (i7 <= 0 || ((charAt = charSequence.charAt(i7 - 1)) != '.' && charAt != '?' && charAt != '!')) {
                    return i6;
                }
                if (charAt == '.') {
                    for (int i8 = i7 - 2; -1 < i8; i8--) {
                        char charAt4 = charSequence.charAt(i8);
                        if (charAt4 == '.') {
                            return i6;
                        }
                        if (!Character.isLetter(charAt4)) {
                            break;
                        }
                    }
                }
                return i6 | 16384;
            }
        }

        public /* synthetic */ C0000a(i iVar) {
            this();
        }
    }
}
