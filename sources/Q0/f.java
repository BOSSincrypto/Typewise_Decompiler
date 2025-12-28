package Q0;

import android.widget.inline.InlineContentView;
import androidx.work.c;
import kotlin.jvm.internal.o;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final InlineContentView f1214a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1215b;

    public f(InlineContentView inlineContentView, boolean z3) {
        o.e(inlineContentView, "view");
        this.f1214a = inlineContentView;
        this.f1215b = z3;
    }

    public final InlineContentView a() {
        return this.f1214a;
    }

    public final boolean b() {
        return this.f1215b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (o.a(this.f1214a, fVar.f1214a) && this.f1215b == fVar.f1215b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1214a.hashCode() * 31) + c.a(this.f1215b);
    }

    public String toString() {
        return "InlineSuggestionItem(view=" + this.f1214a + ", isPinned=" + this.f1215b + ')';
    }
}
