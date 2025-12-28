package androidx.core.view;

import B2.e;
import B2.h;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.c;
import v2.C0925a;

public abstract class ViewGroupKt {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f5202a;

        a(ViewGroup viewGroup) {
            this.f5202a = viewGroup;
        }

        public Iterator iterator() {
            return ViewGroupKt.c(this.f5202a);
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f5203a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f5204b;

        b(ViewGroup viewGroup) {
            this.f5204b = viewGroup;
        }

        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f5204b;
            int i4 = this.f5203a;
            this.f5203a = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            if (this.f5203a < this.f5204b.getChildCount()) {
                return true;
            }
            return false;
        }

        public void remove() {
            ViewGroup viewGroup = this.f5204b;
            int i4 = this.f5203a - 1;
            this.f5203a = i4;
            viewGroup.removeViewAt(i4);
        }
    }

    public static final e a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final e b(ViewGroup viewGroup) {
        return h.b(new ViewGroupKt$descendants$1(viewGroup, (c<? super ViewGroupKt$descendants$1>) null));
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
