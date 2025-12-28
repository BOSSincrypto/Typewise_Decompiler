package ch.icoaching.wrio.keyboard.model.config;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006,"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/Emoji;", "", "", "icon", "", "hasSkinTones", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/Emoji;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lch/icoaching/wrio/keyboard/model/config/Emoji;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIcon$annotations", "()V", "Z", "getHasSkinTones", "getHasSkinTones$annotations", "Companion", "b", "a", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class Emoji {
    public static final a Companion = new a((i) null);
    private final boolean hasSkinTones;
    private final String icon;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f10020a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10020a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f10021b;

        static {
            b bVar = new b();
            f10020a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.Emoji", bVar, 2);
            s0Var.p("icon", false);
            s0Var.p("skintones", true);
            f10021b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f10021b;
        }

        public final F2.b[] c() {
            return new F2.b[]{G0.f622a, C0306i.f706a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final Emoji b(e eVar) {
            int i4;
            boolean z3;
            String str;
            o.e(eVar, "decoder");
            f fVar = f10021b;
            c d4 = eVar.d(fVar);
            if (d4.p()) {
                str = d4.z(fVar, 0);
                z3 = d4.n(fVar, 1);
                i4 = 3;
            } else {
                boolean z4 = true;
                boolean z5 = false;
                int i5 = 0;
                str = null;
                while (z4) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z4 = false;
                    } else if (e4 == 0) {
                        str = d4.z(fVar, 0);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        z5 = d4.n(fVar, 1);
                        i5 |= 2;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                z3 = z5;
                i4 = i5;
            }
            d4.c(fVar);
            return new Emoji(i4, str, z3, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, Emoji emoji) {
            o.e(fVar, "encoder");
            o.e(emoji, "value");
            f fVar2 = f10021b;
            d d4 = fVar.d(fVar2);
            Emoji.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(emoji, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ Emoji(int i4, String str, boolean z3, C0 c02) {
        if (1 != (i4 & 1)) {
            C0317n0.a(i4, 1, b.f10020a.a());
        }
        this.icon = str;
        if ((i4 & 2) == 0) {
            this.hasSkinTones = false;
        } else {
            this.hasSkinTones = z3;
        }
    }

    public static /* synthetic */ Emoji copy$default(Emoji emoji, String str, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = emoji.icon;
        }
        if ((i4 & 2) != 0) {
            z3 = emoji.hasSkinTones;
        }
        return emoji.copy(str, z3);
    }

    public static /* synthetic */ void getHasSkinTones$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Emoji emoji, d dVar, f fVar) {
        dVar.p(fVar, 0, emoji.icon);
        if (dVar.n(fVar, 1) || emoji.hasSkinTones) {
            dVar.j(fVar, 1, emoji.hasSkinTones);
        }
    }

    public final String component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.hasSkinTones;
    }

    public final Emoji copy(String str, boolean z3) {
        o.e(str, "icon");
        return new Emoji(str, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Emoji)) {
            return false;
        }
        Emoji emoji = (Emoji) obj;
        return o.a(this.icon, emoji.icon) && this.hasSkinTones == emoji.hasSkinTones;
    }

    public final boolean getHasSkinTones() {
        return this.hasSkinTones;
    }

    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (this.icon.hashCode() * 31) + androidx.work.c.a(this.hasSkinTones);
    }

    public String toString() {
        return "Emoji(icon=" + this.icon + ", hasSkinTones=" + this.hasSkinTones + ')';
    }

    public Emoji(String str, boolean z3) {
        o.e(str, "icon");
        this.icon = str;
        this.hasSkinTones = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Emoji(String str, boolean z3, int i4, i iVar) {
        this(str, (i4 & 2) != 0 ? false : z3);
    }
}
