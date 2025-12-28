package androidx.fragment.app;

import Y.e;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.m;
import androidx.lifecycle.s;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public class C0450e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private Handler f5794a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f5795b = new a();

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnCancelListener f5796c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public DialogInterface.OnDismissListener f5797d = new c();

    /* renamed from: e  reason: collision with root package name */
    private int f5798e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f5799f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5800g = true;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f5801h = true;

    /* renamed from: i  reason: collision with root package name */
    private int f5802i = -1;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5803j;

    /* renamed from: k  reason: collision with root package name */
    private s f5804k = new d();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Dialog f5805l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5806m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5807n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5808o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5809p = false;

    /* renamed from: androidx.fragment.app.e$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0450e.this.f5797d.onDismiss(C0450e.this.f5805l);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (C0450e.this.f5805l != null) {
                C0450e eVar = C0450e.this;
                eVar.onCancel(eVar.f5805l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (C0450e.this.f5805l != null) {
                C0450e eVar = C0450e.this;
                eVar.onDismiss(eVar.f5805l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    class d implements s {
        d() {
        }

        /* renamed from: b */
        public void a(m mVar) {
            if (mVar != null && C0450e.this.f5801h) {
                View requireView = C0450e.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (C0450e.this.f5805l != null) {
                    if (q.D0(3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(C0450e.this.f5805l);
                    }
                    C0450e.this.f5805l.setContentView(requireView);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e  reason: collision with other inner class name */
    class C0095e extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f5814a;

        C0095e(j jVar) {
            this.f5814a = jVar;
        }

        public View c(int i4) {
            if (this.f5814a.d()) {
                return this.f5814a.c(i4);
            }
            return C0450e.this.o(i4);
        }

        public boolean d() {
            if (this.f5814a.d() || C0450e.this.p()) {
                return true;
            }
            return false;
        }
    }

    private void k(boolean z3, boolean z4) {
        if (!this.f5807n) {
            this.f5807n = true;
            this.f5808o = false;
            Dialog dialog = this.f5805l;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f5805l.dismiss();
                if (!z4) {
                    if (Looper.myLooper() == this.f5794a.getLooper()) {
                        onDismiss(this.f5805l);
                    } else {
                        this.f5794a.post(this.f5795b);
                    }
                }
            }
            this.f5806m = true;
            if (this.f5802i >= 0) {
                getParentFragmentManager().S0(this.f5802i, 1, z3);
                this.f5802i = -1;
                return;
            }
            y l4 = getParentFragmentManager().l();
            l4.o(true);
            l4.l(this);
            if (z3) {
                l4.g();
            } else {
                l4.f();
            }
        }
    }

    private void q(Bundle bundle) {
        if (this.f5801h && !this.f5809p) {
            try {
                this.f5803j = true;
                Dialog n4 = n(bundle);
                this.f5805l = n4;
                if (this.f5801h) {
                    s(n4, this.f5798e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f5805l.setOwnerActivity((Activity) context);
                    }
                    this.f5805l.setCancelable(this.f5800g);
                    this.f5805l.setOnCancelListener(this.f5796c);
                    this.f5805l.setOnDismissListener(this.f5797d);
                    this.f5809p = true;
                } else {
                    this.f5805l = null;
                }
            } finally {
                this.f5803j = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public j createFragmentContainer() {
        return new C0095e(super.createFragmentContainer());
    }

    public Dialog l() {
        return this.f5805l;
    }

    public int m() {
        return this.f5799f;
    }

    public Dialog n(Bundle bundle) {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(requireContext(), m());
    }

    /* access modifiers changed from: package-private */
    public View o(int i4) {
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().e(this.f5804k);
        if (!this.f5808o) {
            this.f5807n = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        boolean z3;
        super.onCreate(bundle);
        this.f5794a = new Handler();
        if (this.mContainerId == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5801h = z3;
        if (bundle != null) {
            this.f5798e = bundle.getInt("android:style", 0);
            this.f5799f = bundle.getInt("android:theme", 0);
            this.f5800g = bundle.getBoolean("android:cancelable", true);
            this.f5801h = bundle.getBoolean("android:showsDialog", this.f5801h);
            this.f5802i = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            this.f5806m = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f5805l.dismiss();
            if (!this.f5807n) {
                onDismiss(this.f5805l);
            }
            this.f5805l = null;
            this.f5809p = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f5808o && !this.f5807n) {
            this.f5807n = true;
        }
        getViewLifecycleOwnerLiveData().i(this.f5804k);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f5806m) {
            if (q.D0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
            }
            k(true, true);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (!this.f5801h || this.f5803j) {
            if (q.D0(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.f5801h) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mShowsDialog = false: ");
                    sb.append(str);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("mCreatingDialog = true: ");
                    sb2.append(str);
                }
            }
            return onGetLayoutInflater;
        }
        q(bundle);
        if (q.D0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get layout inflater for DialogFragment ");
            sb3.append(this);
            sb3.append(" from dialog context");
        }
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            return onGetLayoutInflater.cloneInContext(dialog.getContext());
        }
        return onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i4 = this.f5798e;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i5 = this.f5799f;
        if (i5 != 0) {
            bundle.putInt("android:theme", i5);
        }
        boolean z3 = this.f5800g;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f5801h;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i6 = this.f5802i;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            this.f5806m = false;
            dialog.show();
            View decorView = this.f5805l.getWindow().getDecorView();
            K.a(decorView, this);
            L.a(decorView, this);
            e.a(decorView, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f5805l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f5805l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5805l.onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f5809p;
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f5805l != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f5805l.onRestoreInstanceState(bundle2);
        }
    }

    public final Dialog r() {
        Dialog l4 = l();
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void s(Dialog dialog, int i4) {
        if (!(i4 == 1 || i4 == 2)) {
            if (i4 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }
}
