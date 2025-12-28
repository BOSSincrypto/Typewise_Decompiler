package ch.icoaching.wrio.theming;

import android.content.res.Configuration;

public abstract class c {
    /* access modifiers changed from: private */
    public static final boolean b(Configuration configuration) {
        if ((configuration.uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
