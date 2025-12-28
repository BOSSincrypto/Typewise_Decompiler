package ch.icoaching.wrio.autocorrect;

import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.input.j;
import java.util.List;
import java.util.Map;

public interface c {

    public interface a {
        void a(CorrectionInfo correctionInfo, d dVar);
    }

    void a();

    String c(String str);

    void e(String str, boolean z3);

    void f(EditorInfo editorInfo, j jVar);

    void g(float f4, Map map);

    void h(a aVar);

    Object i(String str, String str2, List list, int i4, String str3, boolean z3, kotlin.coroutines.c cVar);
}
