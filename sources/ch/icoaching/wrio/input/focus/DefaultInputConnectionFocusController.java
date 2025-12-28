package ch.icoaching.wrio.input.focus;

import android.inputmethodservice.AbstractInputMethodService;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputBinding;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;
import u2.C0906a;
import u2.p;

public final class DefaultInputConnectionFocusController implements d {

    /* renamed from: a  reason: collision with root package name */
    private final D f9766a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List f9767b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private AbstractInputMethodService.AbstractInputMethodImpl f9768c;

    /* renamed from: d  reason: collision with root package name */
    private InputConnection f9769d;

    /* renamed from: e  reason: collision with root package name */
    private EditorInfo f9770e;

    /* renamed from: f  reason: collision with root package name */
    private InputConnection f9771f;

    /* renamed from: g  reason: collision with root package name */
    private p f9772g = new b();

    /* renamed from: h  reason: collision with root package name */
    private C0906a f9773h = a.f9777a;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9774i = true;

    /* renamed from: j  reason: collision with root package name */
    private Window f9775j;

    /* renamed from: k  reason: collision with root package name */
    private g0 f9776k;

    static final class a implements C0906a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9777a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public DefaultInputConnectionFocusController(D d4) {
        o.e(d4, "serviceScope");
        this.f9766a = d4;
    }

    /* access modifiers changed from: private */
    public static final q l(EditorInfo editorInfo, InputConnection inputConnection) {
        o.e(editorInfo, "<unused var>");
        return q.f14567a;
    }

    private final void m() {
        for (View view : this.f9767b) {
            ViewParent parent = view.getParent();
            o.c(parent, "null cannot be cast to non-null type android.view.View");
            ViewParent parent2 = ((View) parent).getParent();
            o.c(parent2, "null cannot be cast to non-null type android.view.View");
            ((View) parent2).requestFocus();
            view.clearFocus();
        }
        this.f9767b.clear();
        this.f9776k = null;
        w();
    }

    private final void n(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount >= 0) {
                int i4 = 0;
                while (true) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (childAt != null) {
                        n(childAt);
                    }
                    if (i4 != childCount) {
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        } else if (view.onCheckIsTextEditor()) {
            view.setOnFocusChangeListener(new a(this));
        }
    }

    private final void o(View view, boolean z3) {
        if (z3) {
            this.f9767b.add(view);
            view.setOnTouchListener(new c(this, view));
        } else {
            this.f9767b.remove(view);
        }
        t();
    }

    /* access modifiers changed from: private */
    public static final void r(DefaultInputConnectionFocusController defaultInputConnectionFocusController, View view, boolean z3) {
        o.b(view);
        defaultInputConnectionFocusController.o(view, z3);
    }

    /* access modifiers changed from: private */
    public static final boolean s(DefaultInputConnectionFocusController defaultInputConnectionFocusController, View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        defaultInputConnectionFocusController.o(view, true);
        return false;
    }

    private final void t() {
        g0 g0Var = this.f9776k;
        if (g0Var != null && !g0Var.a()) {
            this.f9776k = null;
        }
        if (this.f9776k == null) {
            this.f9776k = C0739h.d(this.f9766a, (CoroutineContext) null, (CoroutineStart) null, new DefaultInputConnectionFocusController$startJobIfNotRunning$1(this, (c<? super DefaultInputConnectionFocusController$startJobIfNotRunning$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void u(View view) {
        Log log = Log.f10572a;
        Log.d(log, "DefaultInputConnectionFocusController", "switchInputConnectionTo()", (Throwable) null, 4, (Object) null);
        if (!view.onCheckIsTextEditor()) {
            Log.d(log, "DefaultInputConnectionFocusController", "Cannot create an input connection to a view that's not a text editor.", (Throwable) null, 4, (Object) null);
            return;
        }
        Window window = this.f9775j;
        if (window != null) {
            window.setLocalFocus(true, true);
        }
        EditorInfo editorInfo = new EditorInfo();
        InputConnection onCreateInputConnection = view.onCreateInputConnection(editorInfo);
        onCreateInputConnection.requestCursorUpdates(2);
        this.f9771f = onCreateInputConnection;
        InputBinding inputBinding = (InputBinding) this.f9773h.invoke();
        if (inputBinding != null) {
            IBinder connectionToken = inputBinding.getConnectionToken();
            int uid = inputBinding.getUid();
            int pid = inputBinding.getPid();
            AbstractInputMethodService.AbstractInputMethodImpl abstractInputMethodImpl = this.f9768c;
            if (abstractInputMethodImpl != null) {
                abstractInputMethodImpl.unbindInput();
            }
            AbstractInputMethodService.AbstractInputMethodImpl abstractInputMethodImpl2 = this.f9768c;
            if (abstractInputMethodImpl2 != null) {
                abstractInputMethodImpl2.bindInput(new InputBinding(onCreateInputConnection, connectionToken, uid, pid));
            }
            this.f9774i = false;
            this.f9772g.invoke(editorInfo, this.f9771f);
        }
    }

    /* access modifiers changed from: private */
    public final void w() {
        InputConnection inputConnection;
        if (!this.f9774i) {
            Log.d(Log.f10572a, "DefaultInputConnectionFocusController", "switchToDefaultInputConnection()", (Throwable) null, 4, (Object) null);
            Window window = this.f9775j;
            if (window != null) {
                window.setLocalFocus(false, true);
            }
            EditorInfo editorInfo = this.f9770e;
            if (editorInfo != null && (inputConnection = this.f9769d) != null) {
                this.f9771f = inputConnection;
                InputBinding inputBinding = (InputBinding) this.f9773h.invoke();
                if (inputBinding != null) {
                    IBinder connectionToken = inputBinding.getConnectionToken();
                    int uid = inputBinding.getUid();
                    int pid = inputBinding.getPid();
                    AbstractInputMethodService.AbstractInputMethodImpl abstractInputMethodImpl = this.f9768c;
                    if (abstractInputMethodImpl != null) {
                        abstractInputMethodImpl.unbindInput();
                    }
                    AbstractInputMethodService.AbstractInputMethodImpl abstractInputMethodImpl2 = this.f9768c;
                    if (abstractInputMethodImpl2 != null) {
                        abstractInputMethodImpl2.bindInput(new InputBinding(this.f9771f, connectionToken, uid, pid));
                    }
                    this.f9774i = true;
                    this.f9772g.invoke(editorInfo, inputConnection);
                }
            }
        }
    }

    public void a(AbstractInputMethodService.AbstractInputMethodImpl abstractInputMethodImpl) {
        o.e(abstractInputMethodImpl, "inputMethodImpl");
        this.f9768c = abstractInputMethodImpl;
    }

    public void b(EditorInfo editorInfo, InputConnection inputConnection) {
        o.e(editorInfo, "editorInfo");
        this.f9770e = editorInfo;
        this.f9769d = inputConnection;
    }

    public void c() {
        m();
    }

    public void d() {
        m();
    }

    public void e() {
    }

    public void f(Window window, C0906a aVar, p pVar) {
        o.e(aVar, "getCurrentInputBinding");
        o.e(pVar, "onChangeInputConnectionCallback");
        this.f9775j = window;
        this.f9773h = aVar;
        this.f9772g = pVar;
    }

    public void g(View view) {
        o.e(view, "view");
        n(view);
    }

    public void p() {
        m();
    }
}
