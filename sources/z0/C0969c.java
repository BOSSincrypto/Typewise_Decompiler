package z0;

import E0.s;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.text.CapsMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import u2.q;
import z0.C0967a;

/* renamed from: z0.c  reason: case insensitive filesystem */
public final class C0969c {

    /* renamed from: a  reason: collision with root package name */
    private final q f16498a;

    /* renamed from: z0.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.typewise.text.CapsMode[] r0 = ch.icoaching.typewise.text.CapsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.LOWER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.TITLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.typewise.text.CapsMode r1 = ch.icoaching.typewise.text.CapsMode.MIXED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f16499a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.C0969c.a.<clinit>():void");
        }
    }

    public C0969c(q qVar) {
        o.e(qVar, "getUniGrams");
        this.f16498a = qVar;
    }

    public final List a(String str, boolean z3, String str2, int i4) {
        String substring;
        StringBuilder sb;
        String str3;
        String sb2;
        String str4 = str;
        String str5 = str2;
        o.e(str4, "textBefore");
        o.e(str5, "language");
        String str6 = (String) s.d(str).b();
        e eVar = e.f8233a;
        eVar.a("UniGramPredictor", "prefix: '" + str6 + "'", (Throwable) null);
        ArrayList arrayList = new ArrayList();
        q qVar = this.f16498a;
        String lowerCase = str6.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        for (C0967a.C0251a aVar : (List) qVar.invoke(lowerCase, str5, Integer.valueOf(i4))) {
            String a4 = aVar.a();
            CapsMode b4 = aVar.b();
            Locale locale = Locale.ROOT;
            String lowerCase2 = a4.toLowerCase(locale);
            o.d(lowerCase2, "toLowerCase(...)");
            String lowerCase3 = str6.toLowerCase(locale);
            o.d(lowerCase3, "toLowerCase(...)");
            if (kotlin.text.o.G(lowerCase2, lowerCase3, false, 2, (Object) null)) {
                if (str6.length() == 0) {
                    e eVar2 = e.f8233a;
                    eVar2.a("UniGramPredictor", "predict() :: No partial text", (Throwable) null);
                    if (!z3 || A0.a.f4a.a(str4, str.length(), 16384) == 0) {
                        eVar2.a("UniGramPredictor", "predict() :: Considering case preference", (Throwable) null);
                        int i5 = a.f16499a[b4.ordinal()];
                        if (i5 == 1) {
                            sb = new StringBuilder();
                            str3 = "predict() :: Preference: lowercase: '";
                        } else if (i5 == 2) {
                            a4 = s.a(a4);
                            sb = new StringBuilder();
                            str3 = "predict() :: Preference: titlecase: '";
                        } else if (i5 == 3) {
                            sb = new StringBuilder();
                            str3 = "predict() :: Preference: mixedcase: '";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        sb.append(str3);
                        sb.append(a4);
                        sb.append("'");
                        sb2 = sb.toString();
                    } else {
                        a4 = s.a(a4);
                        sb2 = "predict() :: Start of sentence; ignoring case preference";
                    }
                    eVar2.a("UniGramPredictor", sb2, (Throwable) null);
                    arrayList.add(a4);
                } else {
                    e eVar3 = e.f8233a;
                    eVar3.a("UniGramPredictor", "predict() :: Partial text: '" + str6 + "'", (Throwable) null);
                    if (kotlin.text.o.G(a4, str6, false, 2, (Object) null)) {
                        eVar3.a("UniGramPredictor", "predict() :: Beginning matched; prediction: '" + a4 + "'", (Throwable) null);
                        substring = a4.substring(str6.length());
                    } else {
                        eVar3.a("UniGramPredictor", "predict() :: Beginning not matched; prediction: '" + a4 + "'", (Throwable) null);
                        String lowerCase4 = a4.toLowerCase(locale);
                        o.d(lowerCase4, "toLowerCase(...)");
                        substring = lowerCase4.substring(str6.length());
                    }
                    o.d(substring, "substring(...)");
                    arrayList.add(substring);
                }
            }
        }
        return arrayList;
    }
}
