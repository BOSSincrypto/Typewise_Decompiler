package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
import y.g;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f2752a;

    /* renamed from: b  reason: collision with root package name */
    final b f2753b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f2754a;

        /* renamed from: b  reason: collision with root package name */
        final Context f2755b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f2756c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        final g f2757d = new g();

        public a(Context context, ActionMode.Callback callback) {
            this.f2755b = context;
            this.f2754a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f2757d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f2755b, (H.a) menu);
            this.f2757d.put(menu, oVar);
            return oVar;
        }

        public boolean a(b bVar, Menu menu) {
            return this.f2754a.onPrepareActionMode(e(bVar), f(menu));
        }

        public void b(b bVar) {
            this.f2754a.onDestroyActionMode(e(bVar));
        }

        public boolean c(b bVar, MenuItem menuItem) {
            return this.f2754a.onActionItemClicked(e(bVar), new j(this.f2755b, (H.b) menuItem));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f2754a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f2756c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = (f) this.f2756c.get(i4);
                if (fVar != null && fVar.f2753b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2755b, bVar);
            this.f2756c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f2752a = context;
        this.f2753b = bVar;
    }

    public void finish() {
        this.f2753b.c();
    }

    public View getCustomView() {
        return this.f2753b.d();
    }

    public Menu getMenu() {
        return new o(this.f2752a, (H.a) this.f2753b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f2753b.f();
    }

    public CharSequence getSubtitle() {
        return this.f2753b.g();
    }

    public Object getTag() {
        return this.f2753b.h();
    }

    public CharSequence getTitle() {
        return this.f2753b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f2753b.j();
    }

    public void invalidate() {
        this.f2753b.k();
    }

    public boolean isTitleOptional() {
        return this.f2753b.l();
    }

    public void setCustomView(View view) {
        this.f2753b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2753b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f2753b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2753b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z3) {
        this.f2753b.s(z3);
    }

    public void setSubtitle(int i4) {
        this.f2753b.n(i4);
    }

    public void setTitle(int i4) {
        this.f2753b.q(i4);
    }
}
