package ch.icoaching.wrio.util;

import android.view.inputmethod.EditorInfo;
import ch.icoaching.typewise.text.TypewiseInputType;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final EditorInfo f10692a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f10693b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f10694c = new HashMap();

    public d(EditorInfo editorInfo) {
        o.e(editorInfo, "editorInfo");
        this.f10692a = editorInfo;
        HashMap hashMap = new HashMap();
        this.f10693b = hashMap;
        TypewiseInputType typewiseInputType = TypewiseInputType.EMAIL;
        hashMap.put(32, typewiseInputType);
        hashMap.put(208, typewiseInputType);
        hashMap.put(96, TypewiseInputType.NAME);
        hashMap.put(112, TypewiseInputType.ADDRESS);
    }

    private final boolean b(int i4) {
        return (i4 & 15) == 1;
    }

    public final TypewiseInputType a() {
        if (b(this.f10692a.inputType)) {
            return (TypewiseInputType) this.f10693b.get(Integer.valueOf(this.f10692a.inputType & 4080));
        }
        return (TypewiseInputType) this.f10694c.get(Integer.valueOf(this.f10692a.inputType & 15));
    }

    public final boolean c() {
        if (b(this.f10692a.inputType)) {
            if (((TypewiseInputType) this.f10693b.get(Integer.valueOf(this.f10692a.inputType & 4080))) != null) {
                return true;
            }
            return false;
        } else if (this.f10694c.get(Integer.valueOf(this.f10692a.inputType & 15)) != null) {
            return true;
        } else {
            return false;
        }
    }
}
