package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class B {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5270a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final B f5271a;

        a(B b4) {
            this.f5271a = b4;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
            A b4 = this.f5271a.b(i4);
            if (b4 == null) {
                return null;
            }
            return b4.I0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i4) {
            List c4 = this.f5271a.c(str, i4);
            if (c4 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c4.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(((A) c4.get(i5)).I0());
            }
            return arrayList;
        }

        public boolean performAction(int i4, int i5, Bundle bundle) {
            return this.f5271a.f(i4, i5, bundle);
        }
    }

    static class b extends a {
        b(B b4) {
            super(b4);
        }

        public AccessibilityNodeInfo findFocus(int i4) {
            A d4 = this.f5271a.d(i4);
            if (d4 == null) {
                return null;
            }
            return d4.I0();
        }
    }

    static class c extends b {
        c(B b4) {
            super(b4);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f5271a.a(i4, A.J0(accessibilityNodeInfo), str, bundle);
        }
    }

    public B() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5270a = new c(this);
        } else {
            this.f5270a = new b(this);
        }
    }

    public void a(int i4, A a4, String str, Bundle bundle) {
    }

    public A b(int i4) {
        return null;
    }

    public List c(String str, int i4) {
        return null;
    }

    public A d(int i4) {
        return null;
    }

    public Object e() {
        return this.f5270a;
    }

    public boolean f(int i4, int i5, Bundle bundle) {
        return false;
    }

    public B(Object obj) {
        this.f5270a = obj;
    }
}
