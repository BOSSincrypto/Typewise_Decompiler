package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class k {

    /* renamed from: a  reason: collision with root package name */
    boolean f6664a = true;

    /* renamed from: b  reason: collision with root package name */
    int f6665b;

    /* renamed from: c  reason: collision with root package name */
    int f6666c;

    /* renamed from: d  reason: collision with root package name */
    int f6667d;

    /* renamed from: e  reason: collision with root package name */
    int f6668e;

    /* renamed from: f  reason: collision with root package name */
    int f6669f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f6670g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f6671h;

    /* renamed from: i  reason: collision with root package name */
    boolean f6672i;

    k() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.z zVar) {
        int i4 = this.f6666c;
        if (i4 < 0 || i4 >= zVar.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.u uVar) {
        View o4 = uVar.o(this.f6666c);
        this.f6666c += this.f6667d;
        return o4;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f6665b + ", mCurrentPosition=" + this.f6666c + ", mItemDirection=" + this.f6667d + ", mLayoutDirection=" + this.f6668e + ", mStartLine=" + this.f6669f + ", mEndLine=" + this.f6670g + '}';
    }
}
