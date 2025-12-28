package ch.icoaching.wrio.personalization.dictionary;

import android.view.inputmethod.EditorInfo;
import c.C0489b;
import ch.icoaching.typewise.text.TypewiseInputType;
import ch.icoaching.wrio.util.d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;

public final class DefaultSpecialInputTextHandler implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineDispatcher f10583a;

    /* renamed from: b  reason: collision with root package name */
    private final D f10584b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0489b f10585c;

    public DefaultSpecialInputTextHandler(CoroutineDispatcher coroutineDispatcher, D d4, C0489b bVar) {
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(d4, "serviceScope");
        o.e(bVar, "databaseHandler");
        this.f10583a = coroutineDispatcher;
        this.f10584b = d4;
        this.f10585c = bVar;
    }

    public void a(String str, EditorInfo editorInfo) {
        int i4;
        boolean z3;
        o.e(str, "text");
        o.e(editorInfo, "editorInfo");
        d dVar = new d(editorInfo);
        if (!kotlin.text.o.X(str) && dVar.c()) {
            int length = str.length() - 1;
            int i5 = 0;
            boolean z4 = false;
            while (i5 <= length) {
                if (!z4) {
                    i4 = i5;
                } else {
                    i4 = length;
                }
                if (o.f(str.charAt(i4), 32) <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z4) {
                    if (!z3) {
                        z4 = true;
                    } else {
                        i5++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            g0 unused = C0739h.d(this.f10584b, (CoroutineContext) null, (CoroutineStart) null, new DefaultSpecialInputTextHandler$removePrediction$1(this, dVar, str.subSequence(i5, length + 1).toString(), (c<? super DefaultSpecialInputTextHandler$removePrediction$1>) null), 3, (Object) null);
        }
    }

    public void b(String str, EditorInfo editorInfo) {
        String str2;
        int i4;
        boolean z3;
        o.e(str, "text");
        o.e(editorInfo, "editorInfo");
        d dVar = new d(editorInfo);
        if (!kotlin.text.o.X(str) && dVar.c()) {
            TypewiseInputType a4 = dVar.a();
            if (a4 != null) {
                str2 = a.b(a4, str);
            } else {
                str2 = null;
            }
            if (str2 != null && !kotlin.text.o.X(str2)) {
                int length = str2.length() - 1;
                int i5 = 0;
                boolean z4 = false;
                while (i5 <= length) {
                    if (!z4) {
                        i4 = i5;
                    } else {
                        i4 = length;
                    }
                    if (o.f(str2.charAt(i4), 32) <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z4) {
                        if (!z3) {
                            z4 = true;
                        } else {
                            i5++;
                        }
                    } else if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                }
                g0 unused = C0739h.d(this.f10584b, (CoroutineContext) null, (CoroutineStart) null, new DefaultSpecialInputTextHandler$insert$1(this, dVar, str2.subSequence(i5, length + 1).toString(), (c<? super DefaultSpecialInputTextHandler$insert$1>) null), 3, (Object) null);
            }
        }
    }
}
