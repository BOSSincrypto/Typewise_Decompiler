package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.view.accessibility.c  reason: case insensitive filesystem */
public abstract class C0406c {

    /* renamed from: androidx.core.view.accessibility.c$a */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C0082c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C0082c(bVar));
        }
    }

    /* renamed from: androidx.core.view.accessibility.c$b */
    public interface b {
        void onTouchExplorationStateChanged(boolean z3);
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    private static final class C0082c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final b f5275a;

        C0082c(b bVar) {
            this.f5275a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0082c)) {
                return false;
            }
            return this.f5275a.equals(((C0082c) obj).f5275a);
        }

        public int hashCode() {
            return this.f5275a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z3) {
            this.f5275a.onTouchExplorationStateChanged(z3);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
