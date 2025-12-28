package ch.icoaching.wrio.keyboard;

public abstract class J {
    /* access modifiers changed from: private */
    public static final WindowSizeClass b(int i4) {
        if (i4 < 600) {
            return WindowSizeClass.COMPACT;
        }
        if (i4 < 840) {
            return WindowSizeClass.MEDIUM;
        }
        return WindowSizeClass.EXPANDED;
    }
}
