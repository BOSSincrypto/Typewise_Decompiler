package ch.icoaching.wrio;

import android.view.View;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.keyboard.view.smartbar.e;
import ch.icoaching.wrio.prediction.c;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import ch.icoaching.wrio.ui.SwipeDirection;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlin.text.C0721a;
import l2.g;

public abstract class BaseInputMethodServiceKt {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9031a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.wrio.ui.SwipeDirection[] r0 = ch.icoaching.wrio.ui.SwipeDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.ui.SwipeDirection r1 = ch.icoaching.wrio.ui.SwipeDirection.UP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.ui.SwipeDirection r1 = ch.icoaching.wrio.ui.SwipeDirection.DOWN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9031a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.BaseInputMethodServiceKt.a.<clinit>():void");
        }
    }

    public static final String c(String str, SwipeDirection swipeDirection) {
        String str2;
        o.e(str, "<this>");
        o.e(swipeDirection, "sd");
        if (kotlin.text.o.X(str)) {
            return str;
        }
        int i4 = a.f9031a[swipeDirection.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return str;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        } else if (str.length() <= 0) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                o.d(locale, "getDefault(...)");
                str2 = C0721a.e(charAt, locale);
            } else {
                str2 = String.valueOf(charAt);
            }
            sb.append(str2);
            String substring = str.substring(1);
            o.d(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
    }

    public static final Double[] e(TutorialModeManager tutorialModeManager, b bVar) {
        int i4;
        o.e(tutorialModeManager, "tutorialManager");
        o.e(bVar, "keyboardSettings");
        Map j4 = D.j(g.a(0, Double.valueOf(0.0d)), g.a(1, Double.valueOf(0.125d)), g.a(2, Double.valueOf(0.25d)), g.a(3, Double.valueOf(0.5d)));
        if (tutorialModeManager.j()) {
            i4 = 2;
        } else {
            i4 = bVar.B();
        }
        Object obj = j4.get(Integer.valueOf(i4));
        o.b(obj);
        double doubleValue = ((Number) obj).doubleValue();
        Object obj2 = j4.get(0);
        o.b(obj2);
        return new Double[]{Double.valueOf(doubleValue), Double.valueOf(((Number) obj2).doubleValue())};
    }

    /* access modifiers changed from: private */
    public static final PredictionsResult.Candidate f(e eVar) {
        return new PredictionsResult.Candidate(eVar.l(), eVar.g(), eVar.h(), eVar.j(), PredictionsResult.Candidate.Type.valueOf(eVar.k()), PredictionsResult.Candidate.Source.valueOf(eVar.i()), eVar.e(), eVar.m());
    }

    /* access modifiers changed from: private */
    public static final e g(PredictionsResult.Candidate candidate, int i4, String str, String str2, c cVar) {
        String f4 = cVar.f(candidate.f());
        cVar.d(f4);
        if (candidate.a() < 0) {
            i4 += candidate.a();
        } else if (candidate.a() > 0) {
            i4 = candidate.a();
        }
        return new e(f4, str, candidate.c(), candidate.d(), i4, candidate.g().name(), candidate.e().name(), candidate.b(), candidate.h());
    }

    /* access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.c h(View view) {
        return kotlinx.coroutines.flow.e.b(new BaseInputMethodServiceKt$windowInsetsFlow$1(view, (kotlin.coroutines.c<? super BaseInputMethodServiceKt$windowInsetsFlow$1>) null));
    }
}
