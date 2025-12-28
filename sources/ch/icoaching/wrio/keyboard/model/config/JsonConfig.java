package ch.icoaching.wrio.keyboard.model.config;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0317n0;
import J2.C0326s0;
import J2.E;
import J2.F;
import J2.G0;
import J2.K;
import com.capacitorjs.plugins.localnotifications.LocalNotificationManager;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;
import o2.C0840a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 %2\u00020\u0001:\u0004&'()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig;", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;", "layout", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;", "copy", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;", "getLayout", "getLayout$annotations", "()V", "Companion", "Layout", "Keyboard", "b", "a", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class JsonConfig {
    public static final a Companion = new a((i) null);
    private final Layout layout;

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0017¨\u00060"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;", "hexagon", "hexagonLegacy", "rectangle", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;", "component2", "component3", "copy", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Layout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;", "getHexagon", "getHexagon$annotations", "()V", "getHexagonLegacy", "getHexagonLegacy$annotations", "getRectangle", "getRectangle$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Layout {
        public static final b Companion = new b((i) null);
        private final Keyboard hexagon;
        private final Keyboard hexagonLegacy;
        private final Keyboard rectangle;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10034a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10035b;

            static {
                a aVar = new a();
                f10034a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Layout", aVar, 3);
                s0Var.p("hexagon", false);
                s0Var.p("hexagon_legacy", false);
                s0Var.p("rectangle", false);
                f10035b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10035b;
            }

            public final F2.b[] c() {
                Keyboard.a aVar = Keyboard.a.f10032a;
                return new F2.b[]{aVar, aVar, aVar};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final Layout b(e eVar) {
                Keyboard keyboard;
                Keyboard keyboard2;
                Keyboard keyboard3;
                int i4;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f10035b;
                c d4 = eVar2.d(fVar);
                Keyboard keyboard4 = null;
                if (d4.p()) {
                    Keyboard.a aVar = Keyboard.a.f10032a;
                    keyboard = (Keyboard) d4.E(fVar, 2, aVar, (Object) null);
                    i4 = 7;
                    keyboard2 = (Keyboard) d4.E(fVar, 1, aVar, (Object) null);
                    keyboard3 = (Keyboard) d4.E(fVar, 0, aVar, (Object) null);
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    Keyboard keyboard5 = null;
                    Keyboard keyboard6 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            keyboard4 = (Keyboard) d4.E(fVar, 0, Keyboard.a.f10032a, keyboard4);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            keyboard5 = (Keyboard) d4.E(fVar, 1, Keyboard.a.f10032a, keyboard5);
                            i5 |= 2;
                        } else if (e4 == 2) {
                            keyboard6 = (Keyboard) d4.E(fVar, 2, Keyboard.a.f10032a, keyboard6);
                            i5 |= 4;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                    keyboard3 = keyboard4;
                    keyboard2 = keyboard5;
                    keyboard = keyboard6;
                }
                d4.c(fVar);
                return new Layout(i4, keyboard3, keyboard2, keyboard, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, Layout layout) {
                o.e(fVar, "encoder");
                o.e(layout, "value");
                f fVar2 = f10035b;
                d d4 = fVar.d(fVar2);
                Layout.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(layout, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10034a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ Layout(int i4, Keyboard keyboard, Keyboard keyboard2, Keyboard keyboard3, C0 c02) {
            if (7 != (i4 & 7)) {
                C0317n0.a(i4, 7, a.f10034a.a());
            }
            this.hexagon = keyboard;
            this.hexagonLegacy = keyboard2;
            this.rectangle = keyboard3;
        }

        public static /* synthetic */ Layout copy$default(Layout layout, Keyboard keyboard, Keyboard keyboard2, Keyboard keyboard3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                keyboard = layout.hexagon;
            }
            if ((i4 & 2) != 0) {
                keyboard2 = layout.hexagonLegacy;
            }
            if ((i4 & 4) != 0) {
                keyboard3 = layout.rectangle;
            }
            return layout.copy(keyboard, keyboard2, keyboard3);
        }

        public static /* synthetic */ void getHexagon$annotations() {
        }

        public static /* synthetic */ void getHexagonLegacy$annotations() {
        }

        public static /* synthetic */ void getRectangle$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Layout layout, d dVar, f fVar) {
            Keyboard.a aVar = Keyboard.a.f10032a;
            dVar.f(fVar, 0, aVar, layout.hexagon);
            dVar.f(fVar, 1, aVar, layout.hexagonLegacy);
            dVar.f(fVar, 2, aVar, layout.rectangle);
        }

        public final Keyboard component1() {
            return this.hexagon;
        }

        public final Keyboard component2() {
            return this.hexagonLegacy;
        }

        public final Keyboard component3() {
            return this.rectangle;
        }

        public final Layout copy(Keyboard keyboard, Keyboard keyboard2, Keyboard keyboard3) {
            o.e(keyboard, "hexagon");
            o.e(keyboard2, "hexagonLegacy");
            o.e(keyboard3, "rectangle");
            return new Layout(keyboard, keyboard2, keyboard3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return o.a(this.hexagon, layout.hexagon) && o.a(this.hexagonLegacy, layout.hexagonLegacy) && o.a(this.rectangle, layout.rectangle);
        }

        public final Keyboard getHexagon() {
            return this.hexagon;
        }

        public final Keyboard getHexagonLegacy() {
            return this.hexagonLegacy;
        }

        public final Keyboard getRectangle() {
            return this.rectangle;
        }

        public int hashCode() {
            return (((this.hexagon.hashCode() * 31) + this.hexagonLegacy.hashCode()) * 31) + this.rectangle.hashCode();
        }

        public String toString() {
            return "Layout(hexagon=" + this.hexagon + ", hexagonLegacy=" + this.hexagonLegacy + ", rectangle=" + this.rectangle + ')';
        }

        public Layout(Keyboard keyboard, Keyboard keyboard2, Keyboard keyboard3) {
            o.e(keyboard, "hexagon");
            o.e(keyboard2, "hexagonLegacy");
            o.e(keyboard3, "rectangle");
            this.hexagon = keyboard;
            this.hexagonLegacy = keyboard2;
            this.rectangle = keyboard3;
        }
    }

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f10036a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10036a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f10037b;

        static {
            b bVar = new b();
            f10036a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig", bVar, 1);
            s0Var.p("layout", false);
            f10037b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f10037b;
        }

        public final F2.b[] c() {
            return new F2.b[]{Layout.a.f10034a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final JsonConfig b(e eVar) {
            Layout layout;
            o.e(eVar, "decoder");
            f fVar = f10037b;
            c d4 = eVar.d(fVar);
            int i4 = 1;
            if (d4.p()) {
                layout = (Layout) d4.E(fVar, 0, Layout.a.f10034a, (Object) null);
            } else {
                boolean z3 = true;
                int i5 = 0;
                layout = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        layout = (Layout) d4.E(fVar, 0, Layout.a.f10034a, layout);
                        i5 = 1;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i5;
            }
            d4.c(fVar);
            return new JsonConfig(i4, layout, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, JsonConfig jsonConfig) {
            o.e(fVar, "encoder");
            o.e(jsonConfig, "value");
            f fVar2 = f10037b;
            d d4 = fVar.d(fVar2);
            d4.f(fVar2, 0, Layout.a.f10034a, jsonConfig.layout);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ JsonConfig(int i4, Layout layout2, C0 c02) {
        if (1 != (i4 & 1)) {
            C0317n0.a(i4, 1, b.f10036a.a());
        }
        this.layout = layout2;
    }

    public static /* synthetic */ JsonConfig copy$default(JsonConfig jsonConfig, Layout layout2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            layout2 = jsonConfig.layout;
        }
        return jsonConfig.copy(layout2);
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public final Layout component1() {
        return this.layout;
    }

    public final JsonConfig copy(Layout layout2) {
        o.e(layout2, "layout");
        return new JsonConfig(layout2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsonConfig) && o.a(this.layout, ((JsonConfig) obj).layout);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return this.layout.hashCode();
    }

    public String toString() {
        return "JsonConfig(layout=" + this.layout + ')';
    }

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 52\u00020\u0001:\u0003678B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u0019¨\u00069"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;", "portrait", "portraitNumbers", "numbers", "math", "landscape", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;", "component2", "component3", "component4", "component5", "copy", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;", "getPortrait", "getPortrait$annotations", "()V", "getPortraitNumbers", "getPortraitNumbers$annotations", "getNumbers", "getNumbers$annotations", "getMath", "getMath$annotations", "getLandscape", "getLandscape$annotations", "Companion", "Layout", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Keyboard {
        public static final b Companion = new b((i) null);
        private final Layout landscape;
        private final Layout math;
        private final Layout numbers;
        private final Layout portrait;
        private final Layout portraitNumbers;

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f10032a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f10033b;

            static {
                a aVar = new a();
                f10032a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard", aVar, 5);
                s0Var.p("portrait", false);
                s0Var.p("portrait_numbers", true);
                s0Var.p("numbers", true);
                s0Var.p("math", true);
                s0Var.p("landscape", false);
                f10033b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f10033b;
            }

            public final F2.b[] c() {
                Layout.a aVar = Layout.a.f10030a;
                return new F2.b[]{aVar, G2.a.u(aVar), G2.a.u(aVar), G2.a.u(aVar), aVar};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final Keyboard b(e eVar) {
                Layout layout;
                Layout layout2;
                Layout layout3;
                Layout layout4;
                Layout layout5;
                int i4;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f10033b;
                c d4 = eVar2.d(fVar);
                Layout layout6 = null;
                if (d4.p()) {
                    Layout.a aVar = Layout.a.f10030a;
                    layout = (Layout) d4.E(fVar, 4, aVar, (Object) null);
                    layout2 = (Layout) d4.m(fVar, 3, aVar, (Object) null);
                    i4 = 31;
                    layout3 = (Layout) d4.m(fVar, 2, aVar, (Object) null);
                    layout4 = (Layout) d4.m(fVar, 1, aVar, (Object) null);
                    layout5 = (Layout) d4.E(fVar, 0, aVar, (Object) null);
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    Layout layout7 = null;
                    Layout layout8 = null;
                    Layout layout9 = null;
                    Layout layout10 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            layout6 = (Layout) d4.E(fVar, 0, Layout.a.f10030a, layout6);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            layout7 = (Layout) d4.m(fVar, 1, Layout.a.f10030a, layout7);
                            i5 |= 2;
                        } else if (e4 == 2) {
                            layout8 = (Layout) d4.m(fVar, 2, Layout.a.f10030a, layout8);
                            i5 |= 4;
                        } else if (e4 == 3) {
                            layout9 = (Layout) d4.m(fVar, 3, Layout.a.f10030a, layout9);
                            i5 |= 8;
                        } else if (e4 == 4) {
                            layout10 = (Layout) d4.E(fVar, 4, Layout.a.f10030a, layout10);
                            i5 |= 16;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                    layout5 = layout6;
                    layout4 = layout7;
                    layout3 = layout8;
                    layout2 = layout9;
                    layout = layout10;
                }
                d4.c(fVar);
                return new Keyboard(i4, layout5, layout4, layout3, layout2, layout, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, Keyboard keyboard) {
                o.e(fVar, "encoder");
                o.e(keyboard, "value");
                f fVar2 = f10033b;
                d d4 = fVar.d(fVar2);
                Keyboard.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(keyboard, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f10032a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ Keyboard(int i4, Layout layout, Layout layout2, Layout layout3, Layout layout4, Layout layout5, C0 c02) {
            if (17 != (i4 & 17)) {
                C0317n0.a(i4, 17, a.f10032a.a());
            }
            this.portrait = layout;
            if ((i4 & 2) == 0) {
                this.portraitNumbers = null;
            } else {
                this.portraitNumbers = layout2;
            }
            if ((i4 & 4) == 0) {
                this.numbers = null;
            } else {
                this.numbers = layout3;
            }
            if ((i4 & 8) == 0) {
                this.math = null;
            } else {
                this.math = layout4;
            }
            this.landscape = layout5;
        }

        public static /* synthetic */ Keyboard copy$default(Keyboard keyboard, Layout layout, Layout layout2, Layout layout3, Layout layout4, Layout layout5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                layout = keyboard.portrait;
            }
            if ((i4 & 2) != 0) {
                layout2 = keyboard.portraitNumbers;
            }
            Layout layout6 = layout2;
            if ((i4 & 4) != 0) {
                layout3 = keyboard.numbers;
            }
            Layout layout7 = layout3;
            if ((i4 & 8) != 0) {
                layout4 = keyboard.math;
            }
            Layout layout8 = layout4;
            if ((i4 & 16) != 0) {
                layout5 = keyboard.landscape;
            }
            return keyboard.copy(layout, layout6, layout7, layout8, layout5);
        }

        public static /* synthetic */ void getLandscape$annotations() {
        }

        public static /* synthetic */ void getMath$annotations() {
        }

        public static /* synthetic */ void getNumbers$annotations() {
        }

        public static /* synthetic */ void getPortrait$annotations() {
        }

        public static /* synthetic */ void getPortraitNumbers$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Keyboard keyboard, d dVar, f fVar) {
            Layout.a aVar = Layout.a.f10030a;
            dVar.f(fVar, 0, aVar, keyboard.portrait);
            if (dVar.n(fVar, 1) || keyboard.portraitNumbers != null) {
                dVar.o(fVar, 1, aVar, keyboard.portraitNumbers);
            }
            if (dVar.n(fVar, 2) || keyboard.numbers != null) {
                dVar.o(fVar, 2, aVar, keyboard.numbers);
            }
            if (dVar.n(fVar, 3) || keyboard.math != null) {
                dVar.o(fVar, 3, aVar, keyboard.math);
            }
            dVar.f(fVar, 4, aVar, keyboard.landscape);
        }

        public final Layout component1() {
            return this.portrait;
        }

        public final Layout component2() {
            return this.portraitNumbers;
        }

        public final Layout component3() {
            return this.numbers;
        }

        public final Layout component4() {
            return this.math;
        }

        public final Layout component5() {
            return this.landscape;
        }

        public final Keyboard copy(Layout layout, Layout layout2, Layout layout3, Layout layout4, Layout layout5) {
            o.e(layout, "portrait");
            o.e(layout5, "landscape");
            return new Keyboard(layout, layout2, layout3, layout4, layout5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Keyboard)) {
                return false;
            }
            Keyboard keyboard = (Keyboard) obj;
            return o.a(this.portrait, keyboard.portrait) && o.a(this.portraitNumbers, keyboard.portraitNumbers) && o.a(this.numbers, keyboard.numbers) && o.a(this.math, keyboard.math) && o.a(this.landscape, keyboard.landscape);
        }

        public final Layout getLandscape() {
            return this.landscape;
        }

        public final Layout getMath() {
            return this.math;
        }

        public final Layout getNumbers() {
            return this.numbers;
        }

        public final Layout getPortrait() {
            return this.portrait;
        }

        public final Layout getPortraitNumbers() {
            return this.portraitNumbers;
        }

        public int hashCode() {
            int hashCode = this.portrait.hashCode() * 31;
            Layout layout = this.portraitNumbers;
            int i4 = 0;
            int hashCode2 = (hashCode + (layout == null ? 0 : layout.hashCode())) * 31;
            Layout layout2 = this.numbers;
            int hashCode3 = (hashCode2 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
            Layout layout3 = this.math;
            if (layout3 != null) {
                i4 = layout3.hashCode();
            }
            return ((hashCode3 + i4) * 31) + this.landscape.hashCode();
        }

        public String toString() {
            return "Keyboard(portrait=" + this.portrait + ", portraitNumbers=" + this.portraitNumbers + ", numbers=" + this.numbers + ", math=" + this.math + ", landscape=" + this.landscape + ')';
        }

        @m
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 32\u00020\u0001:\u0003456B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001d¨\u00067"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;", "", "", "maxHeight", "", "defaultKeyHeight", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column;", "columns", "<init>", "(FLjava/lang/Integer;Ljava/util/List;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(IFLjava/lang/Integer;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;LI2/d;LH2/f;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/util/List;", "copy", "(FLjava/lang/Integer;Ljava/util/List;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getMaxHeight", "getMaxHeight$annotations", "()V", "Ljava/lang/Integer;", "getDefaultKeyHeight", "getDefaultKeyHeight$annotations", "Ljava/util/List;", "getColumns", "getColumns$annotations", "Companion", "Column", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Layout {
            /* access modifiers changed from: private */
            public static final F2.b[] $childSerializers = {null, null, new C0300f(Column.a.f10028a)};
            public static final b Companion = new b((i) null);
            private final List<Column> columns;
            private final Integer defaultKeyHeight;
            private final float maxHeight;

            @m
            @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 42\u00020\u0001:\u00045678B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001e¨\u00069"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column;", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;", "alignment", "", "maxWidth", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row;", "rows", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;Ljava/lang/Float;Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;Ljava/lang/Float;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;", "component2", "()Ljava/lang/Float;", "component3", "()Ljava/util/List;", "copy", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;Ljava/lang/Float;Ljava/util/List;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;", "getAlignment", "getAlignment$annotations", "()V", "Ljava/lang/Float;", "getMaxWidth", "getMaxWidth$annotations", "Ljava/util/List;", "getRows", "getRows$annotations", "Companion", "Alignment", "Row", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Column {
                /* access modifiers changed from: private */
                public static final F2.b[] $childSerializers = {Alignment.Companion.serializer(), null, new C0300f(Row.a.f10026a)};
                public static final b Companion = new b((i) null);
                private final Alignment alignment;
                private final Float maxWidth;
                private final List<Row> rows;

                @m
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "LEFT", "CENTER", "RIGHT", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public enum Alignment {
                    LEFT,
                    CENTER,
                    RIGHT;
                    
                    /* access modifiers changed from: private */
                    public static final l2.f $cachedSerializer$delegate = null;
                    public static final a Companion = null;

                    public static final class a {
                        private a() {
                        }

                        private final /* synthetic */ F2.b a() {
                            return (F2.b) Alignment.$cachedSerializer$delegate.getValue();
                        }

                        public final F2.b serializer() {
                            return a();
                        }

                        public /* synthetic */ a(i iVar) {
                            this();
                        }
                    }

                    static {
                        Alignment[] $values;
                        $ENTRIES = kotlin.enums.a.a($values);
                        Companion = new a((i) null);
                        $cachedSerializer$delegate = kotlin.c.a(LazyThreadSafetyMode.PUBLICATION, new N0.a());
                    }

                    public static C0840a getEntries() {
                        return $ENTRIES;
                    }
                }

                @m
                @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006*"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row;", "", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key;", "rowItems", "<init>", "(Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRowItems", "getRowItems$annotations", "()V", "Companion", "Key", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Row {
                    /* access modifiers changed from: private */
                    public static final F2.b[] $childSerializers = {new C0300f(Key.a.f10024a)};
                    public static final b Companion = new b((i) null);
                    private final List<Key> rowItems;

                    public /* synthetic */ class a implements F {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f10026a;

                        /* renamed from: b  reason: collision with root package name */
                        private static final f f10027b;

                        static {
                            a aVar = new a();
                            f10026a = aVar;
                            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row", aVar, 1);
                            s0Var.p("rowItems", false);
                            f10027b = s0Var;
                        }

                        private a() {
                        }

                        public final f a() {
                            return f10027b;
                        }

                        public final F2.b[] c() {
                            return new F2.b[]{Row.$childSerializers[0]};
                        }

                        public F2.b[] d() {
                            return F.a.a(this);
                        }

                        /* renamed from: f */
                        public final Row b(e eVar) {
                            List list;
                            o.e(eVar, "decoder");
                            f fVar = f10027b;
                            c d4 = eVar.d(fVar);
                            F2.b[] access$get$childSerializers$cp = Row.$childSerializers;
                            int i4 = 1;
                            if (d4.p()) {
                                list = (List) d4.E(fVar, 0, access$get$childSerializers$cp[0], (Object) null);
                            } else {
                                boolean z3 = true;
                                int i5 = 0;
                                List list2 = null;
                                while (z3) {
                                    int e4 = d4.e(fVar);
                                    if (e4 == -1) {
                                        z3 = false;
                                    } else if (e4 == 0) {
                                        list2 = (List) d4.E(fVar, 0, access$get$childSerializers$cp[0], list2);
                                        i5 = 1;
                                    } else {
                                        throw new UnknownFieldException(e4);
                                    }
                                }
                                list = list2;
                                i4 = i5;
                            }
                            d4.c(fVar);
                            return new Row(i4, list, (C0) null);
                        }

                        /* renamed from: g */
                        public final void e(I2.f fVar, Row row) {
                            o.e(fVar, "encoder");
                            o.e(row, "value");
                            f fVar2 = f10027b;
                            d d4 = fVar.d(fVar2);
                            d4.f(fVar2, 0, Row.$childSerializers[0], row.rowItems);
                            d4.c(fVar2);
                        }
                    }

                    public static final class b {
                        private b() {
                        }

                        public final F2.b serializer() {
                            return a.f10026a;
                        }

                        public /* synthetic */ b(i iVar) {
                            this();
                        }
                    }

                    public /* synthetic */ Row(int i4, List list, C0 c02) {
                        if (1 != (i4 & 1)) {
                            C0317n0.a(i4, 1, a.f10026a.a());
                        }
                        this.rowItems = list;
                    }

                    public static /* synthetic */ Row copy$default(Row row, List<Key> list, int i4, Object obj) {
                        if ((i4 & 1) != 0) {
                            list = row.rowItems;
                        }
                        return row.copy(list);
                    }

                    public static /* synthetic */ void getRowItems$annotations() {
                    }

                    public final List<Key> component1() {
                        return this.rowItems;
                    }

                    public final Row copy(List<Key> list) {
                        o.e(list, "rowItems");
                        return new Row(list);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Row) && o.a(this.rowItems, ((Row) obj).rowItems);
                    }

                    public final List<Key> getRowItems() {
                        return this.rowItems;
                    }

                    public int hashCode() {
                        return this.rowItems.hashCode();
                    }

                    public String toString() {
                        return "Row(rowItems=" + this.rowItems + ')';
                    }

                    @m
                    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 <2\u00020\u0001:\u0004=>?@B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00100\u001a\u0004\b:\u0010#¨\u0006A"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key;", "", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;", "type", "", "content", "id", "", "width", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;", "customKeyDefaults", "<init>", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Float;", "component5", "()Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;", "copy", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;", "getType", "getType$annotations", "()V", "Ljava/lang/String;", "getContent", "getContent$annotations", "getId", "getId$annotations", "Ljava/lang/Float;", "getWidth", "getWidth$annotations", "Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;", "getCustomKeyDefaults", "getCustomKeyDefaults$annotations", "Companion", "CustomKeyDefaults", "Type", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final class Key {
                        /* access modifiers changed from: private */
                        public static final F2.b[] $childSerializers = {Type.Companion.serializer(), null, null, null, null};
                        public static final b Companion = new b((i) null);
                        private final String content;
                        private final CustomKeyDefaults customKeyDefaults;
                        private final String id;
                        private final Type type;
                        private final Float width;

                        @m
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "EMPTY", "SPACE", "CHARACTER", "RETURN", "FUNCTION", "SPLIT_LAYERS_EMOJIS_NUMBERS", "SPLIT_LAYERS_MORE_MAIN", "SPLIT", "CUSTOM_KEY", "MORE_CHARACTERS", "EMOJI", "MORE_NUMBERS", "MORE_MATHS", "MAIN_LAYOUT", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public enum Type {
                            EMPTY,
                            SPACE,
                            CHARACTER,
                            RETURN,
                            FUNCTION,
                            SPLIT_LAYERS_EMOJIS_NUMBERS,
                            SPLIT_LAYERS_MORE_MAIN,
                            SPLIT,
                            CUSTOM_KEY,
                            MORE_CHARACTERS,
                            EMOJI,
                            MORE_NUMBERS,
                            MORE_MATHS,
                            MAIN_LAYOUT;
                            
                            /* access modifiers changed from: private */
                            public static final l2.f $cachedSerializer$delegate = null;
                            public static final a Companion = null;

                            public static final class a {
                                private a() {
                                }

                                private final /* synthetic */ F2.b a() {
                                    return (F2.b) Type.$cachedSerializer$delegate.getValue();
                                }

                                public final F2.b serializer() {
                                    return a();
                                }

                                public /* synthetic */ a(i iVar) {
                                    this();
                                }
                            }

                            static {
                                Type[] $values;
                                $ENTRIES = kotlin.enums.a.a($values);
                                Companion = new a((i) null);
                                $cachedSerializer$delegate = kotlin.c.a(LazyThreadSafetyMode.PUBLICATION, new N0.b());
                            }

                            public static C0840a getEntries() {
                                return $ENTRIES;
                            }
                        }

                        public /* synthetic */ class a implements F {

                            /* renamed from: a  reason: collision with root package name */
                            public static final a f10024a;

                            /* renamed from: b  reason: collision with root package name */
                            private static final f f10025b;

                            static {
                                a aVar = new a();
                                f10024a = aVar;
                                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key", aVar, 5);
                                s0Var.p("type", false);
                                s0Var.p("content", true);
                                s0Var.p("id", true);
                                s0Var.p("width", false);
                                s0Var.p(LocalNotificationManager.DEFAULT_NOTIFICATION_CHANNEL_ID, true);
                                f10025b = s0Var;
                            }

                            private a() {
                            }

                            public final f a() {
                                return f10025b;
                            }

                            public final F2.b[] c() {
                                F2.b bVar = Key.$childSerializers[0];
                                G0 g02 = G0.f622a;
                                return new F2.b[]{bVar, G2.a.u(g02), G2.a.u(g02), G2.a.u(E.f616a), G2.a.u(CustomKeyDefaults.a.f10022a)};
                            }

                            public F2.b[] d() {
                                return F.a.a(this);
                            }

                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Float} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
                            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults} */
                            /* JADX WARNING: Multi-variable type inference failed */
                            /* renamed from: f */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key b(I2.e r24) {
                                /*
                                    r23 = this;
                                    r0 = r24
                                    java.lang.String r1 = "decoder"
                                    kotlin.jvm.internal.o.e(r0, r1)
                                    H2.f r1 = f10025b
                                    I2.c r0 = r0.d(r1)
                                    F2.b[] r2 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.$childSerializers
                                    boolean r3 = r0.p()
                                    r4 = 3
                                    r5 = 4
                                    r6 = 2
                                    r7 = 1
                                    r8 = 0
                                    r9 = 0
                                    if (r3 == 0) goto L_0x0053
                                    r2 = r2[r8]
                                    java.lang.Object r2 = r0.E(r1, r8, r2, r9)
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r2 = (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type) r2
                                    J2.G0 r3 = J2.G0.f622a
                                    java.lang.Object r7 = r0.m(r1, r7, r3, r9)
                                    java.lang.String r7 = (java.lang.String) r7
                                    java.lang.Object r3 = r0.m(r1, r6, r3, r9)
                                    java.lang.String r3 = (java.lang.String) r3
                                    J2.E r6 = J2.E.f616a
                                    java.lang.Object r4 = r0.m(r1, r4, r6, r9)
                                    java.lang.Float r4 = (java.lang.Float) r4
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults$a r6 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults.a.f10022a
                                    java.lang.Object r5 = r0.m(r1, r5, r6, r9)
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults r5 = (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults) r5
                                    r6 = 31
                                    r17 = r2
                                    r19 = r3
                                    r20 = r4
                                    r21 = r5
                                    r16 = r6
                                    r18 = r7
                                    goto L_0x00be
                                L_0x0053:
                                    r14 = r7
                                    r3 = r8
                                    r10 = r9
                                    r11 = r10
                                    r12 = r11
                                    r13 = r12
                                L_0x0059:
                                    if (r14 == 0) goto L_0x00b2
                                    int r15 = r0.e(r1)
                                    r8 = -1
                                    if (r15 == r8) goto L_0x00af
                                    if (r15 == 0) goto L_0x00a3
                                    if (r15 == r7) goto L_0x0097
                                    if (r15 == r6) goto L_0x008b
                                    if (r15 == r4) goto L_0x007f
                                    if (r15 != r5) goto L_0x0079
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults$a r8 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults.a.f10022a
                                    java.lang.Object r8 = r0.m(r1, r5, r8, r13)
                                    r13 = r8
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults r13 = (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults) r13
                                    r3 = r3 | 16
                                L_0x0077:
                                    r8 = 0
                                    goto L_0x0059
                                L_0x0079:
                                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                                    r0.<init>((int) r15)
                                    throw r0
                                L_0x007f:
                                    J2.E r8 = J2.E.f616a
                                    java.lang.Object r8 = r0.m(r1, r4, r8, r12)
                                    r12 = r8
                                    java.lang.Float r12 = (java.lang.Float) r12
                                    r3 = r3 | 8
                                    goto L_0x0077
                                L_0x008b:
                                    J2.G0 r8 = J2.G0.f622a
                                    java.lang.Object r8 = r0.m(r1, r6, r8, r11)
                                    r11 = r8
                                    java.lang.String r11 = (java.lang.String) r11
                                    r3 = r3 | 4
                                    goto L_0x0077
                                L_0x0097:
                                    J2.G0 r8 = J2.G0.f622a
                                    java.lang.Object r8 = r0.m(r1, r7, r8, r10)
                                    r10 = r8
                                    java.lang.String r10 = (java.lang.String) r10
                                    r3 = r3 | 2
                                    goto L_0x0077
                                L_0x00a3:
                                    r8 = 0
                                    r15 = r2[r8]
                                    java.lang.Object r9 = r0.E(r1, r8, r15, r9)
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r9 = (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type) r9
                                    r3 = r3 | 1
                                    goto L_0x0059
                                L_0x00af:
                                    r8 = 0
                                    r14 = r8
                                    goto L_0x0059
                                L_0x00b2:
                                    r16 = r3
                                    r17 = r9
                                    r18 = r10
                                    r19 = r11
                                    r20 = r12
                                    r21 = r13
                                L_0x00be:
                                    r0.c(r1)
                                    ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key r0 = new ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key
                                    r22 = 0
                                    r15 = r0
                                    r15.<init>((int) r16, (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.Float) r20, (ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults) r21, (J2.C0) r22)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.a.b(I2.e):ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key");
                            }

                            /* renamed from: g */
                            public final void e(I2.f fVar, Key key) {
                                o.e(fVar, "encoder");
                                o.e(key, "value");
                                f fVar2 = f10025b;
                                d d4 = fVar.d(fVar2);
                                Key.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(key, d4, fVar2);
                                d4.c(fVar2);
                            }
                        }

                        public static final class b {
                            private b() {
                            }

                            public final F2.b serializer() {
                                return a.f10024a;
                            }

                            public /* synthetic */ b(i iVar) {
                                this();
                            }
                        }

                        public /* synthetic */ Key(int i4, Type type2, String str, String str2, Float f4, CustomKeyDefaults customKeyDefaults2, C0 c02) {
                            if (9 != (i4 & 9)) {
                                C0317n0.a(i4, 9, a.f10024a.a());
                            }
                            this.type = type2;
                            if ((i4 & 2) == 0) {
                                this.content = null;
                            } else {
                                this.content = str;
                            }
                            if ((i4 & 4) == 0) {
                                this.id = null;
                            } else {
                                this.id = str2;
                            }
                            this.width = f4;
                            if ((i4 & 16) == 0) {
                                this.customKeyDefaults = null;
                            } else {
                                this.customKeyDefaults = customKeyDefaults2;
                            }
                        }

                        public static /* synthetic */ Key copy$default(Key key, Type type2, String str, String str2, Float f4, CustomKeyDefaults customKeyDefaults2, int i4, Object obj) {
                            if ((i4 & 1) != 0) {
                                type2 = key.type;
                            }
                            if ((i4 & 2) != 0) {
                                str = key.content;
                            }
                            String str3 = str;
                            if ((i4 & 4) != 0) {
                                str2 = key.id;
                            }
                            String str4 = str2;
                            if ((i4 & 8) != 0) {
                                f4 = key.width;
                            }
                            Float f5 = f4;
                            if ((i4 & 16) != 0) {
                                customKeyDefaults2 = key.customKeyDefaults;
                            }
                            return key.copy(type2, str3, str4, f5, customKeyDefaults2);
                        }

                        public static /* synthetic */ void getContent$annotations() {
                        }

                        public static /* synthetic */ void getCustomKeyDefaults$annotations() {
                        }

                        public static /* synthetic */ void getId$annotations() {
                        }

                        public static /* synthetic */ void getType$annotations() {
                        }

                        public static /* synthetic */ void getWidth$annotations() {
                        }

                        public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Key key, d dVar, f fVar) {
                            dVar.f(fVar, 0, $childSerializers[0], key.type);
                            if (dVar.n(fVar, 1) || key.content != null) {
                                dVar.o(fVar, 1, G0.f622a, key.content);
                            }
                            if (dVar.n(fVar, 2) || key.id != null) {
                                dVar.o(fVar, 2, G0.f622a, key.id);
                            }
                            dVar.o(fVar, 3, E.f616a, key.width);
                            if (dVar.n(fVar, 4) || key.customKeyDefaults != null) {
                                dVar.o(fVar, 4, CustomKeyDefaults.a.f10022a, key.customKeyDefaults);
                            }
                        }

                        public final Type component1() {
                            return this.type;
                        }

                        public final String component2() {
                            return this.content;
                        }

                        public final String component3() {
                            return this.id;
                        }

                        public final Float component4() {
                            return this.width;
                        }

                        public final CustomKeyDefaults component5() {
                            return this.customKeyDefaults;
                        }

                        public final Key copy(Type type2, String str, String str2, Float f4, CustomKeyDefaults customKeyDefaults2) {
                            o.e(type2, "type");
                            return new Key(type2, str, str2, f4, customKeyDefaults2);
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Key)) {
                                return false;
                            }
                            Key key = (Key) obj;
                            return this.type == key.type && o.a(this.content, key.content) && o.a(this.id, key.id) && o.a(this.width, key.width) && o.a(this.customKeyDefaults, key.customKeyDefaults);
                        }

                        public final String getContent() {
                            return this.content;
                        }

                        public final CustomKeyDefaults getCustomKeyDefaults() {
                            return this.customKeyDefaults;
                        }

                        public final String getId() {
                            return this.id;
                        }

                        public final Type getType() {
                            return this.type;
                        }

                        public final Float getWidth() {
                            return this.width;
                        }

                        public int hashCode() {
                            int hashCode = this.type.hashCode() * 31;
                            String str = this.content;
                            int i4 = 0;
                            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                            String str2 = this.id;
                            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                            Float f4 = this.width;
                            int hashCode4 = (hashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
                            CustomKeyDefaults customKeyDefaults2 = this.customKeyDefaults;
                            if (customKeyDefaults2 != null) {
                                i4 = customKeyDefaults2.hashCode();
                            }
                            return hashCode4 + i4;
                        }

                        public String toString() {
                            return "Key(type=" + this.type + ", content=" + this.content + ", id=" + this.id + ", width=" + this.width + ", customKeyDefaults=" + this.customKeyDefaults + ')';
                        }

                        @m
                        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 .2\u00020\u0001:\u0002/0B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00061"}, d2 = {"Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;", "", "", "tap", "swipeUp", "", "hold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lch/icoaching/wrio/keyboard/model/config/JsonConfig$Keyboard$Layout$Column$Row$Key$CustomKeyDefaults;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTap", "getTap$annotations", "()V", "getSwipeUp", "getSwipeUp$annotations", "Ljava/util/List;", "getHold", "getHold$annotations", "Companion", "a", "b", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final class CustomKeyDefaults {
                            /* access modifiers changed from: private */
                            public static final F2.b[] $childSerializers = {null, null, new C0300f(G0.f622a)};
                            public static final b Companion = new b((i) null);
                            private final List<String> hold;
                            private final String swipeUp;
                            private final String tap;

                            public /* synthetic */ class a implements F {

                                /* renamed from: a  reason: collision with root package name */
                                public static final a f10022a;

                                /* renamed from: b  reason: collision with root package name */
                                private static final f f10023b;

                                static {
                                    a aVar = new a();
                                    f10022a = aVar;
                                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults", aVar, 3);
                                    s0Var.p("tap", false);
                                    s0Var.p("swipeup", true);
                                    s0Var.p("hold", true);
                                    f10023b = s0Var;
                                }

                                private a() {
                                }

                                public final f a() {
                                    return f10023b;
                                }

                                public final F2.b[] c() {
                                    F2.b[] access$get$childSerializers$cp = CustomKeyDefaults.$childSerializers;
                                    G0 g02 = G0.f622a;
                                    return new F2.b[]{g02, G2.a.u(g02), G2.a.u(access$get$childSerializers$cp[2])};
                                }

                                public F2.b[] d() {
                                    return F.a.a(this);
                                }

                                /* renamed from: f */
                                public final CustomKeyDefaults b(e eVar) {
                                    List list;
                                    String str;
                                    String str2;
                                    int i4;
                                    e eVar2 = eVar;
                                    o.e(eVar2, "decoder");
                                    f fVar = f10023b;
                                    c d4 = eVar2.d(fVar);
                                    F2.b[] access$get$childSerializers$cp = CustomKeyDefaults.$childSerializers;
                                    String str3 = null;
                                    if (d4.p()) {
                                        String z3 = d4.z(fVar, 0);
                                        list = (List) d4.m(fVar, 2, access$get$childSerializers$cp[2], (Object) null);
                                        str2 = z3;
                                        i4 = 7;
                                        str = (String) d4.m(fVar, 1, G0.f622a, (Object) null);
                                    } else {
                                        boolean z4 = true;
                                        int i5 = 0;
                                        String str4 = null;
                                        List list2 = null;
                                        while (z4) {
                                            int e4 = d4.e(fVar);
                                            if (e4 == -1) {
                                                z4 = false;
                                            } else if (e4 == 0) {
                                                str3 = d4.z(fVar, 0);
                                                i5 |= 1;
                                            } else if (e4 == 1) {
                                                str4 = (String) d4.m(fVar, 1, G0.f622a, str4);
                                                i5 |= 2;
                                            } else if (e4 == 2) {
                                                list2 = (List) d4.m(fVar, 2, access$get$childSerializers$cp[2], list2);
                                                i5 |= 4;
                                            } else {
                                                throw new UnknownFieldException(e4);
                                            }
                                        }
                                        i4 = i5;
                                        str2 = str3;
                                        str = str4;
                                        list = list2;
                                    }
                                    d4.c(fVar);
                                    return new CustomKeyDefaults(i4, str2, str, list, (C0) null);
                                }

                                /* renamed from: g */
                                public final void e(I2.f fVar, CustomKeyDefaults customKeyDefaults) {
                                    o.e(fVar, "encoder");
                                    o.e(customKeyDefaults, "value");
                                    f fVar2 = f10023b;
                                    d d4 = fVar.d(fVar2);
                                    CustomKeyDefaults.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(customKeyDefaults, d4, fVar2);
                                    d4.c(fVar2);
                                }
                            }

                            public static final class b {
                                private b() {
                                }

                                public final F2.b serializer() {
                                    return a.f10022a;
                                }

                                public /* synthetic */ b(i iVar) {
                                    this();
                                }
                            }

                            public /* synthetic */ CustomKeyDefaults(int i4, String str, String str2, List list, C0 c02) {
                                if (1 != (i4 & 1)) {
                                    C0317n0.a(i4, 1, a.f10022a.a());
                                }
                                this.tap = str;
                                if ((i4 & 2) == 0) {
                                    this.swipeUp = null;
                                } else {
                                    this.swipeUp = str2;
                                }
                                if ((i4 & 4) == 0) {
                                    this.hold = null;
                                } else {
                                    this.hold = list;
                                }
                            }

                            public static /* synthetic */ CustomKeyDefaults copy$default(CustomKeyDefaults customKeyDefaults, String str, String str2, List<String> list, int i4, Object obj) {
                                if ((i4 & 1) != 0) {
                                    str = customKeyDefaults.tap;
                                }
                                if ((i4 & 2) != 0) {
                                    str2 = customKeyDefaults.swipeUp;
                                }
                                if ((i4 & 4) != 0) {
                                    list = customKeyDefaults.hold;
                                }
                                return customKeyDefaults.copy(str, str2, list);
                            }

                            public static /* synthetic */ void getHold$annotations() {
                            }

                            public static /* synthetic */ void getSwipeUp$annotations() {
                            }

                            public static /* synthetic */ void getTap$annotations() {
                            }

                            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(CustomKeyDefaults customKeyDefaults, d dVar, f fVar) {
                                F2.b[] bVarArr = $childSerializers;
                                dVar.p(fVar, 0, customKeyDefaults.tap);
                                if (dVar.n(fVar, 1) || customKeyDefaults.swipeUp != null) {
                                    dVar.o(fVar, 1, G0.f622a, customKeyDefaults.swipeUp);
                                }
                                if (dVar.n(fVar, 2) || customKeyDefaults.hold != null) {
                                    dVar.o(fVar, 2, bVarArr[2], customKeyDefaults.hold);
                                }
                            }

                            public final String component1() {
                                return this.tap;
                            }

                            public final String component2() {
                                return this.swipeUp;
                            }

                            public final List<String> component3() {
                                return this.hold;
                            }

                            public final CustomKeyDefaults copy(String str, String str2, List<String> list) {
                                o.e(str, "tap");
                                return new CustomKeyDefaults(str, str2, list);
                            }

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof CustomKeyDefaults)) {
                                    return false;
                                }
                                CustomKeyDefaults customKeyDefaults = (CustomKeyDefaults) obj;
                                return o.a(this.tap, customKeyDefaults.tap) && o.a(this.swipeUp, customKeyDefaults.swipeUp) && o.a(this.hold, customKeyDefaults.hold);
                            }

                            public final List<String> getHold() {
                                return this.hold;
                            }

                            public final String getSwipeUp() {
                                return this.swipeUp;
                            }

                            public final String getTap() {
                                return this.tap;
                            }

                            public int hashCode() {
                                int hashCode = this.tap.hashCode() * 31;
                                String str = this.swipeUp;
                                int i4 = 0;
                                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                                List<String> list = this.hold;
                                if (list != null) {
                                    i4 = list.hashCode();
                                }
                                return hashCode2 + i4;
                            }

                            public String toString() {
                                return "CustomKeyDefaults(tap=" + this.tap + ", swipeUp=" + this.swipeUp + ", hold=" + this.hold + ')';
                            }

                            public CustomKeyDefaults(String str, String str2, List<String> list) {
                                o.e(str, "tap");
                                this.tap = str;
                                this.swipeUp = str2;
                                this.hold = list;
                            }

                            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                            public /* synthetic */ CustomKeyDefaults(String str, String str2, List list, int i4, i iVar) {
                                this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : list);
                            }
                        }

                        public Key(Type type2, String str, String str2, Float f4, CustomKeyDefaults customKeyDefaults2) {
                            o.e(type2, "type");
                            this.type = type2;
                            this.content = str;
                            this.id = str2;
                            this.width = f4;
                            this.customKeyDefaults = customKeyDefaults2;
                        }

                        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                        public /* synthetic */ Key(Type type2, String str, String str2, Float f4, CustomKeyDefaults customKeyDefaults2, int i4, i iVar) {
                            this(type2, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, f4, (i4 & 16) != 0 ? null : customKeyDefaults2);
                        }
                    }

                    public Row(List<Key> list) {
                        o.e(list, "rowItems");
                        this.rowItems = list;
                    }
                }

                public /* synthetic */ class a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    public static final a f10028a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final f f10029b;

                    static {
                        a aVar = new a();
                        f10028a = aVar;
                        C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column", aVar, 3);
                        s0Var.p("alignment", false);
                        s0Var.p("maxWidth", false);
                        s0Var.p("rows", false);
                        f10029b = s0Var;
                    }

                    private a() {
                    }

                    public final f a() {
                        return f10029b;
                    }

                    public final F2.b[] c() {
                        F2.b[] access$get$childSerializers$cp = Column.$childSerializers;
                        return new F2.b[]{G2.a.u(access$get$childSerializers$cp[0]), G2.a.u(E.f616a), access$get$childSerializers$cp[2]};
                    }

                    public F2.b[] d() {
                        return F.a.a(this);
                    }

                    /* renamed from: f */
                    public final Column b(e eVar) {
                        List list;
                        Float f4;
                        Alignment alignment;
                        int i4;
                        e eVar2 = eVar;
                        o.e(eVar2, "decoder");
                        f fVar = f10029b;
                        c d4 = eVar2.d(fVar);
                        F2.b[] access$get$childSerializers$cp = Column.$childSerializers;
                        Alignment alignment2 = null;
                        if (d4.p()) {
                            list = (List) d4.E(fVar, 2, access$get$childSerializers$cp[2], (Object) null);
                            alignment = (Alignment) d4.m(fVar, 0, access$get$childSerializers$cp[0], (Object) null);
                            i4 = 7;
                            f4 = (Float) d4.m(fVar, 1, E.f616a, (Object) null);
                        } else {
                            boolean z3 = true;
                            int i5 = 0;
                            Float f5 = null;
                            List list2 = null;
                            while (z3) {
                                int e4 = d4.e(fVar);
                                if (e4 == -1) {
                                    z3 = false;
                                } else if (e4 == 0) {
                                    alignment2 = (Alignment) d4.m(fVar, 0, access$get$childSerializers$cp[0], alignment2);
                                    i5 |= 1;
                                } else if (e4 == 1) {
                                    f5 = (Float) d4.m(fVar, 1, E.f616a, f5);
                                    i5 |= 2;
                                } else if (e4 == 2) {
                                    list2 = (List) d4.E(fVar, 2, access$get$childSerializers$cp[2], list2);
                                    i5 |= 4;
                                } else {
                                    throw new UnknownFieldException(e4);
                                }
                            }
                            i4 = i5;
                            alignment = alignment2;
                            f4 = f5;
                            list = list2;
                        }
                        d4.c(fVar);
                        return new Column(i4, alignment, f4, list, (C0) null);
                    }

                    /* renamed from: g */
                    public final void e(I2.f fVar, Column column) {
                        o.e(fVar, "encoder");
                        o.e(column, "value");
                        f fVar2 = f10029b;
                        d d4 = fVar.d(fVar2);
                        Column.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(column, d4, fVar2);
                        d4.c(fVar2);
                    }
                }

                public static final class b {
                    private b() {
                    }

                    public final F2.b serializer() {
                        return a.f10028a;
                    }

                    public /* synthetic */ b(i iVar) {
                        this();
                    }
                }

                public /* synthetic */ Column(int i4, Alignment alignment2, Float f4, List list, C0 c02) {
                    if (7 != (i4 & 7)) {
                        C0317n0.a(i4, 7, a.f10028a.a());
                    }
                    this.alignment = alignment2;
                    this.maxWidth = f4;
                    this.rows = list;
                }

                public static /* synthetic */ Column copy$default(Column column, Alignment alignment2, Float f4, List<Row> list, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        alignment2 = column.alignment;
                    }
                    if ((i4 & 2) != 0) {
                        f4 = column.maxWidth;
                    }
                    if ((i4 & 4) != 0) {
                        list = column.rows;
                    }
                    return column.copy(alignment2, f4, list);
                }

                public static /* synthetic */ void getAlignment$annotations() {
                }

                public static /* synthetic */ void getMaxWidth$annotations() {
                }

                public static /* synthetic */ void getRows$annotations() {
                }

                public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Column column, d dVar, f fVar) {
                    F2.b[] bVarArr = $childSerializers;
                    dVar.o(fVar, 0, bVarArr[0], column.alignment);
                    dVar.o(fVar, 1, E.f616a, column.maxWidth);
                    dVar.f(fVar, 2, bVarArr[2], column.rows);
                }

                public final Alignment component1() {
                    return this.alignment;
                }

                public final Float component2() {
                    return this.maxWidth;
                }

                public final List<Row> component3() {
                    return this.rows;
                }

                public final Column copy(Alignment alignment2, Float f4, List<Row> list) {
                    o.e(list, "rows");
                    return new Column(alignment2, f4, list);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Column)) {
                        return false;
                    }
                    Column column = (Column) obj;
                    return this.alignment == column.alignment && o.a(this.maxWidth, column.maxWidth) && o.a(this.rows, column.rows);
                }

                public final Alignment getAlignment() {
                    return this.alignment;
                }

                public final Float getMaxWidth() {
                    return this.maxWidth;
                }

                public final List<Row> getRows() {
                    return this.rows;
                }

                public int hashCode() {
                    Alignment alignment2 = this.alignment;
                    int i4 = 0;
                    int hashCode = (alignment2 == null ? 0 : alignment2.hashCode()) * 31;
                    Float f4 = this.maxWidth;
                    if (f4 != null) {
                        i4 = f4.hashCode();
                    }
                    return ((hashCode + i4) * 31) + this.rows.hashCode();
                }

                public String toString() {
                    return "Column(alignment=" + this.alignment + ", maxWidth=" + this.maxWidth + ", rows=" + this.rows + ')';
                }

                public Column(Alignment alignment2, Float f4, List<Row> list) {
                    o.e(list, "rows");
                    this.alignment = alignment2;
                    this.maxWidth = f4;
                    this.rows = list;
                }
            }

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f10030a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f10031b;

                static {
                    a aVar = new a();
                    f10030a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout", aVar, 3);
                    s0Var.p("maxHeight", true);
                    s0Var.p("defaultKeyHeight", true);
                    s0Var.p("columns", false);
                    f10031b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f10031b;
                }

                public final F2.b[] c() {
                    F2.b[] access$get$childSerializers$cp = Layout.$childSerializers;
                    return new F2.b[]{E.f616a, G2.a.u(K.f636a), access$get$childSerializers$cp[2]};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final Layout b(e eVar) {
                    List list;
                    Integer num;
                    float f4;
                    int i4;
                    e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    f fVar = f10031b;
                    c d4 = eVar2.d(fVar);
                    F2.b[] access$get$childSerializers$cp = Layout.$childSerializers;
                    if (d4.p()) {
                        float H3 = d4.H(fVar, 0);
                        list = (List) d4.E(fVar, 2, access$get$childSerializers$cp[2], (Object) null);
                        f4 = H3;
                        i4 = 7;
                        num = (Integer) d4.m(fVar, 1, K.f636a, (Object) null);
                    } else {
                        float f5 = 0.0f;
                        boolean z3 = true;
                        Integer num2 = null;
                        List list2 = null;
                        int i5 = 0;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                f5 = d4.H(fVar, 0);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                num2 = (Integer) d4.m(fVar, 1, K.f636a, num2);
                                i5 |= 2;
                            } else if (e4 == 2) {
                                list2 = (List) d4.E(fVar, 2, access$get$childSerializers$cp[2], list2);
                                i5 |= 4;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        f4 = f5;
                        i4 = i5;
                        num = num2;
                        list = list2;
                    }
                    d4.c(fVar);
                    return new Layout(i4, f4, num, list, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, Layout layout) {
                    o.e(fVar, "encoder");
                    o.e(layout, "value");
                    f fVar2 = f10031b;
                    d d4 = fVar.d(fVar2);
                    Layout.write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(layout, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f10030a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ Layout(int i4, float f4, Integer num, List list, C0 c02) {
                if (4 != (i4 & 4)) {
                    C0317n0.a(i4, 4, a.f10030a.a());
                }
                this.maxHeight = (i4 & 1) == 0 ? 1.0f : f4;
                if ((i4 & 2) == 0) {
                    this.defaultKeyHeight = null;
                } else {
                    this.defaultKeyHeight = num;
                }
                this.columns = list;
            }

            public static /* synthetic */ Layout copy$default(Layout layout, float f4, Integer num, List<Column> list, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    f4 = layout.maxHeight;
                }
                if ((i4 & 2) != 0) {
                    num = layout.defaultKeyHeight;
                }
                if ((i4 & 4) != 0) {
                    list = layout.columns;
                }
                return layout.copy(f4, num, list);
            }

            public static /* synthetic */ void getColumns$annotations() {
            }

            public static /* synthetic */ void getDefaultKeyHeight$annotations() {
            }

            public static /* synthetic */ void getMaxHeight$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(Layout layout, d dVar, f fVar) {
                F2.b[] bVarArr = $childSerializers;
                if (dVar.n(fVar, 0) || Float.compare(layout.maxHeight, 1.0f) != 0) {
                    dVar.D(fVar, 0, layout.maxHeight);
                }
                if (dVar.n(fVar, 1) || layout.defaultKeyHeight != null) {
                    dVar.o(fVar, 1, K.f636a, layout.defaultKeyHeight);
                }
                dVar.f(fVar, 2, bVarArr[2], layout.columns);
            }

            public final float component1() {
                return this.maxHeight;
            }

            public final Integer component2() {
                return this.defaultKeyHeight;
            }

            public final List<Column> component3() {
                return this.columns;
            }

            public final Layout copy(float f4, Integer num, List<Column> list) {
                o.e(list, "columns");
                return new Layout(f4, num, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Layout)) {
                    return false;
                }
                Layout layout = (Layout) obj;
                return Float.compare(this.maxHeight, layout.maxHeight) == 0 && o.a(this.defaultKeyHeight, layout.defaultKeyHeight) && o.a(this.columns, layout.columns);
            }

            public final List<Column> getColumns() {
                return this.columns;
            }

            public final Integer getDefaultKeyHeight() {
                return this.defaultKeyHeight;
            }

            public final float getMaxHeight() {
                return this.maxHeight;
            }

            public int hashCode() {
                int i4;
                int floatToIntBits = Float.floatToIntBits(this.maxHeight) * 31;
                Integer num = this.defaultKeyHeight;
                if (num == null) {
                    i4 = 0;
                } else {
                    i4 = num.hashCode();
                }
                return ((floatToIntBits + i4) * 31) + this.columns.hashCode();
            }

            public String toString() {
                return "Layout(maxHeight=" + this.maxHeight + ", defaultKeyHeight=" + this.defaultKeyHeight + ", columns=" + this.columns + ')';
            }

            public Layout(float f4, Integer num, List<Column> list) {
                o.e(list, "columns");
                this.maxHeight = f4;
                this.defaultKeyHeight = num;
                this.columns = list;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Layout(float f4, Integer num, List list, int i4, i iVar) {
                this((i4 & 1) != 0 ? 1.0f : f4, (i4 & 2) != 0 ? null : num, list);
            }
        }

        public Keyboard(Layout layout, Layout layout2, Layout layout3, Layout layout4, Layout layout5) {
            o.e(layout, "portrait");
            o.e(layout5, "landscape");
            this.portrait = layout;
            this.portraitNumbers = layout2;
            this.numbers = layout3;
            this.math = layout4;
            this.landscape = layout5;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Keyboard(Layout layout, Layout layout2, Layout layout3, Layout layout4, Layout layout5, int i4, i iVar) {
            this(layout, (i4 & 2) != 0 ? null : layout2, (i4 & 4) != 0 ? null : layout3, (i4 & 8) != 0 ? null : layout4, layout5);
        }
    }

    public JsonConfig(Layout layout2) {
        o.e(layout2, "layout");
        this.layout = layout2;
    }
}
