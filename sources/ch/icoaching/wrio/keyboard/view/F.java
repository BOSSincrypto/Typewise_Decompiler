package ch.icoaching.wrio.keyboard.view;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class F {

    public static final class a extends F {

        /* renamed from: a  reason: collision with root package name */
        private final List f10147a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super((i) null);
            o.e(list, "emojiList");
            this.f10147a = list;
        }

        public final List a() {
            return this.f10147a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && o.a(this.f10147a, ((a) obj).f10147a);
        }

        public int hashCode() {
            return this.f10147a.hashCode();
        }

        public String toString() {
            return "Emojis(emojiList=" + this.f10147a + ')';
        }
    }

    public static final class b extends F {

        /* renamed from: a  reason: collision with root package name */
        private final String f10148a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((i) null);
            o.e(str, "titleResourceName");
            this.f10148a = str;
        }

        public final String a() {
            return this.f10148a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && o.a(this.f10148a, ((b) obj).f10148a);
        }

        public int hashCode() {
            return this.f10148a.hashCode();
        }

        public String toString() {
            return "TitleData(titleResourceName=" + this.f10148a + ')';
        }
    }

    public /* synthetic */ F(i iVar) {
        this();
    }

    private F() {
    }
}
