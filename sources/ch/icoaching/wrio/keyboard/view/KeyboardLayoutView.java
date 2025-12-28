package ch.icoaching.wrio.keyboard.view;

import M0.d;
import R0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import ch.icoaching.wrio.C0511k;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.C0559x;
import ch.icoaching.wrio.CoroutineUtilsKt;
import ch.icoaching.wrio.J;
import ch.icoaching.wrio.K;
import ch.icoaching.wrio.V;
import ch.icoaching.wrio.W;
import ch.icoaching.wrio.keyboard.KeyCase;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.JsonConfig;
import ch.icoaching.wrio.keyboard.t;
import ch.icoaching.wrio.keyboard.u;
import ch.icoaching.wrio.keyboard.v;
import ch.icoaching.wrio.keyboard.view.C0531f;
import ch.icoaching.wrio.keyboard.x;
import ch.icoaching.wrio.keyboard.y;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.L;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;
import w2.C0930a;

public abstract class KeyboardLayoutView extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    private float f10181A;

    /* renamed from: B  reason: collision with root package name */
    protected ThemeModel f10182B;

    /* renamed from: C  reason: collision with root package name */
    private final Paint f10183C;

    /* renamed from: D  reason: collision with root package name */
    private final Paint f10184D;

    /* renamed from: E  reason: collision with root package name */
    private int f10185E;

    /* renamed from: F  reason: collision with root package name */
    private v f10186F;

    /* renamed from: G  reason: collision with root package name */
    private S0.a f10187G;

    /* renamed from: H  reason: collision with root package name */
    private u f10188H;

    /* renamed from: I  reason: collision with root package name */
    private final List f10189I;

    /* renamed from: J  reason: collision with root package name */
    private int f10190J;

    /* renamed from: K  reason: collision with root package name */
    private int f10191K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public x f10192L;

    /* renamed from: M  reason: collision with root package name */
    private y f10193M;

    /* renamed from: N  reason: collision with root package name */
    private List f10194N;

    /* renamed from: O  reason: collision with root package name */
    private float f10195O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f10196P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f10197Q;

    /* renamed from: R  reason: collision with root package name */
    private int f10198R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f10199S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f10200T;

    /* renamed from: U  reason: collision with root package name */
    private int f10201U;

    /* renamed from: V  reason: collision with root package name */
    private double f10202V;

    /* renamed from: W  reason: collision with root package name */
    private boolean f10203W;

    /* renamed from: a  reason: collision with root package name */
    private int f10204a = C0553q.a(8);

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10205a0;

    /* renamed from: b  reason: collision with root package name */
    private int f10206b = C0553q.a(8);

    /* renamed from: b0  reason: collision with root package name */
    private boolean f10207b0;

    /* renamed from: c  reason: collision with root package name */
    private int f10208c = C0553q.a(16);

    /* renamed from: c0  reason: collision with root package name */
    private final kotlinx.coroutines.flow.j f10209c0;

    /* renamed from: d  reason: collision with root package name */
    private J f10210d = J.f9035c.a();

    /* renamed from: d0  reason: collision with root package name */
    private final n f10211d0;

    /* renamed from: e  reason: collision with root package name */
    private PointF f10212e;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f10213e0;

    /* renamed from: f  reason: collision with root package name */
    private MotionEvent f10214f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f10215f0;

    /* renamed from: g  reason: collision with root package name */
    private Map f10216g = new LinkedHashMap();

    /* renamed from: g0  reason: collision with root package name */
    private KeyCase f10217g0;

    /* renamed from: h  reason: collision with root package name */
    private List f10218h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f10219i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10220j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10221k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10222l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10223m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10224n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10225o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10226p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10227q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10228r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10229s;

    /* renamed from: t  reason: collision with root package name */
    private g0 f10230t;

    /* renamed from: u  reason: collision with root package name */
    private g0 f10231u;

    /* renamed from: v  reason: collision with root package name */
    private g0 f10232v;

    /* renamed from: w  reason: collision with root package name */
    private g0 f10233w;

    /* renamed from: x  reason: collision with root package name */
    private List f10234x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private long f10235y = 300;

    /* renamed from: z  reason: collision with root package name */
    private float f10236z = Float.MAX_VALUE;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f10237a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10238b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f10239c;

        public a(int i4, int i5, boolean z3) {
            this.f10237a = i4;
            this.f10238b = i5;
            this.f10239c = z3;
        }

        public final int a() {
            return this.f10237a;
        }

        public final boolean b() {
            return this.f10239c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10237a == aVar.f10237a && this.f10238b == aVar.f10238b && this.f10239c == aVar.f10239c;
        }

        public int hashCode() {
            return (((this.f10237a * 31) + this.f10238b) * 31) + androidx.work.c.a(this.f10239c);
        }

        public String toString() {
            return "DiacriticsParams(marginBetweenStemAndDiacritics=" + this.f10237a + ", popUpBottomMargin=" + this.f10238b + ", isHexagonDiacriticsView=" + this.f10239c + ')';
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10245a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f10246b;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|43) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|43) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|43) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a5 */
        static {
            /*
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type[] r0 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r2 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.EMPTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r3 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.SPACE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.CHARACTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.RETURN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.FUNCTION     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.SPLIT_LAYERS_EMOJIS_NUMBERS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.SPLIT_LAYERS_MORE_MAIN     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r5 = 7
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.SPLIT     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r5 = 8
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.CUSTOM_KEY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5 = 9
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.MORE_CHARACTERS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r5 = 10
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.EMOJI     // Catch:{ NoSuchFieldError -> 0x006e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r5 = 11
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.MORE_NUMBERS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 12
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.MORE_MATHS     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r5 = 13
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key$Type r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key.Type.MAIN_LAYOUT     // Catch:{ NoSuchFieldError -> 0x008c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r5 = 14
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                f10245a = r0
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Alignment[] r0 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Alignment r4 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Alignment.LEFT     // Catch:{ NoSuchFieldError -> 0x009d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Alignment r1 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Alignment.CENTER     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Alignment r1 = ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Alignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                f10246b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.KeyboardLayoutView.c.<clinit>():void");
        }
    }

    static final class d extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10248b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f10249c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(KeyboardLayoutView keyboardLayoutView, b bVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10248b = keyboardLayoutView;
            this.f10249c = bVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((d) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new d(this.f10248b, this.f10249c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10247a == 0) {
                kotlin.f.b(obj);
                this.f10248b.t(1, this.f10249c);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class e extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f10252c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(KeyboardLayoutView keyboardLayoutView, b bVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10251b = keyboardLayoutView;
            this.f10252c = bVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((e) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e(this.f10251b, this.f10252c, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10250a == 0) {
                kotlin.f.b(obj);
                this.f10251b.t(-1, this.f10252c);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class f extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10254b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(KeyboardLayoutView keyboardLayoutView, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10254b = keyboardLayoutView;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((f) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new f(this.f10254b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10253a == 0) {
                kotlin.f.b(obj);
                x b4 = this.f10254b.f10192L;
                if (b4 != null) {
                    b4.f(-1);
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class g extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10256b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(KeyboardLayoutView keyboardLayoutView, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10256b = keyboardLayoutView;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((g) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new g(this.f10256b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10255a == 0) {
                kotlin.f.b(obj);
                x b4 = this.f10256b.f10192L;
                if (b4 != null) {
                    b4.f(1);
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class h extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10258b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f10259c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MotionEvent f10260d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f10261e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(KeyboardLayoutView keyboardLayoutView, b bVar, MotionEvent motionEvent, int i4, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10258b = keyboardLayoutView;
            this.f10259c = bVar;
            this.f10260d = motionEvent;
            this.f10261e = i4;
        }

        /* renamed from: a */
        public final Object invoke(D d4, kotlin.coroutines.c cVar) {
            return ((h) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new h(this.f10258b, this.f10259c, this.f10260d, this.f10261e, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.f10257a;
            if (i4 == 0) {
                kotlin.f.b(obj);
                long longClickDuration = this.f10258b.getLongClickDuration();
                this.f10257a = 1;
                if (L.a(longClickDuration, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            KeyboardLayoutView keyboardLayoutView = this.f10258b;
            b bVar = this.f10259c;
            MotionEvent motionEvent = this.f10260d;
            o.b(motionEvent);
            boolean unused = keyboardLayoutView.Q(bVar, motionEvent, this.f10261e);
            return q.f14567a;
        }
    }

    static final class i extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ R0.a f10263b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(R0.a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10263b = aVar;
        }

        /* renamed from: a */
        public final Object invoke(D d4, kotlin.coroutines.c cVar) {
            return ((i) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new i(this.f10263b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.f10262a;
            if (i4 == 0) {
                kotlin.f.b(obj);
                this.f10262a = 1;
                if (L.a(100, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f10263b.d();
            return q.f14567a;
        }
    }

    static final class j extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeyboardLayoutView f10265b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(KeyboardLayoutView keyboardLayoutView, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10265b = keyboardLayoutView;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((j) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new j(this.f10265b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10264a == 0) {
                kotlin.f.b(obj);
                this.f10265b.f10219i = true;
                x b4 = this.f10265b.f10192L;
                if (b4 != null) {
                    b4.i(1);
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardLayoutView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-65536);
        this.f10183C = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(Color.parseColor("#80FFA500"));
        this.f10184D = paint2;
        this.f10189I = new ArrayList();
        this.f10194N = C0718m.j();
        this.f10195O = 1.0f;
        this.f10196P = true;
        this.f10197Q = true;
        kotlinx.coroutines.flow.j a4 = kotlinx.coroutines.flow.o.a(1, 1, BufferOverflow.DROP_OLDEST);
        this.f10209c0 = a4;
        this.f10211d0 = kotlinx.coroutines.flow.e.a(a4);
        this.f10215f0 = true;
        this.f10217g0 = KeyCase.LOWERCASE;
        if (Build.VERSION.SDK_INT >= 29) {
            setForceDarkAllowed(false);
        }
    }

    private final void B(char c4, MotionEvent motionEvent, int i4) {
        this.f10223m = true;
        this.f10222l = true;
        x xVar = this.f10192L;
        if (xVar != null) {
            xVar.o(c4, N.c(motionEvent, i4));
        }
    }

    private final boolean D(MotionEvent motionEvent, int i4) {
        d.b bVar;
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        Log log = Log.f10572a;
        Log.n(log, "KeyboardLayoutView", "processOnDown() :: (" + motionEvent.getX(findPointerIndex) + ", " + motionEvent.getY(findPointerIndex) + ')', (Throwable) null, 4, (Object) null);
        b j4 = j(motionEvent, i4);
        if (j4 == null) {
            return false;
        }
        M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = j4.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
            bVar = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
        } else {
            bVar = null;
        }
        if (o.a(bVar, d.b.f.INSTANCE) || j4.g().getVisibility() != 0) {
            return false;
        }
        if (this.f10203W) {
            J(j4);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.f10216g.put(Integer.valueOf(i4), j4);
        MotionEvent motionEvent2 = this.f10214f;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f10214f = obtain;
        if (j4.g().i()) {
            j4.g().d(C0531f.a.DEFAULT, C0531f.a.ACTIVE);
        } else {
            j4.g().c(C0531f.a.ACTIVE);
        }
        if (!this.f10229s) {
            this.f10233w = C0739h.d(V.a(j4.g()), (CoroutineContext) null, (CoroutineStart) null, new h(this, j4, obtain, i4, (kotlin.coroutines.c) null), 3, (Object) null);
        }
        x xVar = this.f10192L;
        if (xVar == null) {
            return true;
        }
        xVar.a();
        return true;
    }

    private final boolean E(MotionEvent motionEvent, int i4) {
        MotionEvent motionEvent2;
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        b bVar = (b) this.f10216g.get(Integer.valueOf(i4));
        boolean z3 = false;
        if (bVar == null || (motionEvent2 = this.f10214f) == null) {
            return false;
        }
        float x3 = motionEvent2.getX() - pointF.x;
        float y3 = motionEvent2.getY() - pointF.y;
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        S0.a aVar = this.f10187G;
        if (aVar != null) {
            aVar.l(motionEvent, new C0544t(this));
        } else {
            if (!this.f10220j && !this.f10221k && !this.f10223m) {
                if (this.f10228r) {
                    if (this.f10226p) {
                        bVar.g().j();
                        z3 = u(motionEvent);
                    } else if (this.f10225o) {
                        z3 = v(this.f10206b, bVar, motionEvent2, motionEvent, i4);
                    } else {
                        z3 = p(x3, bVar, motionEvent);
                    }
                } else if (!this.f10227q || this.f10224n) {
                    if (((int) Math.abs(x3)) > this.f10204a) {
                        g0 g0Var = this.f10233w;
                        if (g0Var != null) {
                            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
                        }
                        this.f10233w = null;
                        this.f10228r = true;
                        this.f10225o = false;
                        z3 = p(x3, bVar, motionEvent);
                    } else if (((int) Math.abs(y3)) > this.f10206b) {
                        g0 g0Var2 = this.f10233w;
                        if (g0Var2 != null) {
                            g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
                        }
                        this.f10233w = null;
                        this.f10228r = true;
                        this.f10225o = true;
                        z3 = v(this.f10206b, bVar, motionEvent2, motionEvent, i4);
                    } else if (eventTime > this.f10235y) {
                        z3 = Q(bVar, motionEvent2, i4);
                    }
                }
            }
            z3 = true;
        }
        if (z3) {
            MotionEvent motionEvent3 = this.f10214f;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.f10214f = MotionEvent.obtain(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final q F(KeyboardLayoutView keyboardLayoutView, String str) {
        o.e(str, "it");
        keyboardLayoutView.f10222l = true;
        x xVar = keyboardLayoutView.f10192L;
        if (xVar != null) {
            xVar.n(kotlin.text.o.S0(str), (PointF) null);
        }
        return q.f14567a;
    }

    private final boolean G(MotionEvent motionEvent, int i4) {
        MotionEvent motionEvent2;
        x xVar;
        x xVar2;
        d.b bVar;
        char c4;
        char c5;
        char c6;
        MotionEvent motionEvent3 = motionEvent;
        int i5 = i4;
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        Log.n(Log.f10572a, "KeyboardLayoutView", "processOnUp() :: (" + motionEvent3.getX(findPointerIndex) + ", " + motionEvent3.getY(findPointerIndex) + ')', (Throwable) null, 4, (Object) null);
        b bVar2 = (b) this.f10216g.get(Integer.valueOf(i4));
        if (bVar2 == null || (motionEvent2 = this.f10214f) == null) {
            return false;
        }
        this.f10216g.remove(Integer.valueOf(i4));
        if (this.f10216g.isEmpty()) {
            this.f10214f = null;
        }
        g0 g0Var = this.f10233w;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10233w = null;
        S0.a aVar = this.f10187G;
        if (aVar != null) {
            aVar.e();
            this.f10187G = null;
            this.f10227q = false;
            for (b g4 : this.f10189I) {
                g4.g().j();
            }
        } else {
            boolean z3 = this.f10228r;
            if (z3 && !this.f10225o) {
                if (this.f10226p) {
                    g0 g0Var2 = this.f10232v;
                    if (g0Var2 != null) {
                        g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
                    }
                    this.f10232v = null;
                } else {
                    g0 g0Var3 = this.f10231u;
                    if (g0Var3 != null) {
                        g0.a.a(g0Var3, (CancellationException) null, 1, (Object) null);
                        this.f10231u = null;
                    } else if (motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
                        float x3 = motionEvent2.getX() - motionEvent.getX();
                        if (((int) (Math.abs(x3) / ((float) this.f10208c))) > 0) {
                            if (x3 > 0.0f) {
                                s(1);
                            } else {
                                bVar2.g().performClick();
                                B(' ', motionEvent2, i5);
                            }
                        }
                    }
                }
                for (b g5 : this.f10189I) {
                    g5.g().j();
                }
            } else if ((!z3 || !this.f10225o) && !this.f10227q) {
                float y3 = motionEvent2.getY() - motionEvent.getY();
                int a4 = (int) ((((double) this.f10206b) / this.f10210d.a()) * ((Number) K.b().get(0)).doubleValue());
                if (this.f10229s || ((int) Math.abs(y3)) <= a4) {
                    M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = bVar2.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
                    if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
                        bVar = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
                    } else {
                        bVar = null;
                    }
                    if (!o.a(bVar, d.b.f.INSTANCE)) {
                        if (o.a(bVar, d.b.a.INSTANCE)) {
                            bVar2.g().performClick();
                            this.f10219i = true;
                            x xVar3 = this.f10192L;
                            if (xVar3 != null) {
                                xVar3.i(1);
                            }
                        } else if (o.a(bVar, d.b.m.INSTANCE)) {
                            bVar2.g().performClick();
                            x xVar4 = this.f10192L;
                            if (xVar4 != null) {
                                xVar4.q();
                            }
                        } else if (o.a(bVar, d.b.l.INSTANCE)) {
                            bVar2.g().performClick();
                            B(10, motionEvent2, i5);
                        } else {
                            d.b.C0011d dVar = d.b.C0011d.INSTANCE;
                            if (o.a(bVar, dVar)) {
                                if (this.f10199S) {
                                    bVar2.g().performClick();
                                    C0531f g6 = bVar2.g();
                                    M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2 = bVar2.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
                                    o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2);
                                    g6.setModel(M0.d.c(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2, d.b.k.INSTANCE, 0, 0, 0.0f, 14, (Object) null));
                                    x xVar5 = this.f10192L;
                                    if (xVar5 != null) {
                                        xVar5.m();
                                    }
                                } else {
                                    x xVar6 = this.f10192L;
                                    if (xVar6 != null) {
                                        xVar6.j();
                                    }
                                }
                            } else if (o.a(bVar, d.b.k.INSTANCE)) {
                                if (this.f10199S) {
                                    bVar2.g().performClick();
                                    C0531f g7 = bVar2.g();
                                    M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3 = bVar2.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
                                    o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3);
                                    g7.setModel(M0.d.c(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3, dVar, 0, 0, 0.0f, 14, (Object) null));
                                }
                                x xVar7 = this.f10192L;
                                if (xVar7 != null) {
                                    xVar7.m();
                                }
                            } else if (o.a(bVar, d.b.e.INSTANCE) || o.a(bVar, d.b.h.INSTANCE)) {
                                bVar2.g().performClick();
                                if (this.f10200T) {
                                    x xVar8 = this.f10192L;
                                    if (xVar8 != null) {
                                        xVar8.m();
                                    }
                                } else {
                                    x xVar9 = this.f10192L;
                                    if (xVar9 != null) {
                                        xVar9.s();
                                    }
                                }
                            } else if (o.a(bVar, d.b.n.INSTANCE)) {
                                bVar2.g().performClick();
                                B(' ', motionEvent2, i5);
                            } else if (bVar instanceof d.b.C0008b) {
                                bVar2.g().performClick();
                                if (getKeyCase().isUppercase()) {
                                    c6 = C0511k.a(((d.b.C0008b) bVar).e());
                                } else {
                                    c6 = ((d.b.C0008b) bVar).e();
                                }
                                B(c6, motionEvent2, i5);
                            } else if (bVar instanceof d.b.o) {
                                bVar2.g().performClick();
                                if (getKeyCase().isUppercase()) {
                                    c5 = C0511k.a(((d.b.o) bVar).e());
                                } else {
                                    c5 = ((d.b.o) bVar).e();
                                }
                                B(c5, motionEvent2, i5);
                            } else if (bVar instanceof d.b.c) {
                                bVar2.g().performClick();
                                if (getKeyCase().isUppercase()) {
                                    c4 = C0511k.a(((d.b.c) bVar).f());
                                } else {
                                    c4 = ((d.b.c) bVar).f();
                                }
                                B(c4, motionEvent2, i5);
                            } else if (bVar instanceof d.b.j) {
                                bVar2.g().performClick();
                                x xVar10 = this.f10192L;
                                if (xVar10 != null) {
                                    xVar10.s();
                                }
                            } else if (bVar instanceof d.b.i) {
                                bVar2.g().performClick();
                                x xVar11 = this.f10192L;
                                if (xVar11 != null) {
                                    xVar11.r();
                                }
                            } else if (bVar instanceof d.b.g) {
                                bVar2.g().performClick();
                                x xVar12 = this.f10192L;
                                if (xVar12 != null) {
                                    xVar12.p();
                                }
                            } else if (bVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                } else {
                    v(a4, bVar2, motionEvent2, motionEvent, findPointerIndex);
                }
            }
        }
        g0 g0Var4 = this.f10230t;
        if (g0Var4 != null) {
            g0.a.a(g0Var4, (CancellationException) null, 1, (Object) null);
        }
        this.f10230t = null;
        if (this.f10222l && (xVar2 = this.f10192L) != null) {
            xVar2.d();
        }
        this.f10222l = false;
        if (this.f10219i && (xVar = this.f10192L) != null) {
            xVar.b();
        }
        this.f10219i = false;
        y yVar = this.f10193M;
        if (yVar != null) {
            yVar.b();
        }
        bVar2.g().j();
        if (this.f10216g.isEmpty()) {
            i();
        }
        return true;
    }

    private final void J(b bVar) {
        d.b bVar2;
        Character ch2;
        M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease);
        a diacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = getDiacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2 = bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2 != null) {
            bVar2 = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f();
        } else {
            bVar2 = null;
        }
        if (bVar2 instanceof d.b.c) {
            ch2 = Character.valueOf(((d.b.c) bVar2).f());
        } else if (bVar2 instanceof d.b.o) {
            ch2 = Character.valueOf(((d.b.o) bVar2).e());
        } else if (bVar2 instanceof d.b.C0008b) {
            ch2 = Character.valueOf(((d.b.C0008b) bVar2).e());
        } else {
            ch2 = null;
        }
        if (ch2 != null) {
            if (getKeyCase().isUppercase()) {
                ch2 = Character.valueOf(C0511k.a(ch2.charValue()));
            }
            if (bVar.g().i()) {
                C0531f g4 = bVar.g();
                C0531f.a aVar = C0531f.a.DIACRITICS_OVERLAY;
                g4.d(aVar, aVar);
            } else {
                bVar.g().c(C0531f.a.DIACRITICS_OVERLAY);
            }
            int a4 = W.a(bVar.g());
            Rect rect = new Rect((int) bVar.c().x, (int) bVar.c().y, ((int) bVar.c().x) + model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.g(), ((int) bVar.c().y) + model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.d());
            rect.offset((int) getX(), (int) getY());
            Context context = getContext();
            o.d(context, "getContext(...)");
            R0.a a5 = new a.C0021a(context).b(rect).a(this.f10191K).d(ch2.toString()).c(getKeyboardTheme().getCharacterPreviewPopUpTheme()).e().a(this, diacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.a(), a4, diacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.b());
            g0 d4 = C0739h.d(V.a(this), (CoroutineContext) null, (CoroutineStart) null, new i(a5, (kotlin.coroutines.c) null), 3, (Object) null);
            this.f10218h.add(a5);
            this.f10234x.add(d4);
        }
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void L(ch.icoaching.wrio.keyboard.view.KeyboardLayoutView.b r7, android.view.MotionEvent r8, java.lang.String[] r9, java.lang.String r10, int r11) {
        /*
            r6 = this;
            ch.icoaching.wrio.keyboard.view.f r0 = r7.g()
            M0.d r0 = r0.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()
            kotlin.jvm.internal.o.b(r0)
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView$a r1 = r6.getDiacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()
            ch.icoaching.wrio.keyboard.view.f r2 = r7.g()
            r2.performClick()
            r2 = 0
            r3 = r9[r2]
            char r3 = kotlin.text.o.S0(r3)
            r6.B(r3, r8, r11)
            ch.icoaching.wrio.keyboard.view.f r8 = r7.g()
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x0034
            ch.icoaching.wrio.keyboard.view.f r8 = r7.g()
            ch.icoaching.wrio.keyboard.view.f$a r11 = ch.icoaching.wrio.keyboard.view.C0531f.a.DIACRITICS_OVERLAY
            r8.d(r11, r11)
            goto L_0x003d
        L_0x0034:
            ch.icoaching.wrio.keyboard.view.f r8 = r7.g()
            ch.icoaching.wrio.keyboard.view.f$a r11 = ch.icoaching.wrio.keyboard.view.C0531f.a.DIACRITICS_OVERLAY
            r8.c(r11)
        L_0x003d:
            ch.icoaching.wrio.keyboard.y r8 = r6.f10193M
            if (r8 == 0) goto L_0x0044
            r8.a()
        L_0x0044:
            ch.icoaching.wrio.keyboard.view.f r8 = r7.g()
            int r8 = r8.getWidth()
            int r8 = r6.k(r8)
            int r11 = r9.length
            if (r11 > r8) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            java.lang.Object[] r8 = kotlin.collections.C0713h.i(r9, r2, r8)
            r9 = r8
            java.lang.String[] r9 = (java.lang.String[]) r9
        L_0x005b:
            ch.icoaching.wrio.keyboard.view.f r8 = r7.g()
            int r8 = ch.icoaching.wrio.W.a(r8)
            android.graphics.Rect r11 = new android.graphics.Rect
            android.graphics.PointF r2 = r7.c()
            float r2 = r2.x
            int r2 = (int) r2
            android.graphics.PointF r3 = r7.c()
            float r3 = r3.y
            int r3 = (int) r3
            android.graphics.PointF r4 = r7.c()
            float r4 = r4.x
            int r4 = (int) r4
            int r5 = r0.g()
            int r4 = r4 + r5
            android.graphics.PointF r7 = r7.c()
            float r7 = r7.y
            int r7 = (int) r7
            int r0 = r0.d()
            int r7 = r7 + r0
            r11.<init>(r2, r3, r4, r7)
            float r7 = r6.getX()
            int r7 = (int) r7
            float r0 = r6.getY()
            int r0 = (int) r0
            r11.offset(r7, r0)
            S0.a$a r7 = new S0.a$a
            android.content.Context r0 = r6.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.d(r0, r2)
            r7.<init>(r0)
            S0.a$a r7 = r7.b(r11)
            int r11 = r6.f10206b
            S0.a$a r7 = r7.h(r11)
            int r11 = r6.f10191K
            S0.a$a r7 = r7.a(r11)
            S0.a$a r7 = r7.f(r9)
            ch.icoaching.wrio.keyboard.model.ThemeModel r9 = r6.getKeyboardTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$b r9 = r9.getDiacriticsPopUpTheme()
            S0.a$a r7 = r7.c(r9)
            S0.a$a r7 = r7.d(r10)
            S0.a r7 = r7.g()
            int r9 = r1.a()
            boolean r10 = r1.b()
            S0.a r7 = r7.a(r6, r9, r8, r10)
            r6.f10187G = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.KeyboardLayoutView.L(ch.icoaching.wrio.keyboard.view.KeyboardLayoutView$b, android.view.MotionEvent, java.lang.String[], java.lang.String, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Character} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Character} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Character} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.Character} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0290, code lost:
        if (r0 == null) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02cc, code lost:
        if (r0 == null) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0335, code lost:
        if (r0 == null) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        if (r0 != null) goto L_0x021e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0202 A[LOOP:3: B:86:0x0200->B:87:0x0202, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Q(ch.icoaching.wrio.keyboard.view.KeyboardLayoutView.b r19, android.view.MotionEvent r20, int r21) {
        /*
            r18 = this;
            r9 = r18
            boolean r0 = r9.f10227q
            r1 = 0
            if (r0 != 0) goto L_0x036e
            boolean r0 = r9.f10229s
            if (r0 != 0) goto L_0x036e
            java.util.Map r0 = r9.f10216g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L_0x0019
            goto L_0x036e
        L_0x0019:
            r10 = 1
            r9.f10227q = r10
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            M0.d r0 = r0.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()
            r2 = 0
            if (r0 == 0) goto L_0x002c
            M0.d$b r0 = r0.f()
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            M0.d$b$a r3 = M0.d.b.a.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 == 0) goto L_0x005f
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            kotlinx.coroutines.g0 r0 = r9.f10230t
            if (r0 != 0) goto L_0x036b
            r7 = 2
            r8 = 0
            r3 = 50
            r5 = 0
            kotlinx.coroutines.flow.c r0 = ch.icoaching.wrio.CoroutineUtilsKt.b(r3, r5, r7, r8)
            ch.icoaching.wrio.keyboard.view.KeyboardLayoutView$j r3 = new ch.icoaching.wrio.keyboard.view.KeyboardLayoutView$j
            r3.<init>(r9, r2)
            kotlinx.coroutines.flow.c r0 = kotlinx.coroutines.flow.e.k(r0, r3)
            kotlinx.coroutines.D r2 = ch.icoaching.wrio.V.a(r18)
            kotlinx.coroutines.g0 r0 = kotlinx.coroutines.flow.e.j(r0, r2)
            r9.f10230t = r0
            goto L_0x036b
        L_0x005f:
            M0.d$b$l r3 = M0.d.b.l.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            r4 = 10
            if (r3 == 0) goto L_0x0079
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            r5 = r20
            r6 = r21
            r9.B(r4, r5, r6)
            goto L_0x036b
        L_0x0079:
            r5 = r20
            r6 = r21
            M0.d$b$m r3 = M0.d.b.m.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 == 0) goto L_0x0095
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.t()
            goto L_0x036b
        L_0x0095:
            M0.d$b$n r3 = M0.d.b.n.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 == 0) goto L_0x00b7
            boolean r0 = r18.z()
            if (r0 == 0) goto L_0x036b
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            r9.f10228r = r10
            r9.f10226p = r10
            ch.icoaching.wrio.keyboard.y r0 = r9.f10193M
            if (r0 == 0) goto L_0x036b
            r0.a()
            goto L_0x036b
        L_0x00b7:
            M0.d$b$d r3 = M0.d.b.C0011d.INSTANCE
            boolean r7 = kotlin.jvm.internal.o.a(r0, r3)
            if (r7 == 0) goto L_0x00fb
            boolean r0 = r9.f10199S
            if (r0 == 0) goto L_0x00f2
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            ch.icoaching.wrio.keyboard.view.f r2 = r19.g()
            M0.d r11 = r2.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()
            kotlin.jvm.internal.o.b(r11)
            M0.d$b$k r12 = M0.d.b.k.INSTANCE
            r16 = 14
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            M0.d r2 = M0.d.c(r11, r12, r13, r14, r15, r16, r17)
            r0.setModel(r2)
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.m()
            goto L_0x036b
        L_0x00f2:
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.j()
            goto L_0x036b
        L_0x00fb:
            M0.d$b$k r7 = M0.d.b.k.INSTANCE
            boolean r7 = kotlin.jvm.internal.o.a(r0, r7)
            if (r7 == 0) goto L_0x0133
            boolean r0 = r9.f10199S
            if (r0 == 0) goto L_0x012a
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            ch.icoaching.wrio.keyboard.view.f r2 = r19.g()
            M0.d r2 = r2.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()
            kotlin.jvm.internal.o.b(r2)
            r7 = 14
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            M0.d r2 = M0.d.c(r2, r3, r4, r5, r6, r7, r8)
            r0.setModel(r2)
        L_0x012a:
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.m()
            goto L_0x036b
        L_0x0133:
            M0.d$b$e r3 = M0.d.b.e.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 != 0) goto L_0x0351
            M0.d$b$h r3 = M0.d.b.h.INSTANCE
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 == 0) goto L_0x0145
            goto L_0x0351
        L_0x0145:
            boolean r3 = r0 instanceof M0.d.b.c
            if (r3 == 0) goto L_0x0235
            ch.icoaching.wrio.keyboard.KeyCase r3 = r18.getKeyCase()
            boolean r3 = r3.isUppercase()
            if (r3 == 0) goto L_0x015f
            r3 = r0
            M0.d$b$c r3 = (M0.d.b.c) r3
            char r3 = r3.f()
            char r3 = ch.icoaching.wrio.C0511k.a(r3)
            goto L_0x0166
        L_0x015f:
            r3 = r0
            M0.d$b$c r3 = (M0.d.b.c) r3
            char r3 = r3.f()
        L_0x0166:
            M0.d$b$c r0 = (M0.d.b.c) r0
            java.util.List r7 = r0.g()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0175:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0190
            java.lang.Object r11 = r7.next()
            r12 = r11
            java.lang.Character r12 = (java.lang.Character) r12
            char r12 = r12.charValue()
            boolean r12 = java.lang.Character.isDigit(r12)
            if (r12 != 0) goto L_0x0175
            r8.add(r11)
            goto L_0x0175
        L_0x0190:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r4 = kotlin.collections.C0718m.t(r8, r4)
            r7.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
        L_0x019d:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01b5
            java.lang.Object r8 = r4.next()
            java.lang.Character r8 = (java.lang.Character) r8
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.add(r8)
            goto L_0x019d
        L_0x01b5:
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r4 = r7.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            boolean r7 = r9.f10205a0
            if (r7 == 0) goto L_0x01eb
            java.util.List r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L_0x01c9:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x01e1
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.lang.Character r8 = (java.lang.Character) r8
            char r8 = r8.charValue()
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 == 0) goto L_0x01c9
            r2 = r7
        L_0x01e1:
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 == 0) goto L_0x01eb
            java.lang.String r0 = r2.toString()
        L_0x01e9:
            r7 = r0
            goto L_0x01ee
        L_0x01eb:
            java.lang.String r0 = ""
            goto L_0x01e9
        L_0x01ee:
            ch.icoaching.wrio.keyboard.v r0 = r9.f10186F
            if (r0 == 0) goto L_0x021c
            java.lang.Character[] r0 = r0.a(r3)
            if (r0 == 0) goto L_0x021c
            java.util.ArrayList r2 = new java.util.ArrayList
            int r8 = r0.length
            r2.<init>(r8)
            int r8 = r0.length
            r11 = r1
        L_0x0200:
            if (r11 >= r8) goto L_0x0212
            r12 = r0[r11]
            char r12 = r12.charValue()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.add(r12)
            int r11 = r11 + 1
            goto L_0x0200
        L_0x0212:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x021e
        L_0x021c:
            java.lang.String[] r0 = new java.lang.String[r1]
        L_0x021e:
            java.lang.Object[] r0 = kotlin.collections.C0713h.m(r0, r4)
            r2 = r0
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = r18
            r1 = r3
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r7
            r0.q(r1, r2, r3, r4, r5, r6)
        L_0x0232:
            r1 = r10
            goto L_0x036b
        L_0x0235:
            boolean r2 = r0 instanceof M0.d.b.o
            if (r2 == 0) goto L_0x02e8
            ch.icoaching.wrio.keyboard.KeyCase r2 = r18.getKeyCase()
            boolean r2 = r2.isUppercase()
            if (r2 == 0) goto L_0x024f
            r2 = r0
            M0.d$b$o r2 = (M0.d.b.o) r2
            char r2 = r2.e()
            char r2 = ch.icoaching.wrio.C0511k.a(r2)
            goto L_0x0256
        L_0x024f:
            r2 = r0
            M0.d$b$o r2 = (M0.d.b.o) r2
            char r2 = r2.e()
        L_0x0256:
            M0.d$b$o r0 = (M0.d.b.o) r0
            java.lang.String r0 = r0.g()
            java.lang.String r3 = "split1"
            boolean r3 = kotlin.jvm.internal.o.a(r0, r3)
            if (r3 == 0) goto L_0x0298
            ch.icoaching.wrio.keyboard.u r0 = r9.f10188H
            if (r0 == 0) goto L_0x0295
            java.lang.Character[] r0 = r0.d()
            if (r0 == 0) goto L_0x0295
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            int r4 = r0.length
            r7 = r1
        L_0x0276:
            if (r7 >= r4) goto L_0x0288
            r8 = r0[r7]
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x0276
        L_0x0288:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x0293
            goto L_0x0295
        L_0x0293:
            r3 = r0
            goto L_0x02d4
        L_0x0295:
            java.lang.String[] r0 = new java.lang.String[r1]
            goto L_0x0293
        L_0x0298:
            java.lang.String r3 = "split2"
            boolean r0 = kotlin.jvm.internal.o.a(r0, r3)
            if (r0 == 0) goto L_0x02d1
            ch.icoaching.wrio.keyboard.u r0 = r9.f10188H
            if (r0 == 0) goto L_0x02ce
            java.lang.Character[] r0 = r0.a()
            if (r0 == 0) goto L_0x02ce
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            int r4 = r0.length
            r7 = r1
        L_0x02b2:
            if (r7 >= r4) goto L_0x02c4
            r8 = r0[r7]
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x02b2
        L_0x02c4:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x0293
        L_0x02ce:
            java.lang.String[] r0 = new java.lang.String[r1]
            goto L_0x0293
        L_0x02d1:
            java.lang.String[] r0 = new java.lang.String[r1]
            goto L_0x0293
        L_0x02d4:
            r7 = 32
            r8 = 0
            r11 = 0
            r0 = r18
            r1 = r2
            r2 = r3
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r11
            r(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0232
        L_0x02e8:
            boolean r2 = r0 instanceof M0.d.b.C0008b
            if (r2 == 0) goto L_0x036b
            ch.icoaching.wrio.keyboard.KeyCase r2 = r18.getKeyCase()
            boolean r2 = r2.isUppercase()
            if (r2 == 0) goto L_0x0302
            M0.d$b$b r0 = (M0.d.b.C0008b) r0
            char r0 = r0.e()
            char r0 = ch.icoaching.wrio.C0511k.a(r0)
        L_0x0300:
            r2 = r0
            goto L_0x0309
        L_0x0302:
            M0.d$b$b r0 = (M0.d.b.C0008b) r0
            char r0 = r0.e()
            goto L_0x0300
        L_0x0309:
            ch.icoaching.wrio.keyboard.v r0 = r9.f10186F
            if (r0 == 0) goto L_0x033a
            java.lang.Character[] r0 = r0.a(r2)
            if (r0 == 0) goto L_0x033a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.length
            r3.<init>(r4)
            int r4 = r0.length
            r7 = r1
        L_0x031b:
            if (r7 >= r4) goto L_0x032d
            r8 = r0[r7]
            char r8 = r8.charValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x031b
        L_0x032d:
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x0338
            goto L_0x033a
        L_0x0338:
            r3 = r0
            goto L_0x033d
        L_0x033a:
            java.lang.String[] r0 = new java.lang.String[r1]
            goto L_0x0338
        L_0x033d:
            r7 = 32
            r8 = 0
            r11 = 0
            r0 = r18
            r1 = r2
            r2 = r3
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r11
            r(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0232
        L_0x0351:
            ch.icoaching.wrio.keyboard.view.f r0 = r19.g()
            r0.performClick()
            boolean r0 = r9.f10200T
            if (r0 == 0) goto L_0x0364
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.m()
            goto L_0x036b
        L_0x0364:
            ch.icoaching.wrio.keyboard.x r0 = r9.f10192L
            if (r0 == 0) goto L_0x036b
            r0.s()
        L_0x036b:
            r9.f10224n = r1
            r1 = r10
        L_0x036e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.KeyboardLayoutView.Q(ch.icoaching.wrio.keyboard.view.KeyboardLayoutView$b, android.view.MotionEvent, int):boolean");
    }

    private final void g() {
        g0 g0Var = this.f10230t;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10230t = null;
        g0 g0Var2 = this.f10231u;
        if (g0Var2 != null) {
            g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f10231u = null;
        g0 g0Var3 = this.f10232v;
        if (g0Var3 != null) {
            g0.a.a(g0Var3, (CancellationException) null, 1, (Object) null);
        }
        this.f10232v = null;
        g0 g0Var4 = this.f10233w;
        if (g0Var4 != null) {
            g0.a.a(g0Var4, (CancellationException) null, 1, (Object) null);
        }
        this.f10233w = null;
        S0.a aVar = this.f10187G;
        if (aVar != null) {
            aVar.e();
        }
        this.f10187G = null;
        y yVar = this.f10193M;
        if (yVar != null) {
            yVar.b();
        }
        h();
        i();
    }

    private final void h() {
        for (g0 a4 : this.f10234x) {
            g0.a.a(a4, (CancellationException) null, 1, (Object) null);
        }
        this.f10234x.clear();
        for (R0.a d4 : this.f10218h) {
            d4.d();
        }
        this.f10218h.clear();
    }

    private final void i() {
        Log.n(Log.f10572a, "KeyboardLayoutView", "clearClassFields()", (Throwable) null, 4, (Object) null);
        this.f10216g.clear();
        g0 g0Var = this.f10230t;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10230t = null;
        this.f10219i = false;
        this.f10222l = false;
        this.f10214f = null;
        this.f10212e = null;
        this.f10220j = false;
        this.f10221k = false;
        this.f10223m = false;
        this.f10224n = false;
        this.f10225o = false;
        this.f10226p = false;
        this.f10227q = false;
        this.f10228r = false;
        this.f10229s = false;
    }

    private final b j(MotionEvent motionEvent, int i4) {
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        if (this.f10189I.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f10189I.get(0);
        float a4 = C0559x.a(pointF, b.d(bVar, false, 1, (Object) null));
        if (bVar.g().h()) {
            a4 *= this.f10195O;
        }
        for (b bVar2 : this.f10189I) {
            float b4 = b.b(bVar2, pointF, false, 2, (Object) null);
            if (bVar2.g().h() && bVar2.a(pointF, false) < ((float) bVar2.g().getWidth())) {
                b4 *= this.f10195O;
            }
            if (b4 < a4) {
                bVar = bVar2;
                a4 = b4;
            }
        }
        PointF d4 = b.d(bVar, false, 1, (Object) null);
        String str = "findClosestKeyView() :: Closest key is at " + ('(' + d4.x + ", " + d4.y + ')') + " | " + bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        o.d(str, "toString(...)");
        Log log = Log.f10572a;
        Log.d(log, "KeyboardLayoutView", str, (Throwable) null, 4, (Object) null);
        if (a4 <= ((float) Math.max(bVar.g().getWidth(), bVar.g().getHeight()))) {
            return bVar;
        }
        Log.d(log, "KeyboardLayoutView", "findClosestKeyView() :: Discarding press.", (Throwable) null, 4, (Object) null);
        return null;
    }

    private final float l(JsonConfig.Keyboard.Layout.Column column, boolean z3) {
        float f4 = 0.0f;
        for (JsonConfig.Keyboard.Layout.Column.Row o4 : column.getRows()) {
            f4 = Math.max(f4, o(o4, z3));
        }
        return f4;
    }

    public static /* synthetic */ float n(KeyboardLayoutView keyboardLayoutView, List list, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z3 = true;
            }
            return keyboardLayoutView.m(list, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMaxRowWidth");
    }

    private final float o(JsonConfig.Keyboard.Layout.Column.Row row, boolean z3) {
        float f4;
        if (!z3) {
            return (float) row.getRowItems().size();
        }
        float f5 = 0.0f;
        for (JsonConfig.Keyboard.Layout.Column.Row.Key width : row.getRowItems()) {
            Float width2 = width.getWidth();
            if (width2 != null) {
                f4 = width2.floatValue();
            } else {
                f4 = 1.0f;
            }
            f5 += f4;
        }
        return f5;
    }

    private final boolean p(float f4, b bVar, MotionEvent motionEvent) {
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
            return false;
        }
        PointF pointF = this.f10212e;
        int i4 = 1;
        if (pointF == null) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            y yVar = this.f10193M;
            if (yVar != null) {
                yVar.a();
            }
            if (f4 <= 0.0f) {
                i4 = -1;
            }
            t(i4, bVar);
            return false;
        } else if (motionEvent.getX() < this.f10181A) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10231u == null) {
                this.f10231u = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new d(this, bVar, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else if (motionEvent.getX() > this.f10236z) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10231u == null) {
                this.f10231u = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new e(this, bVar, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else {
            g0 g0Var = this.f10231u;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10231u = null;
            float x3 = pointF.x - motionEvent.getX();
            int abs = (int) (Math.abs(x3) / ((float) this.f10208c));
            if (abs > 0) {
                if (x3 <= 0.0f) {
                    abs *= -1;
                }
                this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
                t(abs, bVar);
            }
            return false;
        }
    }

    private final void q(char c4, String[] strArr, b bVar, MotionEvent motionEvent, int i4, String str) {
        if (strArr.length == 0 && o.a(str, "")) {
            bVar.g().performClick();
            B(c4, motionEvent, i4);
        } else if (strArr.length == 0) {
            L(bVar, motionEvent, new String[]{str}, "", i4);
        } else {
            L(bVar, motionEvent, strArr, str, i4);
        }
    }

    static /* synthetic */ void r(KeyboardLayoutView keyboardLayoutView, char c4, String[] strArr, b bVar, MotionEvent motionEvent, int i4, String str, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 32) != 0) {
                str = "";
            }
            keyboardLayoutView.q(c4, strArr, bVar, motionEvent, i4, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleOnLongClickCharacter");
    }

    private final void s(int i4) {
        if (!this.f10227q) {
            Log log = Log.f10572a;
            Log.d(log, "KeyboardLayoutView", "handleScrollToDeleteGesture() :: " + i4, (Throwable) null, 4, (Object) null);
            if (i4 > 0) {
                this.f10219i = true;
                x xVar = this.f10192L;
                if (xVar != null) {
                    xVar.i(i4);
                    return;
                }
                return;
            }
            this.f10219i = true;
            x xVar2 = this.f10192L;
            if (xVar2 != null) {
                xVar2.h(Math.abs(i4));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void t(int i4, b bVar) {
        d.b bVar2;
        bVar.g().j();
        M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
            bVar2 = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
        } else {
            bVar2 = null;
        }
        if (o.a(bVar2, d.b.a.INSTANCE)) {
            s(i4);
        } else if (o.a(bVar2, d.b.e.INSTANCE) || o.a(bVar2, d.b.h.INSTANCE) || o.a(bVar2, d.b.C0011d.INSTANCE) || o.a(bVar2, d.b.k.INSTANCE)) {
            s(i4);
        } else if (o.a(bVar2, d.b.l.INSTANCE)) {
            s(i4);
        } else if (o.a(bVar2, d.b.m.INSTANCE)) {
            s(i4);
        } else if (bVar2 instanceof d.b.C0008b) {
            s(i4);
        } else if (bVar2 instanceof d.b.o) {
            s(i4);
        } else if (bVar2 instanceof d.b.c) {
            s(i4);
        } else if (bVar2 instanceof d.b.n) {
            s(i4);
        }
    }

    private final boolean u(MotionEvent motionEvent) {
        PointF pointF = this.f10212e;
        if (pointF == null) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            return false;
        } else if (motionEvent.getX() < this.f10181A) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10232v == null) {
                this.f10232v = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new f(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else if (motionEvent.getX() > this.f10236z) {
            this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10232v == null) {
                this.f10232v = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new g(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else {
            g0 g0Var = this.f10232v;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10232v = null;
            float x3 = pointF.x - motionEvent.getX();
            int abs = (int) (Math.abs(x3) / ((float) this.f10208c));
            if (abs > 0) {
                if (x3 >= 0.0f) {
                    abs *= -1;
                }
                this.f10212e = new PointF(motionEvent.getX(), motionEvent.getY());
                x xVar = this.f10192L;
                if (xVar != null) {
                    xVar.f(abs);
                }
            }
            return false;
        }
    }

    private final boolean v(int i4, b bVar, MotionEvent motionEvent, MotionEvent motionEvent2, int i5) {
        d.b bVar2;
        float y3 = motionEvent.getY() - motionEvent2.getY();
        if (((int) Math.abs(y3)) <= i4) {
            return false;
        }
        M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
            bVar2 = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
        } else {
            bVar2 = null;
        }
        if (o.a(bVar2, d.b.e.INSTANCE) || o.a(bVar2, d.b.h.INSTANCE)) {
            if (y3 > 0.0f) {
                this.f10220j = true;
                bVar.g().performClick();
                x xVar = this.f10192L;
                if (xVar != null) {
                    xVar.l();
                }
            } else {
                x xVar2 = this.f10192L;
                if (xVar2 == null) {
                    return false;
                }
                xVar2.g((Character) null, (PointF) null, false);
                return false;
            }
        } else if (bVar2 instanceof d.b.C0008b) {
            return w(bVar, motionEvent2, i5, y3, ((d.b.C0008b) bVar2).e());
        } else if (bVar2 instanceof d.b.o) {
            d.b.o oVar = (d.b.o) bVar2;
            return x(bVar, motionEvent2, i5, y3, oVar.e(), oVar.f());
        } else if (bVar2 instanceof d.b.c) {
            d.b.c cVar = (d.b.c) bVar2;
            if (cVar.h() == null) {
                return w(bVar, motionEvent2, i5, y3, cVar.f());
            }
            return x(bVar, motionEvent2, i5, y3, cVar.f(), cVar.h().charValue());
        } else if ((bVar2 instanceof d.b.n) || (bVar2 instanceof d.b.m) || (bVar2 instanceof d.b.a)) {
            if (y3 >= 0.0f) {
                return false;
            }
            x xVar3 = this.f10192L;
            if (xVar3 != null) {
                xVar3.g((Character) null, (PointF) null, false);
            }
        } else if (!(bVar2 instanceof d.b.l)) {
            return false;
        } else {
            if (y3 > 0.0f) {
                this.f10221k = true;
                x xVar4 = this.f10192L;
                if (xVar4 != null) {
                    xVar4.k(N.c(motionEvent2, i5));
                }
            } else {
                x xVar5 = this.f10192L;
                if (xVar5 != null) {
                    xVar5.g((Character) null, (PointF) null, false);
                }
            }
        }
        return true;
    }

    private final boolean w(b bVar, MotionEvent motionEvent, int i4, float f4, char c4) {
        bVar.g().performClick();
        PointF a4 = N.c(motionEvent, i4);
        char lowerCase = Character.toLowerCase(c4);
        if (f4 < 0.0f) {
            x xVar = this.f10192L;
            if (xVar != null) {
                xVar.g(Character.valueOf(lowerCase), a4, this.f10223m);
            }
        } else {
            char a5 = C0511k.a(c4);
            x xVar2 = this.f10192L;
            if (xVar2 != null) {
                xVar2.e(a5, a4, this.f10223m);
            }
        }
        this.f10223m = true;
        this.f10222l = true;
        return true;
    }

    private final boolean x(b bVar, MotionEvent motionEvent, int i4, float f4, char c4, char c5) {
        bVar.g().performClick();
        PointF a4 = N.c(motionEvent, i4);
        if (f4 < 0.0f) {
            bVar.g().d(C0531f.a.DEFAULT, C0531f.a.ACTIVE);
            x xVar = this.f10192L;
            if (xVar != null) {
                xVar.g(Character.valueOf(c4), a4, this.f10223m);
            }
        } else {
            bVar.g().d(C0531f.a.ACTIVE, C0531f.a.DEFAULT);
            x xVar2 = this.f10192L;
            if (xVar2 != null) {
                xVar2.e(c5, a4, this.f10223m);
            }
        }
        this.f10223m = true;
        this.f10222l = true;
        return true;
    }

    public boolean A() {
        return this.f10213e0;
    }

    public void C() {
        for (b g4 : this.f10189I) {
            g4.g().j();
        }
        g();
    }

    public final void H(C0531f fVar, d.b.c cVar) {
        Character[] chArr;
        o.e(fVar, "key");
        o.e(cVar, "customKeyType");
        Character ch2 = (Character) C0718m.S(cVar.g());
        if (ch2 != null) {
            if (Character.isDigit(ch2.charValue()) && this.f10205a0) {
                fVar.setTertiaryCharacter(ch2.charValue());
                return;
            } else if (!Character.isDigit(ch2.charValue())) {
                fVar.setTertiaryCharacter(ch2.charValue());
                return;
            }
        }
        v vVar = this.f10186F;
        if (vVar != null) {
            chArr = vVar.a(cVar.f());
        } else {
            chArr = null;
        }
        if (chArr != null && chArr.length != 0) {
            fVar.setTertiaryCharacter(((Character) C0713h.z(chArr)).charValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void I() {
        int i4 = this.f10198R;
        int i5 = (int) (((double) this.f10190J) * this.f10202V);
        this.f10201U = i5;
        setPaddingRelative(i4, i4, i4, this.f10185E + i4 + i5);
    }

    public void K(boolean z3) {
        this.f10203W = z3;
    }

    public void M(boolean z3) {
        this.f10205a0 = z3;
    }

    public void N(boolean z3) {
        this.f10207b0 = z3;
    }

    public final int O(JsonConfig.Keyboard.Layout.Column.Alignment alignment) {
        o.e(alignment, "<this>");
        int i4 = c.f10246b[alignment.ordinal()];
        if (i4 == 1) {
            return 8388611;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 8388613;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final M0.d P(JsonConfig.Keyboard.Layout.Column.Row.Key key, int i4, int i5) {
        Character ch2;
        o.e(key, "<this>");
        float f4 = 1.0f;
        switch (c.f10245a[key.getType().ordinal()]) {
            case 1:
                d.b.f fVar = d.b.f.INSTANCE;
                Float width = key.getWidth();
                if (width != null) {
                    f4 = width.floatValue();
                }
                return new M0.d(fVar, i4, i5, f4);
            case 2:
                d.b.n nVar = d.b.n.INSTANCE;
                Float width2 = key.getWidth();
                if (width2 != null) {
                    f4 = width2.floatValue();
                }
                return new M0.d(nVar, i4, i5, f4);
            case 3:
                String content = key.getContent();
                o.b(content);
                d.b.C0008b bVar = new d.b.C0008b(content.charAt(0));
                Float width3 = key.getWidth();
                if (width3 != null) {
                    f4 = width3.floatValue();
                }
                return new M0.d(bVar, i4, i5, f4);
            case 4:
                d.b.l lVar = d.b.l.INSTANCE;
                Float width4 = key.getWidth();
                if (width4 != null) {
                    f4 = width4.floatValue();
                }
                return new M0.d(lVar, i4, i5, f4);
            case 5:
                String content2 = key.getContent();
                if (content2 != null) {
                    int hashCode = content2.hashCode();
                    if (hashCode != 98449901) {
                        if (hashCode != 109407362) {
                            if (hashCode == 1353507967 && content2.equals("backspace")) {
                                d.b.a aVar = d.b.a.INSTANCE;
                                Float width5 = key.getWidth();
                                if (width5 != null) {
                                    f4 = width5.floatValue();
                                }
                                return new M0.d(aVar, i4, i5, f4);
                            }
                        } else if (content2.equals("shift")) {
                            d.b.m mVar = d.b.m.INSTANCE;
                            Float width6 = key.getWidth();
                            if (width6 != null) {
                                f4 = width6.floatValue();
                            }
                            return new M0.d(mVar, i4, i5, f4);
                        }
                    } else if (content2.equals("globe")) {
                        d.b.f fVar2 = d.b.f.INSTANCE;
                        Float width7 = key.getWidth();
                        if (width7 != null) {
                            f4 = width7.floatValue();
                        }
                        return new M0.d(fVar2, i4, i5, f4);
                    }
                }
                throw new IllegalArgumentException("Function key type with content '" + key.getContent() + "' not supported!");
            case 6:
                d.b.e eVar = d.b.e.INSTANCE;
                Float width8 = key.getWidth();
                if (width8 != null) {
                    f4 = width8.floatValue();
                }
                return new M0.d(eVar, i4, i5, f4);
            case 7:
                d.b.h hVar = d.b.h.INSTANCE;
                Float width9 = key.getWidth();
                if (width9 != null) {
                    f4 = width9.floatValue();
                }
                return new M0.d(hVar, i4, i5, f4);
            case 8:
                String id = key.getId();
                if (o.a(id, "split1")) {
                    d.b.o oVar = new d.b.o("split1", '.', ',');
                    Float width10 = key.getWidth();
                    if (width10 != null) {
                        f4 = width10.floatValue();
                    }
                    return new M0.d(oVar, i4, i5, f4);
                } else if (o.a(id, "split2")) {
                    d.b.o oVar2 = new d.b.o("split2", '?', '!');
                    Float width11 = key.getWidth();
                    if (width11 != null) {
                        f4 = width11.floatValue();
                    }
                    return new M0.d(oVar2, i4, i5, f4);
                } else {
                    throw new IllegalArgumentException("Split key type with id '" + key.getId() + "' not supported!");
                }
            case 9:
                JsonConfig.Keyboard.Layout.Column.Row.Key.CustomKeyDefaults customKeyDefaults = key.getCustomKeyDefaults();
                o.b(customKeyDefaults);
                List<String> hold = customKeyDefaults.getHold();
                if (hold == null) {
                    hold = C0718m.j();
                }
                char charAt = key.getCustomKeyDefaults().getTap().charAt(0);
                String swipeUp = key.getCustomKeyDefaults().getSwipeUp();
                if (swipeUp != null) {
                    ch2 = Character.valueOf(swipeUp.charAt(0));
                } else {
                    ch2 = null;
                }
                ArrayList arrayList = new ArrayList(C0718m.t(hold, 10));
                for (String charAt2 : hold) {
                    arrayList.add(Character.valueOf(charAt2.charAt(0)));
                }
                d.b.c cVar = new d.b.c(charAt, ch2, arrayList);
                Float width12 = key.getWidth();
                if (width12 != null) {
                    f4 = width12.floatValue();
                }
                return new M0.d(cVar, i4, i5, f4);
            case 10:
                d.b.k kVar = d.b.k.INSTANCE;
                Float width13 = key.getWidth();
                if (width13 != null) {
                    f4 = width13.floatValue();
                }
                return new M0.d(kVar, i4, i5, f4);
            case 11:
                d.b.C0011d dVar = d.b.C0011d.INSTANCE;
                Float width14 = key.getWidth();
                if (width14 != null) {
                    f4 = width14.floatValue();
                }
                return new M0.d(dVar, i4, i5, f4);
            case 12:
                d.b.j jVar = d.b.j.INSTANCE;
                Float width15 = key.getWidth();
                if (width15 != null) {
                    f4 = width15.floatValue();
                }
                return new M0.d(jVar, i4, i5, f4);
            case 13:
                d.b.i iVar = d.b.i.INSTANCE;
                Float width16 = key.getWidth();
                if (width16 != null) {
                    f4 = width16.floatValue();
                }
                return new M0.d(iVar, i4, i5, f4);
            case 14:
                d.b.g gVar = d.b.g.INSTANCE;
                Float width17 = key.getWidth();
                if (width17 != null) {
                    f4 = width17.floatValue();
                }
                return new M0.d(gVar, i4, i5, f4);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: protected */
    public final void R() {
        int i4;
        for (b bVar : this.f10189I) {
            if (bVar.g().f()) {
                C0531f g4 = bVar.g();
                if (this.f10196P) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                g4.setVisibility(i4);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void S() {
        int i4;
        for (b bVar : this.f10189I) {
            if (bVar.g().g()) {
                C0531f g4 = bVar.g();
                if (this.f10197Q) {
                    i4 = 0;
                } else {
                    i4 = 4;
                }
                g4.setVisibility(i4);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        o.e(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        PointF pointF;
        Object obj;
        for (b bVar : this.f10189I) {
            Iterator it = this.f10194N.iterator();
            while (true) {
                pointF = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((t) obj).c() == bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()) {
                    break;
                }
            }
            t tVar = (t) obj;
            if (tVar != null) {
                pointF = tVar.e();
            }
            if (pointF != null) {
                bVar.f(pointF);
            }
        }
    }

    public abstract /* synthetic */ int getColumnWidth();

    public int getCustomBottomMargin() {
        return this.f10201U;
    }

    /* access modifiers changed from: protected */
    public final u getCustomCharactersProviderInternal() {
        return this.f10188H;
    }

    public abstract a getDiacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();

    /* access modifiers changed from: protected */
    public final v getDiacriticsProviderInternal() {
        return this.f10186F;
    }

    public KeyCase getKeyCase() {
        return this.f10217g0;
    }

    public n getKeyCentresFlow() {
        return this.f10211d0;
    }

    /* access modifiers changed from: protected */
    public final kotlinx.coroutines.flow.j getKeyCentresFlowInner() {
        return this.f10209c0;
    }

    /* access modifiers changed from: protected */
    public final int getKeyPadding() {
        return this.f10191K;
    }

    /* access modifiers changed from: protected */
    public final int getKeyboardPadding() {
        return this.f10198R;
    }

    /* access modifiers changed from: protected */
    public final ThemeModel getKeyboardTheme() {
        ThemeModel themeModel = this.f10182B;
        if (themeModel != null) {
            return themeModel;
        }
        o.p("keyboardTheme");
        return null;
    }

    public final List<b> getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10189I;
    }

    public final long getLongClickDuration() {
        return this.f10235y;
    }

    /* access modifiers changed from: protected */
    public final boolean getShowNumbersOnMainLayout() {
        return this.f10205a0;
    }

    /* access modifiers changed from: protected */
    public final boolean getShowTinyCharacters() {
        return this.f10207b0;
    }

    /* access modifiers changed from: protected */
    public final int getStandardKeyWidth() {
        return this.f10190J;
    }

    /* access modifiers changed from: protected */
    public abstract int k(int i4);

    public final float m(List list, boolean z3) {
        o.e(list, "<this>");
        Iterator it = list.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            f4 = Math.max(f4, l((JsonConfig.Keyboard.Layout.Column) it.next(), z3));
        }
        return f4;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        float measuredWidth = (float) getMeasuredWidth();
        float f4 = measuredWidth / 10.0f;
        this.f10181A = f4;
        this.f10236z = measuredWidth - f4;
        this.f10208c = C0930a.b(measuredWidth * 0.022f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        if (!A()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                return D(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
            case 1:
                return G(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
            case 2:
                if (!this.f10229s) {
                    return E(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
                return false;
            case 3:
                return G(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
            case 4:
                if (!this.f10229s) {
                    return E(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
                return false;
            case 5:
                if (this.f10229s) {
                    return false;
                }
                this.f10229s = true;
                return D(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
            case 6:
                return G(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
            default:
                return false;
        }
    }

    public void setBackspaceButtonVisible(boolean z3) {
        this.f10196P = z3;
        R();
    }

    public void setCursorEnabled(boolean z3) {
        this.f10215f0 = z3;
    }

    public void setCustomCharactersProvider(u uVar) {
        o.e(uVar, "customCharactersProvider");
        this.f10188H = uVar;
    }

    /* access modifiers changed from: protected */
    public final void setCustomCharactersProviderInternal(u uVar) {
        this.f10188H = uVar;
    }

    public void setDiacriticsProvider(v vVar) {
        this.f10186F = vVar;
    }

    /* access modifiers changed from: protected */
    public final void setDiacriticsProviderInternal(v vVar) {
        this.f10186F = vVar;
    }

    public void setDynamicOffsetEnabled(boolean z3) {
        for (b h4 : this.f10189I) {
            h4.h(z3);
        }
    }

    public void setDynamicOffsets(List<t> list) {
        o.e(list, "dynamicOffsets");
        this.f10194N = list;
        if (!this.f10189I.isEmpty()) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void setInHexagon(boolean z3) {
        this.f10200T = z3;
    }

    /* access modifiers changed from: protected */
    public final void setInHexagonLandscape(boolean z3) {
        this.f10199S = z3;
    }

    public void setKeyCase(KeyCase keyCase) {
        o.e(keyCase, "value");
        this.f10217g0 = keyCase;
        for (b g4 : this.f10189I) {
            g4.g().setCase(keyCase);
        }
    }

    public void setKeyClickDetectionEnabled(boolean z3) {
        this.f10213e0 = z3;
    }

    /* access modifiers changed from: protected */
    public final void setKeyPadding(int i4) {
        this.f10191K = i4;
    }

    /* access modifiers changed from: protected */
    public final void setKeyboardPadding(int i4) {
        this.f10198R = i4;
    }

    /* access modifiers changed from: protected */
    public final void setKeyboardTheme(ThemeModel themeModel) {
        o.e(themeModel, "<set-?>");
        this.f10182B = themeModel;
    }

    public final void setLongClickDuration(long j4) {
        this.f10235y = j4;
    }

    public void setMarginBottomFactor(double d4) {
        if (this.f10202V != d4) {
            this.f10202V = d4;
            I();
        }
    }

    public void setOnKeyEventListener(x xVar) {
        this.f10192L = xVar;
    }

    public void setOnLongTouchListener(y yVar) {
        this.f10193M = yVar;
    }

    public void setShiftButtonVisible(boolean z3) {
        this.f10197Q = z3;
        S();
    }

    /* access modifiers changed from: protected */
    public final void setShowNumbersOnMainLayout(boolean z3) {
        this.f10205a0 = z3;
    }

    /* access modifiers changed from: protected */
    public final void setShowTinyCharacters(boolean z3) {
        this.f10207b0 = z3;
    }

    public void setSpaceKeySize(float f4) {
        this.f10195O = f4;
    }

    /* access modifiers changed from: protected */
    public final void setStandardKeyWidth(int i4) {
        this.f10190J = i4;
    }

    public void setSwipeMetrics(J j4) {
        o.e(j4, "swipeMetrics");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        o.d(displayMetrics, "getDisplayMetrics(...)");
        int[] b4 = j4.b(displayMetrics);
        int i4 = b4[0];
        int i5 = b4[1];
        this.f10204a = i4;
        this.f10206b = i5;
        this.f10210d = j4;
    }

    public void y(JsonConfig.Keyboard keyboard, ThemeModel themeModel, int i4, int i5, boolean z3, int i6) {
        o.e(keyboard, "keyboardConfiguration");
        o.e(themeModel, "theme");
        this.f10189I.clear();
        removeAllViews();
        setKeyboardTheme(themeModel);
        this.f10185E = i6;
        this.f10209c0.d(new M0.c(0.0f, C0718m.j()));
    }

    public boolean z() {
        return this.f10215f0;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final PointF f10240a;

        /* renamed from: b  reason: collision with root package name */
        private final C0531f f10241b;

        /* renamed from: c  reason: collision with root package name */
        private final PointF f10242c;

        /* renamed from: d  reason: collision with root package name */
        private PointF f10243d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10244e;

        public b(PointF pointF, C0531f fVar, PointF pointF2) {
            o.e(pointF, "locationInKeyboardLayout");
            o.e(fVar, "view");
            this.f10240a = pointF;
            this.f10241b = fVar;
            this.f10242c = pointF2;
            this.f10244e = true;
        }

        public static /* synthetic */ float b(b bVar, PointF pointF, boolean z3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z3 = true;
            }
            return bVar.a(pointF, z3);
        }

        public static /* synthetic */ PointF d(b bVar, boolean z3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = true;
            }
            return bVar.e(z3);
        }

        public final float a(PointF pointF, boolean z3) {
            o.e(pointF, "point");
            M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = this.f10241b.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease == null) {
                return Float.MAX_VALUE;
            }
            if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.e() < 2.0f) {
                return C0559x.a(pointF, e(z3));
            }
            PointF e4 = e(z3);
            float g4 = (((float) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.g()) / model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.e()) * 0.5f;
            PointF pointF2 = new PointF(this.f10240a.x + g4, e4.y);
            PointF pointF3 = new PointF((this.f10240a.x + ((float) this.f10241b.getWidth())) - g4, e4.y);
            float f4 = pointF.x;
            if (f4 <= pointF2.x) {
                return C0559x.a(pointF, pointF2);
            }
            if (f4 >= pointF3.x) {
                return C0559x.a(pointF, pointF3);
            }
            return C0559x.b(pointF, pointF2, pointF3);
        }

        public final PointF c() {
            return this.f10240a;
        }

        public final PointF e(boolean z3) {
            float f4;
            float f5;
            d.b bVar;
            float f6;
            PointF pointF;
            PointF pointF2 = this.f10242c;
            float f7 = 0.0f;
            if (pointF2 != null) {
                f4 = pointF2.x;
            } else {
                f4 = 0.0f;
            }
            if (pointF2 != null) {
                f5 = pointF2.y;
            } else {
                f5 = 0.0f;
            }
            M0.d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = this.f10241b.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
                bVar = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
            } else {
                bVar = null;
            }
            if (o.a(bVar, d.b.a.INSTANCE) || o.a(bVar, d.b.m.INSTANCE) || o.a(bVar, d.b.e.INSTANCE) || o.a(bVar, d.b.h.INSTANCE)) {
                return new PointF(this.f10240a.x + (((float) this.f10241b.getWidth()) / 2.0f) + f4, this.f10240a.y + (((float) this.f10241b.getHeight()) / 2.0f) + f5);
            }
            if (!z3 || !this.f10244e || (pointF = this.f10243d) == null) {
                f6 = 0.0f;
            } else {
                f7 = pointF.x;
                f6 = pointF.y;
            }
            return new PointF(this.f10240a.x + (((float) this.f10241b.getWidth()) / 2.0f) + f4 + f7, this.f10240a.y + (((float) this.f10241b.getHeight()) / 2.0f) + f5 + f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return o.a(this.f10240a, bVar.f10240a) && o.a(this.f10241b, bVar.f10241b) && o.a(this.f10242c, bVar.f10242c);
        }

        public final void f(PointF pointF) {
            this.f10243d = pointF;
        }

        public final C0531f g() {
            return this.f10241b;
        }

        public final void h(boolean z3) {
            this.f10244e = z3;
        }

        public int hashCode() {
            int hashCode = ((this.f10240a.hashCode() * 31) + this.f10241b.hashCode()) * 31;
            PointF pointF = this.f10242c;
            return hashCode + (pointF == null ? 0 : pointF.hashCode());
        }

        public String toString() {
            return "PositionedKeyModel(locationInKeyboardLayout=" + this.f10240a + ", view=" + this.f10241b + ", defaultKeyCenterOffset=" + this.f10242c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(PointF pointF, C0531f fVar, PointF pointF2, int i4, kotlin.jvm.internal.i iVar) {
            this(pointF, fVar, (i4 & 4) != 0 ? null : pointF2);
        }
    }
}
