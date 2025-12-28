package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.F;
import androidx.core.view.C0436p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import y.g;

public abstract class f extends Activity implements m, C0436p.a {
    private g mExtraDataMap = new g();
    private n mLifecycleRegistry = new n(this);

    public static class a {
    }

    private static boolean a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.hashCode();
            char c4 = 65535;
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    if (Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    return false;
                case 1:
                case 2:
                    if (Build.VERSION.SDK_INT >= 33) {
                        return true;
                    }
                    return false;
                case 3:
                    if (Build.VERSION.SDK_INT >= 29) {
                        return true;
                    }
                    return false;
                case 4:
                    if (Build.VERSION.SDK_INT >= 26) {
                        return true;
                    }
                    return false;
            }
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0436p.d(decorView, keyEvent)) {
            return C0436p.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0436p.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        F.a(this.mExtraDataMap.get(cls));
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w.e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.j(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(a aVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean shouldDumpInternalState(String[] strArr) {
        return !a(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
