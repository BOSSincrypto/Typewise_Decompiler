package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import B0.C0258f;
import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.autocorrection.scripts.capitalization.a;
import ch.icoaching.typewise.autocorrection.scripts.f;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public class b extends CapitalizationBase {

    /* renamed from: i  reason: collision with root package name */
    private int f8064i;

    /* renamed from: j  reason: collision with root package name */
    private final Set f8065j;

    /* renamed from: k  reason: collision with root package name */
    private final Set f8066k;

    /* renamed from: l  reason: collision with root package name */
    private final Set f8067l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(f fVar, boolean z3, boolean z4, IDictionaryRepository iDictionaryRepository, String str, Set set, Set set2, int i4) {
        super(fVar, z3, z4, iDictionaryRepository, str, set, set2);
        o.e(fVar, "triggerHelper");
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(str, "language");
        o.e(set, "dontCorrectAwayFromWords");
        this.f8064i = i4;
        this.f8065j = L.h(TextCase.LOWER, TextCase.FORCED_LOWER, TextCase.CORRECT_LOWER);
        this.f8066k = L.h(TextCase.TITLE, TextCase.ELISION_TITLE, TextCase.CORRECT_TITLE);
        this.f8067l = L.h(TextCase.UPPER, TextCase.MIXED);
    }

    static /* synthetic */ Object r(b bVar, r0.f fVar, TextCase textCase, String str, String str2, List list, c cVar) {
        TextCase textCase2;
        if (fVar.a() != 0 || fVar.c() != 0 || fVar.b() != 0) {
            int intValue = ((Number) C0718m.f0(list)).intValue();
            if (bVar.s(intValue, textCase, fVar)) {
                textCase2 = textCase;
            } else if (!bVar.f8065j.contains(textCase) && intValue == fVar.a()) {
                return new a.b(str, true, TextCase.LOWER);
            } else {
                textCase2 = null;
            }
            if (textCase2 != null && bVar.f8065j.contains(textCase2)) {
                return new a.b(str, true, textCase);
            }
            if (fVar.c() >= fVar.b() || (textCase2 != null && bVar.f8066k.contains(textCase2))) {
                return new a.b(C0258f.c(str), true, textCase);
            }
            return new a.b(fVar.d(), true, TextCase.MIXED);
        } else if (bVar.f8066k.contains(textCase)) {
            return new a.b(C0258f.c(str), true, textCase);
        } else {
            if (textCase == TextCase.MIXED) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                return new a.b(lowerCase, true, TextCase.LOWER);
            }
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase2, "toLowerCase(...)");
            return new a.b(lowerCase2, true, textCase);
        }
    }

    public Object m(r0.f fVar, TextCase textCase, String str, String str2, List list, c cVar) {
        return r(this, fVar, textCase, str, str2, list, cVar);
    }

    public final boolean s(int i4, TextCase textCase, r0.f fVar) {
        o.e(textCase, "stringCasing");
        o.e(fVar, "wordInfo");
        float max = Math.max(1.0f, ((float) (i4 * this.f8064i)) / 100.0f);
        if (!this.f8065j.contains(textCase) ? !this.f8066k.contains(textCase) ? !this.f8067l.contains(textCase) || ((float) fVar.b()) < max : ((float) fVar.c()) < max : ((float) fVar.a()) < max) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(ch.icoaching.typewise.autocorrection.scripts.f r12, boolean r13, boolean r14, ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository r15, java.lang.String r16, java.util.Set r17, java.util.Set r18, int r19, int r20, kotlin.jvm.internal.i r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r9 = r1
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0013
            r0 = 10
            r10 = r0
            goto L_0x0015
        L_0x0013:
            r10 = r19
        L_0x0015:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.capitalization.b.<init>(ch.icoaching.typewise.autocorrection.scripts.f, boolean, boolean, ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository, java.lang.String, java.util.Set, java.util.Set, int, int, kotlin.jvm.internal.i):void");
    }
}
