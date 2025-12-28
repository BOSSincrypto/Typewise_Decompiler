package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import c.C0490c;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.logging.Log;
import d2.b;
import e2.C0645a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

public abstract class f {
    /* access modifiers changed from: private */
    public static final List f(List list, int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("indexStart must be non-negative, was " + i4).toString());
        } else if (i5 >= i4) {
            int i6 = i5 - i4;
            ArrayList arrayList = new ArrayList();
            int i7 = 1;
            if (1 <= i6) {
                while (true) {
                    if (i4 < list.size()) {
                        arrayList.add(list.remove(i4));
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException(("indexEnd must be greater or equal to indexStart, was indexStart = " + i4 + ", indexEnd = " + i5).toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void g(int i4, String str, String str2, j jVar, i iVar) {
        String str3;
        int i5;
        boolean z3;
        if (jVar.f() && C0490c.c() && !new C0645a().a(str)) {
            String str4 = "";
            boolean z4 = false;
            if (str2.length() == 0) {
                str3 = str4;
            } else {
                str3 = str2.substring(0, i4);
                o.d(str3, "substring(...)");
            }
            int b02 = kotlin.text.o.b0(str3, " ", 0, false, 6, (Object) null);
            if (b02 > -1) {
                str3 = str3.substring(0, b02);
                o.d(str3, "substring(...)");
            }
            String[] strArr = (String[]) kotlin.text.o.t0(str3, new String[]{"\\s+"}, false, 0, 6, (Object) null).toArray(new String[0]);
            int length = strArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                String b4 = b.b(b.c(strArr[i6], " \n&\\+=\\/\\\\-"));
                o.d(b4, "formatMultipleApostrophe(...)");
                strArr[i6] = b4;
            }
            if (strArr.length != 0) {
                String str5 = strArr[strArr.length - 1];
                int length2 = str5.length() - 1;
                int i7 = 0;
                boolean z5 = false;
                while (i7 <= length2) {
                    if (!z5) {
                        i5 = i7;
                    } else {
                        i5 = length2;
                    }
                    if (o.f(str5.charAt(i5), 32) <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z5) {
                        if (!z3) {
                            z5 = true;
                        } else {
                            i7++;
                        }
                    } else if (!z3) {
                        break;
                    } else {
                        length2--;
                    }
                }
                str4 = str5.subSequence(i7, length2 + 1).toString();
            }
            if (TextUtils.getCapsMode(str3, kotlin.text.o.b0(str3, str4, 0, false, 6, (Object) null), 16384) != 0) {
                z4 = true;
            }
            Log.d(Log.f10572a, "DefaultInputConnectionController", "updateBiGrams() :: fullPrediction: '" + I.b(str, (Integer) null, 1, (Object) null) + "' last word: '" + str4 + '\'', (Throwable) null, 4, (Object) null);
            iVar.j(str4, str);
            iVar.e(str, z4 ^ true);
        }
    }

    /* access modifiers changed from: private */
    public static final void i(InputConnection inputConnection, int i4, String str, String str2, int i5) {
        int length = str.length() + i5;
        inputConnection.beginBatchEdit();
        inputConnection.setComposingRegion(i5, length);
        inputConnection.setComposingText(str2, (i4 - length) + 1);
        inputConnection.finishComposingText();
        int length2 = i4 + (str2.length() - str.length());
        inputConnection.setSelection(length2, length2);
        inputConnection.endBatchEdit();
    }

    /* access modifiers changed from: private */
    public static final boolean j(CharSequence charSequence, int i4, int i5) {
        if (i4 >= 0 && i4 <= charSequence.length() && i5 <= charSequence.length() && i5 >= i4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void l(InputConnection inputConnection) {
        InputConnection inputConnection2 = inputConnection;
        long j4 = (long) 1000;
        long j5 = j4;
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j4, SystemClock.elapsedRealtime() / j4, 0, 21, 0, 0, 0, 0, 6, 0));
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j5, SystemClock.elapsedRealtime() / j5, 1, 21, 0, 0, 0, 0, 6, 0));
    }

    /* access modifiers changed from: private */
    public static final void m(InputConnection inputConnection) {
        InputConnection inputConnection2 = inputConnection;
        long j4 = (long) 1000;
        long j5 = j4;
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j4, SystemClock.elapsedRealtime() / j4, 0, 22, 0, 0, 0, 0, 6, 0));
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j5, SystemClock.elapsedRealtime() / j5, 1, 22, 0, 0, 0, 0, 6, 0));
    }

    /* access modifiers changed from: private */
    public static final void n(InputConnection inputConnection) {
        InputConnection inputConnection2 = inputConnection;
        long j4 = (long) 1000;
        long j5 = j4;
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j4, SystemClock.elapsedRealtime() / j4, 0, 67, 0, 0, 0, 0, 6, 0));
        inputConnection2.sendKeyEvent(new KeyEvent(SystemClock.elapsedRealtime() / j5, SystemClock.elapsedRealtime() / j5, 1, 67, 0, 0, 0, 0, 6, 0));
    }
}
