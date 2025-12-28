package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public abstract class C {

    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i4) {
            accessibilityRecord.setMaxScrollX(i4);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i4) {
            accessibilityRecord.setMaxScrollY(i4);
        }
    }

    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i4) {
            accessibilityRecord.setSource(view, i4);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i4) {
        a.c(accessibilityRecord, i4);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i4) {
        a.d(accessibilityRecord, i4);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i4) {
        b.a(accessibilityRecord, view, i4);
    }
}
