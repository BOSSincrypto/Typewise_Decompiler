package ch.icoaching.wrio.input;

import android.graphics.PointF;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.util.Pair;
import java.util.List;

public interface c {
    void A(m mVar);

    void a();

    void b();

    void c();

    void c(String str);

    String d();

    Pair e();

    int f();

    void f(int i4);

    void g(List list);

    void h(int i4);

    void i(int i4);

    void j();

    void k(PointF pointF);

    void l(String str);

    void m(Emoji emoji);

    void n(char c4, PointF pointF);

    void o(char c4, PointF pointF);

    void p();

    void q(InputConnection inputConnection, EditorInfo editorInfo, j jVar);

    void r(int i4, int i5, int i6, int i7, int i8, int i9);

    void s(List list);

    Object t(CorrectionInfo correctionInfo, boolean z3, boolean z4, kotlin.coroutines.c cVar);

    void u(List list);

    void v(int i4, String str, String str2, PredictionsResult.Candidate.Type type);

    void w(List list);

    Object x(String str, String str2, boolean z3, kotlin.coroutines.c cVar);

    Object y(String str, kotlin.coroutines.c cVar);

    Object z(String str, String str2, kotlin.coroutines.c cVar);
}
