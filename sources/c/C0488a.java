package c;

import android.view.inputmethod.CorrectionInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.a  reason: case insensitive filesystem */
public class C0488a {

    /* renamed from: b  reason: collision with root package name */
    private static C0488a f7488b;

    /* renamed from: a  reason: collision with root package name */
    private final List f7489a = new ArrayList();

    public static C0488a c() {
        if (f7488b == null) {
            f7488b = new C0488a();
        }
        return f7488b;
    }

    public synchronized void a() {
        this.f7489a.clear();
    }

    public synchronized void b(CorrectionInfo correctionInfo) {
        this.f7489a.add(correctionInfo);
    }
}
