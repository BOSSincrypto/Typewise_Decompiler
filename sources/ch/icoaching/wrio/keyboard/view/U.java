package ch.icoaching.wrio.keyboard.view;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class U {

    public static final class a extends U {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10314a = new a();

        private a() {
            super((i) null);
        }
    }

    public static final class b extends U {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10315a = new b();

        private b() {
            super((i) null);
        }
    }

    public static final class c extends U {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10316a = new c();

        private c() {
            super((i) null);
        }
    }

    public static final class d extends U {

        /* renamed from: a  reason: collision with root package name */
        private final List f10317a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super((i) null);
            o.e(list, "symbolsList");
            this.f10317a = list;
        }

        public final List a() {
            return this.f10317a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && o.a(this.f10317a, ((d) obj).f10317a);
        }

        public int hashCode() {
            return this.f10317a.hashCode();
        }

        public String toString() {
            return "Symbols(symbolsList=" + this.f10317a + ')';
        }
    }

    public static final class e extends U {

        /* renamed from: a  reason: collision with root package name */
        private final String f10318a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super((i) null);
            o.e(str, "titleResourceName");
            this.f10318a = str;
        }

        public final String a() {
            return this.f10318a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && o.a(this.f10318a, ((e) obj).f10318a);
        }

        public int hashCode() {
            return this.f10318a.hashCode();
        }

        public String toString() {
            return "TitleData(titleResourceName=" + this.f10318a + ')';
        }
    }

    public /* synthetic */ U(i iVar) {
        this();
    }

    private U() {
    }
}
