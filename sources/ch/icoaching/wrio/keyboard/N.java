package ch.icoaching.wrio.keyboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InlineSuggestionsRequest;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.List;
import u2.C0906a;

public interface N {

    public static final class a {
        public static /* synthetic */ View a(N n4, LayoutInflater layoutInflater, Integer num, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    num = null;
                }
                return n4.x(layoutInflater, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSmartBarView");
        }
    }

    void a();

    void b();

    void c();

    void c(boolean z3);

    void d(C0906a aVar);

    InlineSuggestionsRequest e();

    void f();

    void f(boolean z3);

    void g(List list);

    void h(C0906a aVar);

    void i(View view);

    void j();

    void k();

    boolean l();

    void m();

    void n();

    void o();

    void p(View view);

    void q();

    void r(z zVar);

    void s(List list);

    void t(int i4, int i5);

    void u(ThemeModel.SmartBarTheme smartBarTheme);

    void v(C0906a aVar);

    void w(ch.icoaching.wrio.ai_assistant.ui.a aVar);

    View x(LayoutInflater layoutInflater, Integer num);

    void y(C0906a aVar);

    void z();
}
