package q0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: q0.b  reason: case insensitive filesystem */
public abstract class C0859b {

    /* renamed from: q0.b$a */
    public static final class a extends C0859b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15920a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15921b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((i) null);
            o.e(str, "optionTitle");
            o.e(str2, "optionValue");
            this.f15920a = str;
            this.f15921b = str2;
        }

        public final String a() {
            return this.f15920a;
        }

        public final String b() {
            return this.f15921b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.a(this.f15920a, aVar.f15920a) && o.a(this.f15921b, aVar.f15921b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f15920a.hashCode() * 31) + this.f15921b.hashCode();
        }

        public String toString() {
            return "OptionData(optionTitle=" + this.f15920a + ", optionValue=" + this.f15921b + ')';
        }
    }

    /* renamed from: q0.b$b  reason: collision with other inner class name */
    public static final class C0224b extends C0859b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15922a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15923b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15924c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0224b(String str, String str2, int i4) {
            super((i) null);
            o.e(str, "optionTitle");
            o.e(str2, "optionValue");
            this.f15922a = str;
            this.f15923b = str2;
            this.f15924c = i4;
        }

        public final int a() {
            return this.f15924c;
        }

        public final String b() {
            return this.f15922a;
        }

        public final String c() {
            return this.f15923b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0224b)) {
                return false;
            }
            C0224b bVar = (C0224b) obj;
            if (o.a(this.f15922a, bVar.f15922a) && o.a(this.f15923b, bVar.f15923b) && this.f15924c == bVar.f15924c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15922a.hashCode() * 31) + this.f15923b.hashCode()) * 31) + this.f15924c;
        }

        public String toString() {
            return "OptionWithIconData(optionTitle=" + this.f15922a + ", optionValue=" + this.f15923b + ", optionIcon=" + this.f15924c + ')';
        }
    }

    /* renamed from: q0.b$c */
    public static final class c extends C0859b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15925a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super((i) null);
            o.e(str, "title");
            this.f15925a = str;
        }

        public final String a() {
            return this.f15925a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && o.a(this.f15925a, ((c) obj).f15925a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f15925a.hashCode();
        }

        public String toString() {
            return "TitleData(title=" + this.f15925a + ')';
        }
    }

    public /* synthetic */ C0859b(i iVar) {
        this();
    }

    private C0859b() {
    }
}
