package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.W;

public interface J {
    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(m.a aVar, g.a aVar2);

    void j(int i4);

    void k(W w3);

    ViewGroup l();

    void m(boolean z3);

    boolean n();

    void o(int i4);

    int p();

    Menu q();

    void r(int i4);

    int s();

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    W t(int i4, long j4);

    void u();

    void v();

    void w(boolean z3);
}
