package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0374h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.core.view.P;
import java.util.ArrayList;

class G extends C0367a {

    /* renamed from: a  reason: collision with root package name */
    final J f2539a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f2540b;

    /* renamed from: c  reason: collision with root package name */
    final C0374h.g f2541c;

    /* renamed from: d  reason: collision with root package name */
    boolean f2542d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2543e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2544f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f2545g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f2546h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f2547i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            G.this.w();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return G.this.f2540b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2550a;

        c() {
        }

        public void a(g gVar, boolean z3) {
            if (!this.f2550a) {
                this.f2550a = true;
                G.this.f2539a.h();
                G.this.f2540b.onPanelClosed(108, gVar);
                this.f2550a = false;
            }
        }

        public boolean b(g gVar) {
            G.this.f2540b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            if (G.this.f2539a.b()) {
                G.this.f2540b.onPanelClosed(108, gVar);
            } else if (G.this.f2540b.onPreparePanel(0, (View) null, gVar)) {
                G.this.f2540b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements C0374h.g {
        e() {
        }

        public boolean a(int i4) {
            if (i4 != 0) {
                return false;
            }
            G g4 = G.this;
            if (g4.f2542d) {
                return false;
            }
            g4.f2539a.c();
            G.this.f2542d = true;
            return false;
        }

        public View onCreatePanelView(int i4) {
            if (i4 == 0) {
                return new View(G.this.f2539a.getContext());
            }
            return null;
        }
    }

    G(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f2547i = bVar;
        androidx.core.util.g.g(toolbar);
        g0 g0Var = new g0(toolbar, false);
        this.f2539a = g0Var;
        this.f2540b = (Window.Callback) androidx.core.util.g.g(callback);
        g0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        g0Var.setWindowTitle(charSequence);
        this.f2541c = new e();
    }

    private Menu v() {
        if (!this.f2543e) {
            this.f2539a.i(new c(), new d());
            this.f2543e = true;
        }
        return this.f2539a.q();
    }

    public boolean g() {
        return this.f2539a.e();
    }

    public boolean h() {
        if (!this.f2539a.n()) {
            return false;
        }
        this.f2539a.collapseActionView();
        return true;
    }

    public void i(boolean z3) {
        if (z3 != this.f2544f) {
            this.f2544f = z3;
            if (this.f2545g.size() > 0) {
                F.a(this.f2545g.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f2539a.p();
    }

    public Context k() {
        return this.f2539a.getContext();
    }

    public boolean l() {
        this.f2539a.l().removeCallbacks(this.f2546h);
        P.g0(this.f2539a.l(), this.f2546h);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f2539a.l().removeCallbacks(this.f2546h);
    }

    public boolean o(int i4, KeyEvent keyEvent) {
        int i5;
        Menu v3 = v();
        if (v3 == null) {
            return false;
        }
        if (keyEvent != null) {
            i5 = keyEvent.getDeviceId();
        } else {
            i5 = -1;
        }
        boolean z3 = true;
        if (KeyCharacterMap.load(i5).getKeyboardType() == 1) {
            z3 = false;
        }
        v3.setQwertyMode(z3);
        return v3.performShortcut(i4, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.f2539a.f();
    }

    public void r(boolean z3) {
    }

    public void s(boolean z3) {
    }

    public void t(CharSequence charSequence) {
        this.f2539a.setWindowTitle(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w() {
        /*
            r5 = this;
            android.view.Menu r0 = r5.v()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.g
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r0
            androidx.appcompat.view.menu.g r1 = (androidx.appcompat.view.menu.g) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            r1.d0()
        L_0x0013:
            r0.clear()     // Catch:{ all -> 0x0028 }
            android.view.Window$Callback r3 = r5.f2540b     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r3 = r3.onCreatePanelMenu(r4, r0)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            android.view.Window$Callback r3 = r5.f2540b     // Catch:{ all -> 0x0028 }
            boolean r2 = r3.onPreparePanel(r4, r2, r0)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002d
            goto L_0x002a
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0.clear()     // Catch:{ all -> 0x0028 }
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.c0()
        L_0x0032:
            return
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.c0()
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.G.w():void");
    }
}
