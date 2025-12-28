package ch.icoaching.wrio.keyboard;

import android.content.res.Configuration;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.j;
import ch.icoaching.wrio.keyboard.layout.Layer;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import java.util.List;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.n;
import u2.C0906a;

public interface B {

    public interface a {
        void a();

        void b();

        void c();

        void e(char c4, PointF pointF, boolean z3);

        void f(int i4);

        void g(Character ch2, PointF pointF, boolean z3);

        void h(int i4);

        void i(int i4);

        void k(PointF pointF);

        void l(String str);

        void m(Emoji emoji);

        void n(char c4, PointF pointF);

        void o(char c4, PointF pointF);
    }

    void A(Configuration configuration, int[] iArr);

    void B(View view);

    View C(LayoutInflater layoutInflater, int i4, int[] iArr);

    void D(v vVar);

    n E();

    int F();

    void a();

    List b();

    ViewGroup c();

    void c(boolean z3);

    int d();

    void e();

    Layer f();

    void f(boolean z3);

    void g(int i4);

    void h(C0906a aVar);

    void i(View view);

    void j();

    c n();

    void o(ThemeModel themeModel);

    void p(View view);

    void q(InputConnection inputConnection, EditorInfo editorInfo, j jVar);

    void r(int i4, int i5, int i6, int i7, int i8, int i9);

    void s(View view);

    void t(List list);

    void u(Configuration configuration);

    void v(double d4, double d5);

    void w();

    void x(a aVar);

    void y(Layer layer);

    void z(EditorInfo editorInfo, boolean z3);
}
