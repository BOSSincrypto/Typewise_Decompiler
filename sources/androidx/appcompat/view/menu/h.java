package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0369c;
import androidx.appcompat.view.menu.m;
import n.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: a  reason: collision with root package name */
    private g f2955a;

    /* renamed from: b  reason: collision with root package name */
    private C0369c f2956b;

    /* renamed from: c  reason: collision with root package name */
    e f2957c;

    /* renamed from: d  reason: collision with root package name */
    private m.a f2958d;

    public h(g gVar) {
        this.f2955a = gVar;
    }

    public void a(g gVar, boolean z3) {
        if (z3 || gVar == this.f2955a) {
            c();
        }
        m.a aVar = this.f2958d;
        if (aVar != null) {
            aVar.a(gVar, z3);
        }
    }

    public boolean b(g gVar) {
        m.a aVar = this.f2958d;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        C0369c cVar = this.f2956b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f2955a;
        C0369c.a aVar = new C0369c.a(gVar.u());
        e eVar = new e(aVar.b(), g.f14812j);
        this.f2957c = eVar;
        eVar.k(this);
        this.f2955a.b(this.f2957c);
        aVar.c(this.f2957c.b(), this);
        View y3 = gVar.y();
        if (y3 != null) {
            aVar.d(y3);
        } else {
            aVar.e(gVar.w()).h(gVar.x());
        }
        aVar.f(this);
        C0369c a4 = aVar.a();
        this.f2956b = a4;
        a4.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f2956b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2956b.show();
    }

    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f2955a.L((i) this.f2957c.b().getItem(i4), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2957c.a(this.f2955a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2956b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2956b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f2955a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f2955a.performShortcut(i4, keyEvent, 0);
    }
}
