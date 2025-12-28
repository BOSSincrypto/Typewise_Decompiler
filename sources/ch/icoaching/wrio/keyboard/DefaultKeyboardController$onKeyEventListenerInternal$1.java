package ch.icoaching.wrio.keyboard;

import android.graphics.PointF;
import android.os.SystemClock;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.DefaultKeyboardController;
import ch.icoaching.wrio.keyboard.layout.Layer;
import ch.icoaching.wrio.logging.Log;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g0;

public final class DefaultKeyboardController$onKeyEventListenerInternal$1 implements x {

    /* renamed from: a  reason: collision with root package name */
    private KeyCase f9932a = KeyCase.LOWERCASE;

    /* renamed from: b  reason: collision with root package name */
    private long f9933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DefaultKeyboardController f9934c;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9935a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.keyboard.KeyCase[] r0 = ch.icoaching.wrio.keyboard.KeyCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.LOWERCASE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.UPPERCASE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.CAPS_LOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f9935a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.DefaultKeyboardController$onKeyEventListenerInternal$1.a.<clinit>():void");
        }
    }

    DefaultKeyboardController$onKeyEventListenerInternal$1(DefaultKeyboardController defaultKeyboardController) {
        this.f9934c = defaultKeyboardController;
    }

    public void a() {
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.a();
        }
    }

    public void b() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "IOnKeyEventListener.onUpAfterDeleteAndRestore()", (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.b();
        }
    }

    public void d() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onUpAfterCharacterClickAndCharacterReplace()", (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.c();
        }
    }

    public void e(char c4, PointF pointF, boolean z3) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onCharacterSwipedUp() :: " + c4 + " | " + pointF + " | " + z3, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.e(c4, pointF, z3);
        }
    }

    public void f(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onMoveCursor() :: " + i4, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.f(i4);
        }
    }

    public void g(Character ch2, PointF pointF, boolean z3) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onCharacterSwipedDown() :: " + ch2 + " | " + pointF + " | " + z3, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.g(ch2, pointF, z3);
        }
    }

    public void h(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "IOnKeyEventListener.onRestoreCharacters() :: " + i4, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.h(i4);
        }
    }

    public void i(int i4) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "IOnKeyEventListener.onDeleteCharacters() :: " + i4, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.i(i4);
        }
    }

    public void j() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onEmojisClick()", (Throwable) null, 4, (Object) null);
        if (this.f9934c.f() != Layer.EMOJI) {
            this.f9934c.H();
        }
    }

    public void k(PointF pointF) {
        o.e(pointF, "touchPoint");
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onReturnSwipedUp() :: " + pointF, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.k(pointF);
        }
    }

    public void l() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onShowEmojisKeyboard()", (Throwable) null, 4, (Object) null);
        if (this.f9934c.f9906w.p()) {
            this.f9934c.f9906w.o(true, true);
        } else if (this.f9934c.f() != Layer.EMOJI) {
            this.f9934c.H();
        }
    }

    public void m() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onNumbersKeypadClick()", (Throwable) null, 4, (Object) null);
        if (this.f9934c.A1()) {
            if (this.f9934c.f() == Layer.SYMBOLS || this.f9934c.f() == Layer.LETTERS) {
                this.f9934c.H();
            } else {
                DefaultKeyboardController.SymbolsLayoutFacade.k(this.f9934c.f9906w, true, false, 2, (Object) null);
            }
        } else if (this.f9934c.f9906w.v()) {
            this.f9934c.f9906w.n(true);
        } else {
            DefaultKeyboardController.SymbolsLayoutFacade.k(this.f9934c.f9906w, true, false, 2, (Object) null);
        }
    }

    public void n(char c4, PointF pointF) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onReplaceCharacter() :: " + c4 + " | " + pointF, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.n(c4, pointF);
        }
    }

    public void o(char c4, PointF pointF) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardController", "onCharacterClick() :: " + c4 + " | " + pointF, (Throwable) null, 4, (Object) null);
        B.a q12 = this.f9934c.q1();
        if (q12 != null) {
            q12.o(c4, pointF);
        }
    }

    public void p() {
        g0 unused = C0739h.d(this.f9934c.f9869d, (CoroutineContext) null, (CoroutineStart) null, new DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1(this.f9934c, (c<? super DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1>) null), 3, (Object) null);
    }

    public void q() {
        KeyCase keyCase;
        KeyCase keyCase2;
        Log.d(Log.f10572a, "DefaultKeyboardController", "onShiftClick()", (Throwable) null, 4, (Object) null);
        if (SystemClock.elapsedRealtime() - this.f9933b < 200) {
            DefaultKeyboardController defaultKeyboardController = this.f9934c;
            int i4 = a.f9935a[this.f9932a.ordinal()];
            if (i4 == 1) {
                keyCase2 = KeyCase.CAPS_LOCK;
            } else if (i4 == 2) {
                keyCase2 = KeyCase.CAPS_LOCK;
            } else if (i4 == 3) {
                keyCase2 = KeyCase.LOWERCASE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            defaultKeyboardController.y0(keyCase2);
        } else {
            this.f9932a = this.f9934c.f9890n0;
            DefaultKeyboardController defaultKeyboardController2 = this.f9934c;
            int i5 = a.f9935a[defaultKeyboardController2.f9890n0.ordinal()];
            if (i5 == 1) {
                keyCase = KeyCase.UPPERCASE;
            } else if (i5 == 2) {
                keyCase = KeyCase.LOWERCASE;
            } else if (i5 == 3) {
                keyCase = KeyCase.LOWERCASE;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            defaultKeyboardController2.y0(keyCase);
        }
        this.f9933b = SystemClock.elapsedRealtime();
    }

    public void r() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onMoreMathClicked()", (Throwable) null, 4, (Object) null);
        g0 unused = C0739h.d(this.f9934c.f9869d, (CoroutineContext) null, (CoroutineStart) null, new DefaultKeyboardController$onKeyEventListenerInternal$1$onMoreMathClicked$1(this.f9934c, (c<? super DefaultKeyboardController$onKeyEventListenerInternal$1$onMoreMathClicked$1>) null), 3, (Object) null);
    }

    public void s() {
        Log.d(Log.f10572a, "DefaultKeyboardController", "onMoreNumbersClicked", (Throwable) null, 4, (Object) null);
        g0 unused = C0739h.d(this.f9934c.f9869d, (CoroutineContext) null, (CoroutineStart) null, new DefaultKeyboardController$onKeyEventListenerInternal$1$onMoreNumbersClicked$1(this.f9934c, (c<? super DefaultKeyboardController$onKeyEventListenerInternal$1$onMoreNumbersClicked$1>) null), 3, (Object) null);
    }

    public void t() {
        KeyCase keyCase;
        Log.d(Log.f10572a, "DefaultKeyboardController", "onShiftLongClick()", (Throwable) null, 4, (Object) null);
        DefaultKeyboardController defaultKeyboardController = this.f9934c;
        int i4 = a.f9935a[defaultKeyboardController.f9890n0.ordinal()];
        if (i4 == 1) {
            keyCase = KeyCase.CAPS_LOCK;
        } else if (i4 == 2) {
            keyCase = KeyCase.CAPS_LOCK;
        } else if (i4 == 3) {
            keyCase = KeyCase.LOWERCASE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        defaultKeyboardController.y0(keyCase);
    }
}
