package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class o extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final Class f5533a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5534b = new ArrayList();

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        final Object f5535a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f5536b = new AtomicInteger(0);

        a(Object obj) {
            this.f5535a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof j;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f5536b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f5535a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f5535a).beforeTextChanged(charSequence, i4, i5, i6);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f5536b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f5536b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f5535a).onSpanAdded(spannable, obj, i4, i5);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
            int i8;
            int i9;
            if (this.f5536b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i4 > i5) {
                        i4 = 0;
                    }
                    if (i6 > i7) {
                        i9 = i4;
                        i8 = 0;
                        ((SpanWatcher) this.f5535a).onSpanChanged(spannable, obj, i9, i5, i8, i7);
                    }
                }
                i9 = i4;
                i8 = i6;
                ((SpanWatcher) this.f5535a).onSpanChanged(spannable, obj, i9, i5, i8, i7);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f5536b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f5535a).onSpanRemoved(spannable, obj, i4, i5);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f5535a).onTextChanged(charSequence, i4, i5, i6);
        }
    }

    o(Class cls, CharSequence charSequence) {
        super(charSequence);
        g.h(cls, "watcherClass cannot be null");
        this.f5533a = cls;
    }

    private void b() {
        for (int i4 = 0; i4 < this.f5534b.size(); i4++) {
            ((a) this.f5534b.get(i4)).a();
        }
    }

    public static o c(Class cls, CharSequence charSequence) {
        return new o(cls, charSequence);
    }

    private void e() {
        for (int i4 = 0; i4 < this.f5534b.size(); i4++) {
            ((a) this.f5534b.get(i4)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i4 = 0; i4 < this.f5534b.size(); i4++) {
            a aVar = (a) this.f5534b.get(i4);
            if (aVar.f5535a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        if (this.f5533a == cls) {
            return true;
        }
        return false;
    }

    private boolean h(Object obj) {
        if (obj == null || !g(obj.getClass())) {
            return false;
        }
        return true;
    }

    private void i() {
        for (int i4 = 0; i4 < this.f5534b.size(); i4++) {
            ((a) this.f5534b.get(i4)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    public int getSpanEnd(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanStart(obj);
    }

    public Object[] getSpans(int i4, int i5, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i4, i5, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i4, i5, a.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            objArr[i6] = aVarArr[i6].f5535a;
        }
        return objArr;
    }

    public int nextSpanTransition(int i4, int i5, Class<a> cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f5534b.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f5534b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i4, i5, i6);
    }

    public CharSequence subSequence(int i4, int i5) {
        return new o(this.f5533a, this, i4, i5);
    }

    public SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    public SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        b();
        super.replace(i4, i5, charSequence);
        i();
        return this;
    }

    public SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    o(Class cls, CharSequence charSequence, int i4, int i5) {
        super(charSequence, i4, i5);
        g.h(cls, "watcherClass cannot be null");
        this.f5533a = cls;
    }

    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        b();
        super.replace(i4, i5, charSequence, i6, i7);
        i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
