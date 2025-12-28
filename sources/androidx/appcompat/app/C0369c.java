package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import n.C0822a;

/* renamed from: androidx.appcompat.app.c  reason: case insensitive filesystem */
public class C0369c extends x implements DialogInterface {

    /* renamed from: f  reason: collision with root package name */
    final AlertController f2604f = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.b f2605a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2606b;

        public a(Context context) {
            this(context, C0369c.i(context, 0));
        }

        public C0369c a() {
            C0369c cVar = new C0369c(this.f2605a.f2487a, this.f2606b);
            this.f2605a.a(cVar.f2604f);
            cVar.setCancelable(this.f2605a.f2504r);
            if (this.f2605a.f2504r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f2605a.f2505s);
            cVar.setOnDismissListener(this.f2605a.f2506t);
            DialogInterface.OnKeyListener onKeyListener = this.f2605a.f2507u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f2605a.f2487a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2605a;
            bVar.f2509w = listAdapter;
            bVar.f2510x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f2605a.f2493g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f2605a.f2490d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f2605a.f2507u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f2605a;
            bVar.f2509w = listAdapter;
            bVar.f2510x = onClickListener;
            bVar.f2480I = i4;
            bVar.f2479H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f2605a.f2492f = charSequence;
            return this;
        }

        public a(Context context, int i4) {
            this.f2605a = new AlertController.b(new ContextThemeWrapper(context, C0369c.i(context, i4)));
            this.f2606b = i4;
        }
    }

    protected C0369c(Context context, int i4) {
        super(context, i(context, i4));
    }

    static int i(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0822a.f14679l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f2604f.d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2604f.e();
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f2604f.f(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f2604f.g(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2604f.p(charSequence);
    }
}
