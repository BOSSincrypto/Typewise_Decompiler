package ch.icoaching.wrio.util;

import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.keyboard.layout.Layer;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;

public abstract class b {
    public static final int a(EditorInfo editorInfo) {
        o.e(editorInfo, "<this>");
        if (!o.a(editorInfo.packageName, "com.google.android.apps.nexuslauncher") || editorInfo.fieldId != 2131362309 || !o.a(editorInfo.privateImeOptions, "com.google.android.inputmethod.latin.appSupportsSmartComposeAndDel,com.google.android.inputmethod.latin.canary.appSupportsSmartComposeAndDel,com.google.android.inputmethod.latin.dev.appSupportsSmartComposeAndDel")) {
            int i4 = editorInfo.imeOptions;
            if ((1073741824 & i4) != 0) {
                return 1;
            }
            if (editorInfo.actionLabel != null) {
                return editorInfo.actionId;
            }
            return i4 & 255;
        }
        Log.d(Log.f10572a, "EditorInfo Utils", "getAction() :: KB-1131 fix, ignoring EditorInfo.IME_FLAG_NO_ENTER_ACTION.", (Throwable) null, 4, (Object) null);
        return editorInfo.imeOptions & 255;
    }

    public static final boolean b(EditorInfo editorInfo) {
        o.e(editorInfo, "<this>");
        if (d(editorInfo) || (editorInfo.inputType & 4080) == 16) {
            return true;
        }
        return false;
    }

    public static final boolean c(EditorInfo editorInfo) {
        o.e(editorInfo, "<this>");
        if (2 == (editorInfo.imeOptions & 255)) {
            return true;
        }
        return false;
    }

    public static final boolean d(EditorInfo editorInfo) {
        o.e(editorInfo, "<this>");
        if (3 == (editorInfo.imeOptions & 255)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(android.view.inputmethod.EditorInfo r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.e(r6, r0)
            int r6 = r6.inputType
            r0 = r6 & 15
            r1 = 112(0x70, float:1.57E-43)
            r2 = 1
            if (r0 == r1) goto L_0x003c
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 == r1) goto L_0x003c
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 == r1) goto L_0x003c
            if (r0 == 0) goto L_0x003b
            r1 = 224(0xe0, float:3.14E-43)
            r3 = 144(0x90, float:2.02E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r2) goto L_0x0032
            r5 = 2
            if (r0 == r5) goto L_0x003c
            r5 = 3
            if (r0 == r5) goto L_0x003c
            r5 = 4
            if (r0 == r5) goto L_0x003c
            r6 = r6 & 4080(0xff0, float:5.717E-42)
            if (r6 == r4) goto L_0x003b
            if (r6 == r3) goto L_0x003b
            if (r6 == r1) goto L_0x003b
            goto L_0x003c
        L_0x0032:
            r6 = r6 & 4080(0xff0, float:5.717E-42)
            if (r6 == r4) goto L_0x003b
            if (r6 == r3) goto L_0x003b
            if (r6 == r1) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.util.b.e(android.view.inputmethod.EditorInfo):boolean");
    }

    public static final Layer f(EditorInfo editorInfo) {
        o.e(editorInfo, "<this>");
        int i4 = editorInfo.inputType & 15;
        if (i4 == 112 || i4 == 192 || i4 == 524288) {
            return Layer.LETTERS;
        }
        if (i4 == 0) {
            return Layer.LETTERS;
        }
        if (i4 == 1) {
            return Layer.LETTERS;
        }
        if (i4 == 2 || i4 == 3 || i4 == 4) {
            return Layer.SYMBOLS;
        }
        return Layer.LETTERS;
    }
}
